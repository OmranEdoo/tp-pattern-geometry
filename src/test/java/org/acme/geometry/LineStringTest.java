package org.acme.geometry;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class LineStringTest {

    @Test
    void testGetNumPoints() {
        List<Point> points = new ArrayList<>();
        Coordinate coordinatePoint1 = new Coordinate(1, 2);
        Coordinate coordinatePoint2 = new Coordinate(3, 4);
        points.add(new Point(coordinatePoint1));
        points.add(new Point(coordinatePoint2));
        LineString lineString = new LineString(points);
        Assert.assertEquals(2, lineString.getNumPoints());
    }

    @Test
    void testGetPointN() {
        List<Point> points = new ArrayList<>();
        Coordinate coordinatePoint1 = new Coordinate(1, 2);
        Coordinate coordinatePoint2 = new Coordinate(3, 4);
        points.add(new Point(coordinatePoint1));
        points.add(new Point(coordinatePoint2));
        LineString lineString = new LineString(points);
        Assert.assertEquals(new Point(coordinatePoint2), lineString.getPointN(1));
    }

    @Test
    void testGetType() {
        Coordinate coordinate = new Coordinate();
        LineString lineString = new LineString();
        Assert.assertEquals("LineString", lineString.getType());
    }

    @Test
    void testIsEmpty() {
        Coordinate coordinate = new Coordinate();
        LineString lineString = new LineString();

        Assert.assertNotNull(lineString.isEmpty());
    }

    @Test
    void testTranslate() {
        Coordinate coordinateP1 = new Coordinate(1, 2);
        Coordinate coordinateP2 = new Coordinate(6, -1);
        Point point1 = new Point(coordinateP1);
        Point point2 = new Point(coordinateP2);
        List<Point> listePoints = new ArrayList<>();
        listePoints.add(point1);
        listePoints.add(point2);
        LineString lineString = new LineString(listePoints);
        lineString.translate(4, 7);
        Assert.assertEquals(5, lineString.getPointN(0).getCoordinate().getX());
        Assert.assertEquals(9, lineString.getPointN(0).getCoordinate().getY());
        Assert.assertEquals(10, lineString.getPointN(1).getCoordinate().getX());
        Assert.assertEquals(6, lineString.getPointN(1).getCoordinate().getY());
    }

    @Test
    void testClone() {
        LineString lineString1 = new LineString();
        LineString lineString2 = (LineString) lineString1.clone();
        Assert.assertEquals(lineString1, lineString2);
        Assert.assertNotSame(lineString1, lineString2);
    }
}