package org.acme.geometry;

public class Point implements Geometry {
    private Coordinate coordinate;

    public Point() {
        
    }

    public Point(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        return this.coordinate;
    }

    @Override
    public double getType() {
        return 0;
    }
}