package com.conditionalstatements;

import java.util.Scanner;

public class Conditional10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a marks");
		int marks=sc.nextInt();
		
		String grade = switch(marks/10) {
		case 9,10 ->{
			System.out.println("marks kosam puttina janam ");
			yield "A";
		}
		case 8 ->{
			System.out.println("marks kosam puttina janam ");
			yield "B";
		}
		case 7->{
			System.out.println("marks kosam puttina janam ");
			yield "C";
		}
		case 6 ->{
			System.out.println("marks kosam puttina janam ");
			yield "D";
		}
		case 5 ->{
			System.out.println("marks kosam puttina janam ");
			yield "P";
		}
		case 4,3,2,1,0 ->{
			System.out.println("pass avadinki try cheyse  person's");
			yield "F";
		}
		default ->"invaild";
		
		
		};
		System.out.println("grade is  a : "+grade);

	}

}
