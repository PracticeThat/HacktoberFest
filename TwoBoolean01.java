package EveryoneCanCode;

import java.util.*;

public class TwoBoolean01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.nextBoolean();
        boolean b2 = sc.nextBoolean();
        boolean b3 = sc.nextBoolean();

        System.out.println(countBoolean(b1, b2, b3));
    }

    public static boolean countBoolean(boolean b1, boolean b2, boolean b3) {
        int count = 0;

        if(b1 == true) {
            count++;
        }
        if(b2 == true) {
            count++;
        }
        if(b3 == true) {
            count++;
        }

        if(count >= 2) {
            return true;
        }
        return false;
    }
}
