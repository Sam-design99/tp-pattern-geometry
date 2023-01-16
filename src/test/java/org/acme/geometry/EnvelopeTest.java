package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;




public class EnvelopeTest {

    @Test
    public void testConstructeurdefault(){
        Envelope env= new Envelope();
        Assert.assertTrue(env.isEmpty());

    }

}
