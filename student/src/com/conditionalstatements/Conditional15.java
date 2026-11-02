package com.conditionalstatements;
import java.util.Scanner;
//WAP  to print factor of given number  ..?
//input : 6 -> 1,2,3,6
//output : 1,2,3,6
//input:24 --> 1,2,3,4,6,8,12,24
public class Conditional15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		findfactory(n);	
	}
	static void findfactory(int n){
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
			System.out.println(i + "  "+"Factors");
			}
		}
		
	}

}
