package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    public static final double EPSILON = 1.0e-15;

    @Test
    public void testValue(){
        // TODO
        Coordinate c = new Coordinate();
        Assert.assertEquals(3.0, c.getX(), EPSILON);
        Assert.assertEquals(4.0, c.getY(), EPSILON);
    }
    @Test
    public void TestisEmpty(){
        // TODO
        Point d= new Point();
        Assert.assertTrue(d.isEmpty());
        Assert.assertFalse(d.isEmpty());
    }
}
