package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testNan(){
		// TODO
		Coordinate c = new Coordinate();
		Assert.assertTrue(Double.isNaN(c.getX()));
		Assert.assertTrue(Double.isNaN(c.getY()));

	}
}
