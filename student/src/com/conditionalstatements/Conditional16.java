package com.conditionalstatements;

import java.util.Scanner;

public class Conditional16 {
    //WAP  to print factor of given number is perfect or not ..?
    // input : 6
	//factors -> 6  -->1+2+3 = 6
	//sum of the factors is  equal to the given numbers excluding .
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number : ");
		int n=sc.nextInt();
	
	boolean status = isperfect(n);
	
		
		if(status) {
			System.out.println("the given number is prefect number");
		}else {
			System.out.println("the given number is  not perfect number ");
		}	
	}
static boolean isperfect(int n) {
	 boolean status = false;
	 int sum=0;
	 for(int i =1; i<=n/2;i++) {
		 if(n%i==0) {
			 sum=sum+i; 
		 }
		 if(sum==n){
			 status=true; 
		 } 
	 }	 
	return status;	
}
}
