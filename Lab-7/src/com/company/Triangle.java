package com.company;

public class Triangle extends Figure {

    private double a;
    private double b;
    private double c;

    private double area;
    private double perimeter;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.perimeter = this.a + this.b + this.c;
        double p = (this.a + this.b + this.c) / 2;
        this.area = Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }
}
