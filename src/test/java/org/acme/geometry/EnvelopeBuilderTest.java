package org.acme.geometry;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class EnvelopeBuilderTest {

    public static final double EPSILON = 1.0e-15;

    @Test
    public void testDefaultConstructor(){
        EnvelopeBuilder builder = new EnvelopeBuilder();
        Assert.assertNotNull(builder.getXVals());
        Assert.assertNotNull(builder.getYVals());
    }

    @Test
    void testInsert() {
        EnvelopeBuilder builder = new EnvelopeBuilder();
        builder.insert(new Coordinate(1.0,3.0));
        Assert.assertEquals(1.0, builder.getXVals().get(0), EPSILON);
        Assert.assertEquals(3.0, builder.getYVals().get(0), EPSILON);
    }

    @Test
    void testBuild() {
        EnvelopeBuilder builder = new EnvelopeBuilder();
        builder.insert(new Coordinate(0.0,1.0));
        builder.insert(new Coordinate(2.0,0.0));
        builder.insert(new Coordinate(1.0,3.0));
        Envelope envelope = builder.build();
        Assert.assertNotNull(envelope);
        Assert.assertEquals(0, envelope.getXmin(), EPSILON);
        Assert.assertEquals(0, envelope.getYmin(), EPSILON);
        Assert.assertEquals(2, envelope.getXmax(), EPSILON);
        Assert.assertEquals(3, envelope.getYmax(), EPSILON);
    }

}