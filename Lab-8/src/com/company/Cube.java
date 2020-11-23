package com.company;

public class Cube implements GeometricBody {

    private double a;
    private double surface;
    private double volume;

    Cube(double a) {
        this.a = a;
        this.surface = (this.a * this.a) * 6;
        this.volume = Math.pow(this.a, 3);
    }

    @Override
    public double getSurface() { return this.surface; }

    @Override
    public double getVolume() { return this.volume; }

}
