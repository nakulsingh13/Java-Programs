package javaPrograms;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// Prime number
		
		int n,m,flag=0;
		
		System.out.println("Enter the number");
		
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
		}
		
		m=n/2;
		
		for(int i=2;i<m;i++)
		{
			if(n%i==0) {
				
				flag=1;
				break;
			}
		}
		
		if(flag==0) {
			System.out.println("THIS NUMBER IS PRIME NUMBER");
		}
		else {
			System.out.println("THIS NUMBER IS NOT PRIME NUMBER");
		}

	}

}
