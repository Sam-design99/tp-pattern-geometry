package org.acme.geometry;




import java.util.ArrayList;

public class GeometryFactoryTest {

    public static Point createPointEmpty() {
        Coordinate cord = new Coordinate();
        return new Point(cord);
    }

    public static Point createPointS() {
        Coordinate cord = new Coordinate(0.0, 0.0);
        return new Point(cord);
    }

    public static LineString createLineStringSizeS(int x) {
        ArrayList<Point> points =new ArrayList<Point>();
        for (int i = 0; i <x; i++) {
            Coordinate c = new Coordinate(i, i);
            points.add(new Point(c));
        }
        return new LineString(points);
    }
}


