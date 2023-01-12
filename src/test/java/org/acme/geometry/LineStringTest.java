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

}