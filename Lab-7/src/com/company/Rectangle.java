package com.company;

public class Rectangle extends Figure {

    private double w;
    private double l;

    private double area;
    private double perimeter;

    Rectangle(double w, double l) {
        this.w = w;
        this.l = l;
        this.area = this.w * this.l;
        this.perimeter = 2*(this.w+this.l);
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }
}
