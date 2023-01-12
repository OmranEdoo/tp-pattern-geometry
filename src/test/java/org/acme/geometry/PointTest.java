package org.acme.geometry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PointTest {
	
	@Test
	void testPointConstructor() {
		Coordinate coordinate = new Coordinate(4, 2);
		Point point = new Point(coordinate);
		Assert.assertNotNull(point);
		Assert.assertEquals(coordinate, point.getCoordinate());
	}
	
	@Test
	void testPointDefaultConstructor() {
		Point point = new Point();
		Assert.assertNotNull(point);
        Coordinate coordinate = new Coordinate();
		Assert.assertEquals(coordinate, point.getCoordinate());
    }
	
	@Test
	void testGetType() {
		Coordinate coordinate = new Coordinate();
		Point point = new Point(coordinate);
		Assert.assertEquals("Point", point.getType());
	}

	@Test
	void testIsEmpty() {
		Coordinate coordinate = new Coordinate();
		Point point = new Point(coordinate);
		Assert.assertNotNull(point.isEmpty());
	}
}