package org.acme.geometry;

public class WktWriter {

    private String geomString;

    public WktWriter() {
        this.geomString = "";
    }

    public String write(Geometry geometry){
        if ( geometry instanceof Point ){
            Point point = (Point)geometry;
            this.geomString = "POINT(" + String.valueOf(point.getCoordinate().getX()) + " " + String.valueOf(point.getCoordinate().getY()) + ")";
            return this.geomString;
        } else if ( geometry instanceof LineString ){
            LineString lineString = (LineString)geometry;
            this.geomString = "LINESTRING(";
            int nbPoints = lineString.getNumPoints();
            for (int i = 0; i < nbPoints-1; i++){
                this.geomString += String.valueOf(lineString.getPointN(i).getCoordinate().getX()) + " " + String.valueOf(lineString.getPointN(i).getCoordinate().getY()) + ",";
            }
            geomString += String.valueOf(lineString.getPointN(nbPoints-1).getCoordinate().getX()) + " " + String.valueOf(lineString.getPointN(nbPoints-1).getCoordinate().getY()) + ")";

            return this.geomString;
        } else{
            throw new RuntimeException("geometry type not supported");
        }
    }
}
