
// methods with  return a value 

package com.methods;

public class methods3 {

    int addition(int a, int b) {

        return a + b;
    }

    public static void main(String[] args) {

        methods3 t = new methods3();

        int result = t.addition(100, 200);

        System.out.println("Result = " + result);
    }
}

