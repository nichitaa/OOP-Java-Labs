package com.company;

public class Sphere implements GeometricBody {

    private double r;
    private double surface;
    private double volume;

    Sphere(double r) {
        this.r = r;
        this.surface = 4 * Math.PI * (this.r * this.r);
        this.volume = ((double)4/(double)3) * Math.PI * Math.pow(this.r, 3);
    }

    @Override
    public double getSurface() { return this.surface; }

    @Override
    public double getVolume() { return this.volume; }

}
