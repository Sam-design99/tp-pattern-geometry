package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {
    public static final double EPSILON = 1.0e-15;

    @Test
    public void testGetType(){
        // TODO
        LineString d=new LineString();
        Assert.assertEquals("LineString", d.getType());

    }
}
