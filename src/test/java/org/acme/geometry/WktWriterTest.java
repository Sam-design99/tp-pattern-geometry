package org.acme.geometry;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WktWriterTest {

    @Test
    public void testWriteWP(){
        Geometry g=new Point(new Coordinate(3.0,4.0));
        WktWriter writer= new WktWriter();
        assertEquals("POINT  3.0  4.0  ",writer.write(g));
    }

}
