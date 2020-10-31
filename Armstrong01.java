import java.util.*;
import java.lang.Math;

public class Armstrong01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(generateArmstrongNums(num1, num2));
    }

    public static String generateArmstrongNums(int start, int limit) {
        if(start < 1 || limit < 1) {
            return "-1";
        }
        if(start >= limit) {
            return "-2";
        }

        String str = "";
        boolean count = true;

        for(int i = start; i<= limit; i++) {
            if(isArmstrong(i) == true) {
                // System.out.println(i + "IN generateArmstrongNums");
                if(count == true) {
                    str += i;
                }
                else {
                    str += "," + i;
                }
                count = false;
            }
        }

        if(str == "") {
            return "-3";
        }
        
        return str;
    }

    public static boolean isArmstrong(int num) {
        if(num == sumOfPowersOfDigits(num)) {
            // System.out.println(num + "IN isArmstrong");
            return true;
        }
        return false;
    }

    public static int sumOfPowersOfDigits(int n) {
        int sum = 0;
        int[] digitsArray = getDigits(n);

        for(int i=0; i<digitsArray.length-1; i++) {
            sum += power(digitsArray[i], digitsArray.length-1);
        }

        // System.out.println(sum + "IN sumOfPowersOfDigits");

        return sum;
    }

    public static int[] getDigits(int n) {
        int count = 0;
        int num = n;

        while(num != 0) {
            num = num/10;
            count++;
        }

        int[] digitArr = new int[count+1];
        int i=0;
        while(n != 0) {
            digitArr[i] = n%10;
            n = n/10;
            i++;
        }

        // System.out.println(digitArr + "IN getDigits");

        return digitArr;
    }

    public static int power(int d, int p) {
        // System.out.println(d + "  " + p + "  " + (int)Math.pow(d,p) + "  IN power");
        return (int)Math.pow(d,p);
    }
}
