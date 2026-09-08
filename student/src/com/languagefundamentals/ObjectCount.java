package com.languagefundamentals;

public class ObjectCount {

    static int count = 0;

    static {
        System.out.println("Static Block Executed");
    }
    {
        count++;
        System.out.println("Instance Block Executed");
    }
    public static void main(String[] args) {

        ObjectCount obj1 = new ObjectCount();
        ObjectCount obj2 = new ObjectCount();
        ObjectCount obj3 = new ObjectCount();
      
        System.out.println("Number of objects created: " + count);
    }
}