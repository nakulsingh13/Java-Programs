package javaPrograms;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// Sum of two number
		
		int a,b,sum=0;
		
		try (Scanner sc = new Scanner(System.in)) {
			a = sc.nextInt();
			b = sc.nextInt();
		}
		
		sum=a+b;
		
		System.out.println("Sum of a and b Number = "+sum);

	}

}
