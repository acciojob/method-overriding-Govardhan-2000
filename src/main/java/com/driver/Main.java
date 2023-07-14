package com.driver;

class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();

//        // Calling method meth from class A
//        String result1 = obj.meth();
//        System.out.println("Result 1: " + result1);

        // Calling overridden method meth from class B
        String result2 = obj.meth();
        System.out.println( result2);
    }
}
