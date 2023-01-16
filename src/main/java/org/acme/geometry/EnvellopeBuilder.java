package org.acme.geometry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EnvellopeBuilder {

    private List<Double> xVals = new ArrayList<Double>();
    private List<Double> yVals = new ArrayList<Double>();


    public EnvellopeBuilder(){

    }
    public void insert(Coordinate coordinate){
        xVals.add(coordinate.getX());
        yVals.add(coordinate.getY());
    }

    public  Envelloppe build(){
        Coordinate botomleft= new Coordinate(Collection.min(xVals),Collection.min(yVals));
        Coordinate topright= new Coordinate(Collection.max(xVals),Collection.max(yVals));
        return new Envelloppe(botomleft,topright);
    }


}
