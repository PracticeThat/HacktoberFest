package EveryoneCanCode;

import java.util.*;

public class SumOfDigits01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(getSumOfDigits(num));
    }

    public static int getSumOfDigits(int num)	{
        int sum = 0;
        if(num < 10 || num > 99) {
            // System.out.println("Run Successful");
		    return 0;
        }
        else {
            while(num!=0) {
                sum += num%10;
                // System.out.println("Sum : " + sum);
                num = num/10;
                // System.out.println("Num : " + num);
            }
            // System.out.println("Runned Successful");
            return sum;
        }
    }
}
