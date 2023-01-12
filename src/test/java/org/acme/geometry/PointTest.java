package org.acme.geometry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Test;

class PointTest {

	public static final double EPSILON = 1.0e-15;

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
		Assert.assertEquals(coordinate.getX(), point.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(coordinate.getY(), point.getCoordinate().getY(), EPSILON);
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
		Assert.assertEquals(5, point.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(9, point.getCoordinate().getY(), EPSILON);
	}

	@Test
	void testClone() {
		Coordinate coordinate = new Coordinate(1, 2);
		Point point1 = new Point(coordinate);
		Point point2 = (Point) point1.clone();
		Assert.assertEquals(point1.getCoordinate().getX(), point2.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(point1.getCoordinate().getY(), point2.getCoordinate().getY(), EPSILON);
		Assert.assertEquals(point1.getType(), point2.getType());
		Assert.assertNotSame(point1, point2);
	}

	@Test
	void testGetEnvelope() {
		Coordinate coordinate = new Coordinate(1, 2);
		Point point = new Point(coordinate);
		Envelope envelope = point.getEnvelope();
		Assert.assertEquals(1, envelope.getXmin(), EPSILON);
		Assert.assertEquals(2, envelope.getYmin(), EPSILON);
		Assert.assertEquals(1, envelope.getXmax(), EPSILON);
		Assert.assertEquals(2, envelope.getYmax(), EPSILON);
	}
}