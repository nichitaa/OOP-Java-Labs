package com.company;

public class A {
    protected String a;
    protected X x = new X("xxx-change-in-A");

    // constructor with string and object of type X
    A(String a, X x) {
        this.x = x;
        this.a = a;
    }

    // constructor for the classes which are being extended with class A
    A(A a) {
        this.a = a.a;
        this.x = a.x;
    }

    // function to print the value for a
    public void getInstances() {
        System.out.print(this.a + " ");
    }
}
