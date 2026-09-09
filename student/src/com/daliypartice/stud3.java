package com.daliypartice;

public class stud3 {
	static int count=0;
	 stud3(){
		count++;
		
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stud3 s1=new stud3();
		stud3 s2 = new stud3();
		stud3 s3 = new stud3();
		
		System.out.println("number of object created : "+count);

	}

}
