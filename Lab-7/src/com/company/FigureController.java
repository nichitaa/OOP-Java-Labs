package com.company;

import java.util.ArrayList;

public class FigureController {

    private ArrayList<Figure> figures;

    // constructor with arrayList of objects of type Figure
    FigureController(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    public double getMaxArea() {
        double maxArea = this.figures.get(0).getArea(); // store max area value
        int figureIdx = 0;  // store the object with max area value
        // looping through each object and finding the one with max area value
        for (int i = 0; i < this.figures.size(); i++) {
            if (maxArea < this.figures.get(i).getArea()) {
                maxArea = this.figures.get(i).getArea();
                figureIdx = i;
            }
        }
        // if the object's class with max area is an anonymous class
        if (this.figures.get(figureIdx).getClass().isAnonymousClass()) {
            // use the its own method to display the class name
            System.out.println("Figure with max Area is a object of anonymous class: " + this.figures.get(figureIdx).getAnonymousClassName());
        } else {
            // else: use the java inbuilt methods to display the class names
            System.out.println("Figure with max Area is a object of type: " + this.figures.get(figureIdx).getClass().getSimpleName());
        }
        // return the value for max area
        return maxArea;
    }

    // similar with the previous one, only looking searching for max perimeter
    public double getMaxPerimeter() {
        double maxPerimeter = this.figures.get(0).getPerimeter();
        int figureIdx = 0;
        for (int i = 0; i < this.figures.size(); i++) {
            if (maxPerimeter < this.figures.get(i).getPerimeter()) {
                maxPerimeter = this.figures.get(i).getPerimeter();
                figureIdx = i;
            }
        }
        if (this.figures.get(figureIdx).getClass().isAnonymousClass()) {
            System.out.println("Figure with max Perimeter is a object of anonymous class: " + this.figures.get(figureIdx).getAnonymousClassName());
        } else {
            System.out.println("Figure with max Perimeter: " + this.figures.get(figureIdx).getClass().getSimpleName());
        }
        return maxPerimeter;
    }
}
