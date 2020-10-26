package com.company;

public class I extends H {

    protected String i;

    I(A a, B b, C c, D d, E e, F f, G g, H h, String i) {
        super(a, b, c, d, e, f, g, h);
        this.i = i;
    }

    I(A a, B b, C c, D d, E e, F f, G g, H h, I i) {
        super(a, b, c, d, e, f, g, h);
        this.i = i.i;
    }

    public void getInstances() {
        super.getInstances();
        System.out.print(this.i + " ");
    }
}
