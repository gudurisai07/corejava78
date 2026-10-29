package com.conditionalstatements;

import java.util.Scanner;

public class Conditional6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("your  are  indian   citizen say ture or false  ");
		Boolean indiancitizen = sc.nextBoolean();
		System.out.println("do want  voter id are not say true  or  false");
		Boolean voterid = sc.nextBoolean();
		
		
		if (age<0) {
			System.out.println("invalid age ");
		}else if(age <=18) {
			System.out.println("if you not Eligible for vote");
		}else if(!indiancitizen) {
			System.out.println("Not Eligible to vote ");
		}else if (!voterid) {
			System.out.println("voter id reqiured ");
		}else {
			System.out.println("eligible to vote ");		
		}
	}

}
