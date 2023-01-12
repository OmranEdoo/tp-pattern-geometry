public class Point implements Geometry {
    private Coordinate coordinate;

    public Point() {
        
    }

    public Point(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public int getCoordinate() {
        return this.coordinate;
    }
}