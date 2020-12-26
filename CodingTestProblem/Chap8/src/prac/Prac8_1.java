package prac;

import java.util.Scanner;

public class Prac8_1 {
	public static int[] d = new int[30001];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		for (int i = 2; i <= x; i++) {
	         d[i] = d[i - 1] + 1;
	         if (i % 2 == 0) d[i] = Math.min(d[i], d[i / 2] + 1);
	            
	         if (i % 3 == 0) d[i] = Math.min(d[i], d[i / 3] + 1);
	         
	         if (i % 5 == 0) d[i] = Math.min(d[i], d[i / 5] + 1);
	    }

	    System.out.println(d[x]);
	}
}
