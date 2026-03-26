package com.test.voter;

import java.util.Scanner;

public class VoterDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");
		
		int age = sc.nextInt();
		
		ValidateAge va = new ValidateAge();
		
		va.checkAge(age);
		 
		 sc.close();
		
		
	}
}
