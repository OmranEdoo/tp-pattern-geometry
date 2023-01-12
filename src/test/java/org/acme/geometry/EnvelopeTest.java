package org.acme.geometry;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class EnvelopeTest {

    public static final double EPSILON = 1.0e-15;

    @Test
    void testEnvelopeConstructor() {
        Coordinate bottomLeft = new Coordinate(1, 0);
        Coordinate topRight = new Coordinate(4, 2);
        Envelope envelope = new Envelope(bottomLeft, topRight);
        Assert.assertNotNull(envelope);
        Assert.assertEquals(1, envelope.getXmin(), EPSILON);
        Assert.assertEquals(0, envelope.getYmin(), EPSILON);
        Assert.assertEquals(4, envelope.getXmax(), EPSILON);
        Assert.assertEquals(2, envelope.getYmax(), EPSILON);
    }

    @Test
    void testEnvelopeDefaultConstructor() {
        Envelope envelope = new Envelope();
        Assert.assertNotNull(envelope);
        Assert.assertEquals(Double.NaN, envelope.getXmin(), EPSILON);
        Assert.assertEquals(Double.NaN, envelope.getYmin(), EPSILON);
        Assert.assertEquals(Double.NaN, envelope.getXmax(), EPSILON);
        Assert.assertEquals(Double.NaN, envelope.getYmax(), EPSILON);
    }

    @Test
    void testIsEmpty() {
        Envelope envelope = new Envelope();
        Assert.assertNotNull(envelope.isEmpty());
    }

    @Test
    void testGetXmin() {
        Coordinate bottomLeft = new Coordinate(1, 0);
        Coordinate topRight = new Coordinate(4, 2);
        Envelope envelope = new Envelope(bottomLeft, topRight);
        Assert.assertEquals(1, envelope.getXmin(), EPSILON);
    }

    @Test
    void testGetYmin() {
        Coordinate bottomLeft = new Coordinate(1, 0);
        Coordinate topRight = new Coordinate(4, 2);
        Envelope envelope = new Envelope(bottomLeft, topRight);
        Assert.assertEquals(0, envelope.getYmin(), EPSILON);
    }

    @Test
    void testGetXmax() {
        Coordinate bottomLeft = new Coordinate(1, 0);
        Coordinate topRight = new Coordinate(4, 2);
        Envelope envelope = new Envelope(bottomLeft, topRight);
        Assert.assertEquals(4, envelope.getXmax(), EPSILON);
    }

    @Test
    void testGetYmax() {
        Coordinate bottomLeft = new Coordinate(1, 0);
        Coordinate topRight = new Coordinate(4, 2);
        Envelope envelope = new Envelope(bottomLeft, topRight);
        Assert.assertEquals(2, envelope.getYmax(), EPSILON);
    }
}