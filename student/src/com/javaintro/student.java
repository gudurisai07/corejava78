package com.javaintro;

public class student {
	
	static  int collegeid=101;
	static String collegename="srkr";
	int studentid;
	String studentname;
	int studentmarks;
	
	student(){
		System.out.println("heloo");
	}
		
	public static void main(String[] args) {
		student st = new student();
		// TODO Auto-generated method stub
		student.collegeid=102;
		student.collegename="swarnandhra";
		
			
		
		st.studentid =1;
		st.studentname="sai";
		st.studentmarks=100;
		System.out.println("collegeid="+collegeid);
		System.out.println("collegename="+collegename);
		System.out.println("studentid="+st.studentid);
		System.out.println("studentname="+st.studentname);
		System.out.println("studentmarks="+st.studentmarks);
	
	
	
student st1 = new student();

// TODO Auto-generated method stub
student.collegeid=101;
student.collegename="abcd";


st1.studentid =1;
st1.studentname="sai";
st1.studentmarks=100;


System.out.println("collegeid="+collegeid);
System.out.println("collegename="+collegename);
System.out.println("studentid="+st1.studentid);
System.out.println("studentname="+st1.studentname);
System.out.println("studentmarks="+st1.studentmarks);

student st2 = new student();
//TODO Auto-generated method stub
student.collegeid=103;
student.collegename="DNR";



st2.studentid =2;
st2.studentname="satya";
st2.studentmarks=99;


System.out.println("collegeid="+collegeid);
System.out.println("collegename="+collegename);
System.out.println("studentid="+st2.studentid);
System.out.println("studentname="+st2.studentname);
System.out.println("studentmarks="+st2.studentmarks);



}

}

