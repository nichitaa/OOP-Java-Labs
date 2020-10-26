package com.company;

public class F extends E {

    protected String f;

    F(A a, B b, C c, D d, E e, String f) {
        super(a, b, c, d, e);
        this.f = f;
    }

    F(A a, B b, C c, D d, E e, F f) {
        super(a, b, c, d, e);
        this.f = f.f;
    }

    public void getInstances() {
        super.getInstances();
        System.out.print(this.f + " ");
    }
}
