package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

import static org.acme.geometry.GeometryFactoryTest.*;


public class LineStringTest {
    public static final double EPSILON = 1.0e-15;

    @Test
    public void testGetType(){
        // TODO
        LineString d=new LineString();
        Assert.assertEquals("LineString", d.getType());

    }


    @Test
    public void testClone(){
        LineString ls=  createLineStringSizeS(2);
        Assert.assertNotSame(ls,ls.clone());
    }

    @Test
    public void testGetEnvelope(){
    LineString ls =createLineStringSizeS(5);
    Assert.assertEquals(ls.getPointN(0).getCoordinate().getX(),ls.getEnvelope().getXmin(), EPSILON);
    Assert.assertEquals(ls.getPointN(0).getCoordinate().getY(),ls.getEnvelope().getYmin(), EPSILON);
    Assert.assertEquals(ls.getPointN(4).getCoordinate().getX(),ls.getEnvelope().getXmax(), EPSILON);
    Assert.assertEquals(ls.getPointN(4).getCoordinate().getY(),ls.getEnvelope().getYmax(), EPSILON);

    }


}
