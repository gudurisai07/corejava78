package com.daliypartice;

public class evenodd {

    int i = 123456789;
    int evencount = 0;
    int oddcount = 0;

    void display() {

        while (i > 0) {

            int x = i % 10;

            if (x % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }

            i = i / 10;
        }

        System.out.println("How many even numbers: " + evencount);
        System.out.println("How many odd numbers: " + oddcount);
    }

    public static void main(String[] args) {

        evenodd s = new evenodd();
        s.display();
    }
}