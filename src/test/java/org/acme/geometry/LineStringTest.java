package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {

    public static final double EPSILON = 1.0e-15;

    @Test
    public void testGetNumPoints() {
        List<Point> points = new ArrayList<>();
        Coordinate coordinatePoint1 = new Coordinate(1, 2);
        Coordinate coordinatePoint2 = new Coordinate(3, 4);
        points.add(new Point(coordinatePoint1));
        points.add(new Point(coordinatePoint2));
        LineString lineString = new LineString(points);
        Assert.assertEquals(2, lineString.getNumPoints());
    }

    @Test
    public void testGetPointN() {
        List<Point> points = new ArrayList<>();
        Coordinate coordinatePoint1 = new Coordinate(1, 2);
        Coordinate coordinatePoint2 = new Coordinate(3, 4);
        points.add(new Point(coordinatePoint1));
        points.add(new Point(coordinatePoint2));
        LineString lineString = new LineString(points);
        Assert.assertEquals(1, lineString.getPointN(0).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(2, lineString.getPointN(0).getCoordinate().getY(), EPSILON);
        Assert.assertEquals(3, lineString.getPointN(1).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(4, lineString.getPointN(1).getCoordinate().getY(), EPSILON);
    }

    @Test
    public void testGetType() {
        Coordinate coordinate = new Coordinate();
        LineString lineString = new LineString();
        Assert.assertEquals("LineString", lineString.getType());
    }

    @Test
    public void testIsEmpty() {
        Coordinate coordinate = new Coordinate();
        LineString lineString = new LineString();

        Assert.assertNotNull(lineString.isEmpty());
    }

    @Test
    public void testTranslate() {
        Coordinate coordinateP1 = new Coordinate(1, 2);
        Coordinate coordinateP2 = new Coordinate(6, -1);
        Point point1 = new Point(coordinateP1);
        Point point2 = new Point(coordinateP2);
        List<Point> listePoints = new ArrayList<>();
        listePoints.add(point1);
        listePoints.add(point2);
        LineString lineString = new LineString(listePoints);
        lineString.translate(4, 7);
        Assert.assertEquals(5, lineString.getPointN(0).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(9, lineString.getPointN(0).getCoordinate().getY(), EPSILON);
        Assert.assertEquals(10, lineString.getPointN(1).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(6, lineString.getPointN(1).getCoordinate().getY(), EPSILON);
    }

    @Test
    public void testClone() {
        Coordinate coordinateP1 = new Coordinate(1, 2);
        Coordinate coordinateP2 = new Coordinate(6, -1);
        Point point1 = new Point(coordinateP1);
        Point point2 = new Point(coordinateP2);
        List<Point> listePoints = new ArrayList<>();
        listePoints.add(point1);
        listePoints.add(point2);
        LineString lineString1 = new LineString(listePoints);
        LineString lineString2 = (LineString) lineString1.clone();
        Assert.assertEquals(1, lineString2.getPointN(0).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(2, lineString2.getPointN(0).getCoordinate().getY(), EPSILON);
        Assert.assertEquals(6, lineString2.getPointN(1).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(-1, lineString2.getPointN(1).getCoordinate().getY(), EPSILON);
        Assert.assertNotSame(lineString1, lineString2);
    }

    @Test
    public void testGetEnvelope() {
        Coordinate coordinateP1 = new Coordinate(1, 2);
        Coordinate coordinateP2 = new Coordinate(10, 20);
        Point point1 = new Point(coordinateP1);
        Point point2 = new Point(coordinateP2);
        List<Point> listePoints = new ArrayList<Point>();
        listePoints.add(point1);
        listePoints.add(point2);
        LineString lineString = new LineString(listePoints);
        Envelope envelope = lineString.getEnvelope();
        Assert.assertEquals(1, envelope.getXmin(), EPSILON);
        Assert.assertEquals(2, envelope.getYmin(), EPSILON);
        Assert.assertEquals(10, envelope.getXmax(), EPSILON);
        Assert.assertEquals(20, envelope.getYmax(), EPSILON);
    }
}