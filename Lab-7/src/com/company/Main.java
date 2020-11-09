/**
 * Pasecinic Nichita
 * FAF - 192
 * 09.11.2020
**/

package com.company;

import java.util.ArrayList;

class Circle extends Figure {
    public double getArea() { return 0; }
    public double getPerimeter() { return 0; }
}

public class Main {

    public static void main(String[] args) {
	    Square square = new Square(2);
	    Triangle triangle = new Triangle(3,2,3);
	    Rectangle rectangle = new Rectangle(2,4);

	    // arrayList with objects of type Figure
	    ArrayList<Figure> figures = new ArrayList<Figure>();
	    figures.add(square);
	    figures.add(triangle);
	    figures.add(rectangle);
	    // controller without circle class
	    FigureController figuresController = new FigureController(figures);

        System.out.println("Square Area: " + square.getArea() + " Square Perimeter: " + square.getPerimeter());
        System.out.println("Triangle Area: " + triangle.getArea() + " Triangle Perimeter: " + triangle.getPerimeter());
        System.out.println("Rectangle Area: " + rectangle.getArea() + " Rectangle Perimeter: " + rectangle.getPerimeter() + "\n");

        System.out.println("Max Area Value: " + figuresController.getMaxArea());
        System.out.println("Max Perimeter Value: " + figuresController.getMaxPerimeter() + "\n");


        // anonymous class circle
        Circle circle  = new Circle() {
            private double radius = 20;
            private double area = Math.PI * (this.radius * this.radius);
            private double perimeter = 2 * Math.PI * this.radius;
            public double getArea() {
                return this.area;
            }
            public double getPerimeter() {
                return this.perimeter;
            }
            // to get the class name in case that this object has the maxArea or maxPerimeter
            public String getAnonymousClassName() {
                return "Circle";
            }
        };

        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea() + "\n");

        // adding the circle to the arrayList figures
        figures.add(circle);
        // new object of class FigureController, now containing an arrayList with anonymous class Circle and previous objects
        FigureController figuresControllerWithCircle = new FigureController(figures);
        System.out.println("Max Area Value: " + figuresControllerWithCircle.getMaxArea());
        System.out.println("Max Perimeter Value: " + figuresControllerWithCircle.getMaxPerimeter());

/**
        Output:
        Square Area: 4.0 Square Perimeter: 8.0
        Triangle Area: 2.8284271247461903 Triangle Perimeter: 8.0
        Rectangle Area: 8.0 Rectangle Perimeter: 12.0

        Figure with max Area is a object of type: Rectangle
        Max Area Value: 8.0
        Figure with max Perimeter: Rectangle
        Max Perimeter Value: 12.0

        Circle Perimeter: 125.66370614359172
        Circle Area: 1256.6370614359173

        Figure with max Area is a object of anonymous class: Circle
        Max Area Value: 1256.6370614359173
        Figure with max Perimeter is a object of anonymous class: Circle
        Max Perimeter Value: 125.66370614359172

        Process finished with exit code 0
 **/

    }
}
