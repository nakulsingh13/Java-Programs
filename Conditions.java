package javaPrograms;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
//			if(age>18)
//			{
//				System.out.println("Adult");
//			}
//			else {
//				System.out.println("Not Adult");
//			}
			if(n%2==0) {
				System.out.println("NUMBER IS EVEN");
			}
			else {
				System.out.println("NUMBER IS ODD");
			}
		}

	}

}
