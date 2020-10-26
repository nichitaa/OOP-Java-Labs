package com.company;

public class B extends A {

    protected String b;

    // constructor containing object A instance and the b value
    B(A a, String b) {
        super(a);
        this.b = b;
    }

    // constructor containing objects A and B
    B( A a, B b ) {
        super(a);
        this.b = b.b;
    }

    public void getInstances() {
        super.getInstances();
        System.out.print(b + " ");
    }

}
