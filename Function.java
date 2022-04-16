package javaPrograms;

import java.util.Scanner;

public class Function {
	
//	public static void printMyName(String name) {
//		System.out.println(name);
//		return;
//	}
	
	public static int calculateSum(int a, int b) {
		
		int sum = a + b;
		return sum;
		
		
	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			
			int sum = calculateSum(a,b);
			System.out.println("Sum of two numbers is "+sum);
		}
	}

}
