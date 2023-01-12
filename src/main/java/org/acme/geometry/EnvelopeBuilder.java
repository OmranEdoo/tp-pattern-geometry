package org.acme.geometry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnvelopeBuilder {

    private List<Double> xVals;
    private List<Double> yVals;

    public EnvelopeBuilder(){
        this.xVals = new ArrayList<Double>();
        this.yVals = new ArrayList<Double>();
    }

    public void insert(Coordinate coordinate){
        this.xVals.add(coordinate.getX());
        this.yVals.add(coordinate.getY());
    }

    public List<Double> getXVals(){
        return this.xVals;
    }

    public List<Double> getYVals(){
        return this.yVals;
    }

    public Envelope build(){
        double minX = Collections.min(this.xVals);
        double minY = Collections.min(this.yVals);
        double maxX = Collections.max(this.xVals);
        double maxY = Collections.max(this.yVals);

        Coordinate bottomLeft = new Coordinate(minX, minY);
        Coordinate topRight = new Coordinate(maxX, maxY);

        Envelope envelope = new Envelope(bottomLeft, topRight);

        return envelope;
    }
}
