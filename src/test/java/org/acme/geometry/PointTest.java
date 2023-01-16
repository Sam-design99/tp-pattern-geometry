package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

import static org.acme.geometry.GeometryFactoryTest.createPointS;

public class PointTest {
    public static final double EPSILON = 1.0e-15;

    @Test
    public void testValue(){
        // TODO
        Coordinate c = new Coordinate(3.0,4.0);
        Assert.assertEquals(3.0, c.getX(), EPSILON);
        Assert.assertEquals(4.0, c.getY(), EPSILON);
    }
    @Test
    public void TestisEmpty(){
        // TODO
        Point d= new Point();
        Coordinate c = new Coordinate(2.0,3.0);
        Point g= new Point(c);
        Assert.assertTrue(d.isEmpty());
        Assert.assertFalse(g.isEmpty());
    }
    @Test
    public void testranslatePoint(){
        Coordinate d = new Coordinate(2.0,3.0);
        Point g= new Point(d);
        g.translate(1.0,1.0);
        Assert.assertEquals(3.0 , g.getCoordinate().getX(), EPSILON);
        Assert.assertEquals(4.0 , g.getCoordinate().getY(), EPSILON);

    }
    @Test
    public void testClone(){
        Point p1=createPointS();
        Assert.assertNotSame(p1,p1.clone());
    }

    @Test
    public void testGetEnvelope(){
        Point p =createPointS();
        Assert.assertEquals(p.getCoordinate().getX(),p.getEnvelope().getXmin(), EPSILON);
        Assert.assertEquals(p.getCoordinate().getY(),p.getEnvelope().getYmin(), EPSILON);
        Assert.assertEquals(p.getCoordinate().getX(),p.getEnvelope().getXmax(), EPSILON);
        Assert.assertEquals(p.getCoordinate().getY(),p.getEnvelope().getYmax(), EPSILON);


    }

}
