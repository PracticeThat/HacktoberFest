import java.util.*;

public class TypeOfNumber01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = sumOfProperDivisors(num);
        if (res == 0)
            System.out.println("Perfect Number");
        else if (res == 1)
            System.out.println("Abundant Number");
        else if (res == -1)
            System.out.println("Deficient Number");
        else
            System.out.println("Please Enter Positive Number");
    }

    public static int sumOfProperDivisors(int num) {
        if(num < 0) {
            return -2;
        }
        if(num == 0) {
            return -3;
        }
        int sum = 0;

        for(int i=1; i<num; i++) {
            if(num%i == 0) {
                sum += i;
                // System.out.println("I : " + i + "\tSum : " + sum);
            }
        }

        if(sum == num) {
            return 0;
        }
        if(sum > num) {
            return 1;
        }

        return -1;
    }
}
