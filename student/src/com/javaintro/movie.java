package com.javaintro;

public class movie {
	
	static String theatrename="sandhya";
	static String theatrelocation ="hyderabad";
	
	double  moviebudget=2000;
	String moviename="irumudi";
	 String releasedate="21-08-2026";
	 
	 
	 public static void main(String[] args) {

	        
	        movie m1 = new movie();
	        
	        m1.moviename = "RRR";
	        m1.moviebudget = 550;
	        m1.releasedate = "25-03-2022";
	        
	        
	        System.out.println("Theatre Name: " + theatrename);
	        System.out.println("Theatre Location: " + theatrelocation);
	        
	        System.out.println("Movie Name: " + m1.moviename);
	        System.out.println("Movie Budget: " + m1.moviebudget + " Crores");
	        System.out.println("Release Date: " + m1.releasedate);

	        movie m2 = new movie();
	        m2.moviename = "Pushpa";
	        m2.moviebudget = 200;
	        m2.releasedate = "17-12-2021";
	        
	        System.out.println("Theatre Name: " + theatrename);
	        System.out.println("Theatre Location: " + theatrelocation);

	        System.out.println("Movie Name: " + m1.moviename);
	        System.out.println("Movie Budget: " + m1.moviebudget + " Crores");
	        System.out.println("Release Date: " + m1.releasedate);

	       
	        
	        
	        System.out.println("Theatre Name: " + theatrename);
	        System.out.println("Theatre Location: " + theatrelocation);

	        System.out.println("Movie Name: " + m1.moviename);
	        System.out.println("Movie Budget: " + m1.moviebudget + " Crores");
	        System.out.println("Release Date: " + m1.releasedate);

	        movie m4 = new movie();
	        m4.moviename = "Salaar";
	        m4.moviebudget = 270;
	        m4.releasedate = "22-12-2023";
	        
	        System.out.println("Theatre Name: " + theatrename);
	        System.out.println("Theatre Location: " + theatrelocation);

	        System.out.println("Movie Name: " + m1.moviename);
	        System.out.println("Movie Budget: " + m1.moviebudget + " Crores");
	        System.out.println("Release Date: " + m1.releasedate);

	        movie m5 = new movie();
	        movie.theatrename="pvr";
	        movie.theatrelocation="west godavari";
	        
	        
	        m5.moviename = "Devara";
	        m5.moviebudget = 300;
	        m5.releasedate = "27-09-2024";

	        // Printing details
	        System.out.println("Theatre Name: " +theatrename);
	        System.out.println("Theatre Location: " + theatrelocation);

	        System.out.println("Movie Name: " + m1.moviename);
	        System.out.println("Movie Budget: " + m1.moviebudget + " Crores");
	        System.out.println("Release Date: " + m1.releasedate);
	 }
}

	       