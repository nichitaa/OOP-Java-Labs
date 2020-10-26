package com.company;

public class J extends I {

    protected String j;

    J(A a, B b, C c, D d, E e, F f, G g, H h, I i, String j) {
        super(a, b, c, d, e, f, g, h, i);
        this.j = j;
    }

    J(A a, B b, C c, D d, E e, F f, G g, H h, I i, J j) {
        super(a, b, c, d, e, f, g, h, i);
        this.j = j.j;
    }

    public void getInstances() {
        super.getInstances();
        System.out.print(this.j + " ");
    }

    public void printXname() {
        x.getXname();
    }
}
