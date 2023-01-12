package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class LogGeometryVisitorTest {

    @Test
    public void testVisitorPoint() throws UnsupportedEncodingException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(os);
        LogGeometryVisitor visitor = new LogGeometryVisitor(out);

        Geometry geometry = new Point(new Coordinate(3.0,4.0));
        geometry.accept(visitor);

        String result = os.toString("UTF8");

        Assert.assertEquals("Je suis un point avec x=3.0 et y=4.0", result.trim());
    }

    @Test
    public void testVisitorLineString(){
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(os);
        LogGeometryVisitor visitor = new LogGeometryVisitor(out);

        Coordinate coordinate1 = new Coordinate();
        Coordinate coordinate2 = new Coordinate();
        Point point1 = new Point(coordinate1);
        Point point2 = new Point(coordinate2);

        List<Point> listePoints = new ArrayList<>();
        listePoints.add(point1);
        listePoints.add(point2);

        Geometry geometry = new LineString(listePoints);
        geometry.accept(visitor);

        String result = os.toString();

        Assert.assertEquals("Je suis une polyligne définie par 2 point(s)", result.trim());
    }
}