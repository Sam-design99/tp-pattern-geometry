package org.acme.geometry;

public class Envelloppe {
    private Coordinate bottomLeft;
    private Coordinate topRight;

    public Envelloppe(){

    }

    public Envelloppe(Coordinate bottomLeft, Coordinate topRight){
        this.bottomLeft=bottomLeft;
        this.topRight=topRight;

    }

    public Boolean isEmpty(){
        return (bottomLeft.isEmpty() || topRight.isEmpty());

    }

    public Coordinate getBottomLeft() {
        return bottomLeft;
    }

    public Coordinate getTopRight() {
        return topRight;
    }

    public double getXmin(){
        return bottomLeft.getX();
    }
    public double getXmax(){
        return topRight.getX();
    }
    public double getYmin(){
        return bottomLeft.getY();
    }
    public double getYmax(){
        return topRight.getY();
    }


}
