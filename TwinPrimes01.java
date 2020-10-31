import java.util.*;

public class TwinPrimes01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(twinPrimes(num1, num2));
    }

    public static String twinPrimes(int start, int limit) {
        if(start < 1 || limit < 1) {
            return "-1";
        }
        if(start >= limit) {
            return "-2";
        }

        String str = "";
        String subStr = "";
        boolean flag = true;
        for(int i = start; i <= limit; i++) {
            if(isPrime(i) && isPrime(i + 2)) {
                subStr += i + ":" + (i+2);
                // System.out.println(subStr);

                if(flag == true) {
                    str += subStr;
                    flag = false;
                }
                else {
                    str += "," + subStr;
                }
            }
            subStr = "";
        }

        if(str == "") {
            return "-3";
        }
        return str;
    }

    public static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }

        int count = 0;
        for(int i=2; i<num ; i++) {
            if(num%i == 0) {
                count++;
            }
        }
        if(count >= 1) {
            return false;
        }
        return true;
    }
}
