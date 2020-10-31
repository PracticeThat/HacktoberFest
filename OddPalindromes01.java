//package EveryoneCanCode;

import java.util.*;

public class OddPalindromes01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(generateOddPalindromes(num1, num2));
    }

    public static String generateOddPalindromes(int start, int limit) {

        if(start <= 0 || limit <= 0) {
            return "-1";
        }

        else if(start >= limit) {
            return "-2";
        }

        String str = "";
        int count = 0;

        for(int i = start; i <= limit; i++) {
            if(isPalindrome(i)) {
                if(count == 0) {
                    str += i;
                    count++;
                }
                else {
                    str += "," + i;
                }
            }
        }

        if(str == "") {
            return "-3";
        }

        return str;
    }

    public static boolean isPalindrome(int num) {
        if(reverse(num) == num) {
            if(isAllDigitsOdd(num)) {
                return true;
            }
        }
        return false;
    }

    public static int reverse(int num) {
        int revNumber = 0;

        while(num != 0) {
            revNumber = revNumber*10;
            revNumber = revNumber + num%10;
            num = num/10;
        }

        return revNumber;
    }

    public static boolean isAllDigitsOdd(int num) {
        int evenNumber = 0;

        if(num%2 == 0) {
            return false;
        }

        while(num != 0) {
            evenNumber = num%10;
            num = num/10;

            if(evenNumber%2 == 0 && evenNumber != 0) {
                return false;
            }
        }

        return true;
    }
}
