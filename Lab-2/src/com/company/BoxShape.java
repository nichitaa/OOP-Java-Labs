package com.company;

public class BoxShape {
    public float height;
    public float width;
    public float lenght;

    // with 3 params
    public BoxShape(float h, float w, float l) {
        height = h;
        width = w;
        lenght = l;
    }

    // default value 1
    public BoxShape() {
        height = 1;
        width = 1;
        lenght = 1;
    }

    // same value
    public BoxShape(int val) {
        height = val;
        width = val;
        lenght = val;
    }

    // task 3:
    public float Volume() {
        return this.lenght *this.width*this.height;
    }

    public float Surface() {
        return 2*(this.height*this.width) + 2*(this.height*this.lenght) + 2*(this.width*this.lenght);
    }
}
