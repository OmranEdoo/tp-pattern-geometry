import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

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
        assertEquals(2, lineString.getNumPoints());
    }

    @Test
    void testGetPointN() {
        List<Point> points = new ArrayList<>();
        Coordinate coordinatePoint1 = new Coordinate(1, 2);
        Coordinate coordinatePoint2 = new Coordinate(3, 4);
        points.add(new Point(coordinatePoint1));
        points.add(new Point(coordinatePoint2));
        LineString lineString = new LineString(points);
        assertEquals(new Point(3, 4), lineString.getPointN(1));
    }

}