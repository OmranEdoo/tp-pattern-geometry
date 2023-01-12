import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {
	
	@Test
	void testPointConstructor() {
		Coordinate coordinate = new Coordinate(4, 2);
		Point point = new Point(coordinate);
		assertNotNull(point);
		assertEquals(coordinate, point.getCoordinate());
	}
	
	@Test
	void testPointDefaultConstructor() {
		Point point = new Point();
		assertNotNull(point);
        Coordinate coordinate = new Coordinate();
        assertEquals(coordinate, point.getCoordinate());	
    }
	
	@Test
	void testGetCoordinate() {
		Coordinate coordinate = new Coordinate();
		Point point = new Point(coordinate);
		assertEquals(coordinate, point.getCoordinate());
		coordinate = null;
		assertNull(point.getCoordinate());
	}
}