package org.acme.geometry;

import javax.sound.sampled.Line;

public class WktWriter {


    public String write(Geometry geometry){
        StringBuilder builder= new StringBuilder();
        builder.append(geometry.getType().toUpperCase());
        if (geometry instanceof Point){
            Point point =(Point) geometry;
            builder.append("  ");
            builder.append(point.getCoordinate().getX());
            builder.append("  ");
            builder.append(point.getCoordinate().getY());
            builder.append("  ");
        } else if (geometry instanceof LineString) {
            LineString lineString= (LineString) geometry;
            builder.append("  ");
            for (int indexPoint= 0; indexPoint<lineString.getNumPoints();indexPoint++){
                Point point = lineString.getPointN(indexPoint);
                builder.append(point.getCoordinate().getX());
                builder.append("  ");
                builder.append(point.getCoordinate().getY());
                if (indexPoint<lineString.getNumPoints() -1){
                    builder.append(",");
                }
            }
            builder.append(",");
        }else{
            throw new RuntimeException("geometry type not supported");
        }
        String wktObject = builder.toString();
        return wktObject;
    }

}
