package javaPrograms;

import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int n) {
		
		
		int fact=1;
		for(int i=n;i>=1;i--){
			fact = fact*i;
		}
		
		return fact;
	}

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			if(n<0) {
				System.out.println("Invalid NUmber");
				
			}
			else {
			int fact = factorial(n);
			System.out.println("Factorial = "+fact);
			}
			
		}
		

	}

}
