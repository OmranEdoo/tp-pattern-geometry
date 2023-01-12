package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class LineString implements Geometry {
    private List<Point> points;

    public LineString() {
        this.points = new ArrayList<>();
    }

    public LineString(List<Point> points) {
        this.points = points;
    }

    public int getNumPoints() {
        return points.size();
    }

    public Point getPointN(int n) {
        return points.get(n);
    }

    @Override
    public String getType() {
        return "LineString";
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < this.getNumPoints(); i++){
            if (this.getPointN(i).isEmpty()) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void translate(double dx, double dy) {
        for (int i = 0; i < this.getNumPoints(); i++){
            this.getPointN(i).translate(dx, dy);
        }
    }

    @Override
    public Geometry clone() {
        return new LineString(this.points);
    }

}