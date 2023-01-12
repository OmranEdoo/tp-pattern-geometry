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

	@Test
	void testTranslate() {
		Coordinate coordinate = new Coordinate(1, 2);
		Point point = new Point(coordinate);
		point.translate(4, 7);
		Assert.assertEquals(5, point.getCoordinate().getX());
		Assert.assertEquals(9, point.getCoordinate().getY());
	}

	@Test
	void testClone() {
		Coordinate coordinate = new Coordinate(1, 2);
		Point point1 = new Point(coordinate);
		Point point2 = (Point) point1.clone();
		Assert.assertEquals(point1, point2);
		Assert.assertNotSame(point1, point2);
	}
}