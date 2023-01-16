package org.acme.geometry;

import java.io.PrintStream;

import static java.lang.System.*;

public class LogGeometryVisitor implements GeometryVisitor{

    private PrintStream out;

    public LogGeometryVisitor(){
        this(System.out);
    }
    public LogGeometryVisitor(PrintStream out){
        this.out=out;
    }

    @Override
    public void visit(Point point){
        StringBuilder builder =new StringBuilder();
        builder.append("I'm a point with x=");
        builder.append(point.getCoordinate().getX());
        builder.append(" and y=");
        builder.append(point.getCoordinate().getY());
        this.out.println(builder.toString());
    }


    @Override
    public void visit(LineString lineString) {
        StringBuilder builder =new StringBuilder();
        builder.append("I'm a polyline with x=");
        builder.append(lineString.getNumPoints());
        builder.append(" points");
        this.out.println(builder.toString());
    }
}
