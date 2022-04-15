package javaPrograms;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			int sum = 0;
			
			for(int i =1; i<=10;i++) {
				System.out.println(n+"*"+i+"="+n*i);
			}
			
			
		}

	}

}
