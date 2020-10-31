// package EveryoneCanCode;

import java.util.*;

public class StarPyramid01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print(starPattern(num));
    }

	public static String starPattern(int rows) {

        if(rows <= 0) {
            return "-1";
        }

        int space = rows;
        String str = "";

        for(int i = 1; i <= rows; i++) {
            for(int j = 0; j < space-1; j++) {
                str += " ";
            }

            for(int k = 0; k <= i + (i-1); k++) {
                if(k%2 == 0 || k == 0) {
                    str += " ";
                }
                else {
                    str += "*";
                }
            }

            space--;
            str += "\n";
        }

        return str;
	}
}
