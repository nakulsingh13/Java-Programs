package javaPrograms;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// Prime number
		
		int n,m=0,flag=0;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		m=n/2;
		
		for(int i=2;i<m;i++)
		{
			if(n%i==0) {
				
				flag=1;
				break;
			}
		}
		
		if(flag==0) {
			System.out.println("PRIME NUMBER");
		}
		else {
			System.out.println("NOT PRIME");
		}

	}

}
