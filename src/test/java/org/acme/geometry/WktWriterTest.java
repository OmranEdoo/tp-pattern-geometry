package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.fail;

public class WktWriterTest {

    @Test
    public void testWrite() {
        Coordinate coordinate1 = new Coordinate(4.0, 2.0);
        Point point1 = new Point(coordinate1);
        Coordinate coordinate2 = new Coordinate(-4.0, -2.0);
        Point point2 = new Point(coordinate2);
        List<Point> listePoints = new ArrayList<Point>();
        listePoints.add(point1);
        listePoints.add(point2);
        LineString lineString = new LineString(listePoints);
        Assert.assertEquals("POINT(4.0 2.0)", new WktWriter().write((Geometry) point1));
        Assert.assertEquals("LINESTRING(4.0 2.0,-4.0 -2.0)", new WktWriter().write((Geometry) lineString));
    }

    @Test
    public void testWriteEmpty() {
        Coordinate coordinate1 = new Coordinate();
        Point point1 = new Point(coordinate1);
        Coordinate coordinate2 = new Coordinate();
        Point point2 = new Point(coordinate2);
        List<Point> listePoints = new ArrayList<Point>();
        listePoints.add(point1);
        listePoints.add(point2);
        LineString lineString = new LineString(listePoints);
        Assert.assertEquals("POINT EMPTY", new WktWriter().write((Geometry) point1));
        Assert.assertEquals("LINESTRING EMPTY", new WktWriter().write((Geometry) lineString));
    }

    @Test
    public void testWriteInvalidGeometry() {
        try {
            new WktWriter().write( null);
            Assert.fail("geometry type not supported");
        } catch(RuntimeException e) {

        }
    }

}
