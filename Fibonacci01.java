package EveryoneCanCode;

import java.util.*;

public class Fibonacci01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	 	System.out.println(getFibonacciSeries(num));
	}
	public static String getFibonacciSeries(int num) {
		if(num >= 1 && num <= 40) {
			int var1 = 0;
			int var2 = 1;
			int var3;
			String str = "0,1,";

			if(num == 1) {
				str = "0";
			}

			else if(num == 2) {
				str = "0,1";
			}

			else {
				for(int i=2; i<num; i++) {
						var3 = var1 + var2;
						if(i == num-1) {
							str += var3;
						}
						else {
							str += var3 + ",";
						}
						var1 = var2;
						var2 = var3;
					}
			}
			return str;
		}

		return "-1";
    }
}
