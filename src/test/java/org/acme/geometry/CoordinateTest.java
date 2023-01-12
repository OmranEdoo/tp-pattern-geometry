package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		Coordinate coordinate = new Coordinate();
		Assert.assertEquals(0.0, coordinate.getX(), EPSILON);
		Assert.assertEquals(0.0, coordinate.getY(), EPSILON);
	}

    @Test
    public void testParameterizedConstructor() {
        Coordinate coordinate = new Coordinate(1.0, 2.0);
        Assert.assertEquals(1.0, coordinate.getX(), EPSILON);
        Assert.assertEquals(2.0, coordinate.getY(), EPSILON);
    }

}
