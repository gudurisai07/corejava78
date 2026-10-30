
package com.conditionalstatements;

import java.util.Scanner;

public class Conditional9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bill = 0;
        int rate = 0;

        System.out.println("Enter Connection Type:");
        System.out.println("1. Domestic");
        System.out.println("2. Commercial");

        String connection = sc.next();

        System.out.println("Enter Units:");
        int units = sc.nextInt();

        if (units < 0) {
            System.out.println("Invalid Units");
        } else {

            switch (connection) {

                case "1" -> {
                    if (units <= 100) {
                        rate = 2;
                    } else if(units<=300) {
                        rate = 3;
                    }else {
                    }
                  
                    System.out.println("-------------------Connection Type: Domestic-------------------");
                }

                case "2" -> {
                    if (units <= 100) {
                        rate = 4;
                    } else if (units <= 300) {
                        rate = 6;
                    } else {
                        rate = 8;
                    }
                    System.out.println("-------------------Connection Type: Commercial-----------------------------------");
                }

                default -> {
                    System.out.println("Invalid Connection Type");
                    sc.close();
                    
                }
            }

            bill = units * rate;

            System.out.println("Units Consumed: " + units);
            System.out.println("Rate Per Unit: " + rate);
            System.out.println("Total Electricity Bill: " + bill);
        }

        sc.close();
    }
}
