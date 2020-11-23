package com.company;

import java.util.ArrayList;

public class GeometricBodyController {
    private ArrayList<GeometricBody> figures;

    GeometricBodyController(ArrayList<GeometricBody> figures) { this.figures = figures; }

    public GeometricBody maxVolume() {
        double maxVolume = this.figures.get(0).getVolume();
        GeometricBody maxVolumeFigure = this.figures.get(0);
        for (int i = 0; i < figures.size(); i++) {
            if( maxVolume < this.figures.get(i).getVolume() ){
                maxVolume = this.figures.get(i).getVolume();
                maxVolumeFigure = this.figures.get(i);
            }
        }
        return maxVolumeFigure;
    }

    public GeometricBody maxSurface() {
        double maxSurface = this.figures.get(0).getSurface();
        GeometricBody maxSurfaceFigure = this.figures.get(0);
        for (int i = 0; i < figures.size(); i++) {
            if( maxSurface < this.figures.get(i).getSurface() ){
                maxSurface = this.figures.get(i).getSurface();
                maxSurfaceFigure = this.figures.get(i);
            }
        }
        return maxSurfaceFigure;
    }

}
