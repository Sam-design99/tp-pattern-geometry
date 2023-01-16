package org.acme.geometry;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class EnvelopeBuilder {

    private List<Double> xVals = new ArrayList<Double>();
    private List<Double> yVals = new ArrayList<Double>();


    public EnvelopeBuilder(){

    }
    public void insert(Coordinate coordinate){
        xVals.add(coordinate.getX());
        yVals.add(coordinate.getY());
    }

    public Envelope build(){
        if (!xVals.isEmpty()){


        Coordinate botomleft= new Coordinate(Collections.min(xVals),Collections.min(yVals));
        Coordinate topright= new Coordinate(Collections.max(xVals), Collections.max(yVals));
        return new Envelope(botomleft,topright);

        }
        else {
            return new Envelope();
        }
    }


}
