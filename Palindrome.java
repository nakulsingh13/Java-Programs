package javaPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  temp, rem, rev = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		temp = num;
		while(temp!=0)
		{
			rem = temp % 10;
			rev = rev * 10 +rem;
			temp/=10;
		}
		
		if(num == rev)
		{
			System.out.println("This is a palindrome number");
		}
		else {
			System.out.println("This is not a palindrome number");
		}
		

	}

}
