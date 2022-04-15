package javaPrograms;

import java.util.Scanner;

public class Function {
	
	public static void printMyName(String name) {
		System.out.println(name);
		return;
	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			String name = sc.next();
			
			printMyName(name);
		}
	}

}
