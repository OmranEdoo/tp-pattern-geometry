public class LineString implements Geometry {
    private List<Point> points;

    public LineString(List<Point> points) {

    }

    public LineString(List<Point> points) {
        this.points = points;
    }

    public int getNumPoints() {
        return points.size();
    }

    public int getPointN(int n) {
        return points.get(n);
    }
}