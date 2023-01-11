package org.acme.geometry;

public class Point implements Geometry{
    Coordinate coordinate;

    public Point(){

    }
    public Point(Coordinate coordinate){

    }

    @Override
    public String getType(){
        return "Point";
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

}

