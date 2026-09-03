package com.com.javaintro.A.B;

public class garbagecollectors{
	
    static class A {
        B b;
    }
    static class B {
        A a;
    }
    public static void main(String[] args) {

        // 1. Nullify
        String s = new String("Hello");
        s = null;

        // 2. Reassign
        Integer num = new Integer(10);
        num = new Integer(20);

        // 3. Anonymous object
        new String("Temp").length();

        // 4. Out of scope
        {
            Object temp = new Object();
        }

        // 5. Island of isolation
        A aObj = new A();
        B bObj = new B();

        aObj.b = bObj;
        bObj.a = aObj;

        aObj = null;
        bObj = null;

        System.gc();

        System.out.println("Garbage collection demo executed.");
    }
}
