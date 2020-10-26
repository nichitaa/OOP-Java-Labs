package com.company;

public class G extends F {

    protected String g;

    G(A a, B b, C c, D d, E e, F f, String g) {
        super(a, b, c, d, e, f);
        this.g = g;
    }

    G(A a, B b, C c, D d, E e, F f, G g) {
        super(a, b, c, d, e, f);
        this.g = g.g;
    }

    public void getInstances() {
        super.getInstances();
        System.out.print(this.g + " ");
    }
}
