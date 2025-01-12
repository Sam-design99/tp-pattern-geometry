package org.acme.geometry;

public class Point implements Geometry{
    Coordinate coordinate;

    public Point(){
        this.coordinate= new Coordinate();
    }
    public Point(Coordinate coordinate){
        this.coordinate=coordinate;
    }

    @Override
    public String getType(){
        return "Point";
    }

    @Override
    public Boolean isEmpty() {
        return coordinate.isEmpty();
    }

    @Override
    public void translate(double dx, double dy) {
        this.coordinate= new Coordinate(dx+this.coordinate.getX(), dy+this.coordinate.getY());
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    @Override
    public Point clone() {
        Point bis= new Point(this.coordinate);
        return bis;

    }

    @Override
    public Envelope getEnvelope() {
        EnvelopeBuilder envB=new EnvelopeBuilder();
        envB.insert((this.getCoordinate()));
        return envB.build();
    }


}

