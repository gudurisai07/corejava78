package com.conditionalstatements;

import java.util.Scanner;

public class Conditional1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter our Age : ");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("if  we Eligible for  vote ");
		}else {
			System.out.println("if  we  not Eligible for  vote ");
		}
	}

}
