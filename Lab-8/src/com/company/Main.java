/***
 * Pasecinic Nichita
 * FAF - 192
 * 23.11.2020
***/

package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cube cube = new Cube(3);
        Sphere sphere = new Sphere(4);
        Parallelepiped piped = new Parallelepiped(10,31,4);

        System.out.println("Cube volume: " + cube.getVolume() + ", surface: " + cube.getSurface());
        System.out.println("Sphere volume: " + sphere.getVolume() + ", surface: " + sphere.getSurface());
        System.out.println("Parallelepiped volume: " + piped.getVolume() + ", surface: " + piped.getSurface() + "\n");

        ArrayList<GeometricBody> figures = new ArrayList<GeometricBody>();
        figures.add(cube);
        figures.add(sphere);
        figures.add(piped);

        GeometricBodyController figuresController = new GeometricBodyController(figures);

        System.out.println("Object with max surface -> " + figuresController.maxSurface().getClass().getSimpleName() + ", surface: " + figuresController.maxSurface().getSurface() );
        System.out.println("Object with max volume -> " + figuresController.maxVolume().getClass().getSimpleName() + ", volume: " + figuresController.maxVolume().getVolume() );

        // after changing the abstract class to the interface, I've changed the "extends" from child classes to "implements"
        // and I've deleted the public access modifiers from the methods of my interface ( GeometricBodyContainer )
    }
}
