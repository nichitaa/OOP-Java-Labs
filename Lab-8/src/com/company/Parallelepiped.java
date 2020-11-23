package com.company;

public class Parallelepiped implements GeometricBody {

    private double h;
    private double w;
    private double l;
    private double surface;
    private double volume;

    Parallelepiped(double h, double w, double l) {
        this.h = h;
        this.w = w;
        this.l = l;
        this.surface = 2*( (this.l*this.w) + (this.l*this.h) + (this.w*this.h));
        this.volume = this.h * this.w * this.l;
    }

    @Override
    public double getSurface() { return this.surface; }

    @Override
    public double getVolume() { return this.volume; }

}
