package org.acme.geometry;

public class Point implements Geometry {
    private Coordinate coordinate;

    public Point() {
        this.coordinate = new Coordinate();
    }

    public Point(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        return this.coordinate;
    }


    @Override
    public String getType() {
        return "Point";
    }

    @Override
    public boolean isEmpty() {
        return this.coordinate.isEmpty();
    }

    @Override
    public void translate(double dx, double dy) {
        Coordinate translatedCoords = new Coordinate(this.getCoordinate().getX() + dx, this.getCoordinate().getY() + dy);
        this.coordinate = translatedCoords;
    }

    @Override
    public Geometry clone() {
        return new Point(this.getCoordinate());
    }

}