package com.casioTest;

import org.junit.Assert;
import org.junit.Test;

import com.casio.Maths;

public class calcTestSub {						//Class to perform Addition

	@Test	
	public void testSubtractTwoPositive() {
		Maths math=new Maths();
		double ans=math.subtract(3.0,2.0);
		Assert.assertEquals(1.0, ans);
	}
	@Test
	public void testSubtractTwoNegatives() {
		Maths math=new Maths();
		double ans=math.subtract(-4.0,-2.0);
		Assert.assertEquals(-2.0, ans);
	}
	@Test
	public void testSubtractOnePositiveOneNegative() {
		Maths math=new Maths();
		double ans=math.subtract(3.0,-2.0);
		Assert.assertEquals(5.0, ans);
	}
	
	@Test
	public void testSubtractOneNegativeOnePositive() {
		Maths math=new Maths();
		double ans=math.subtract(-3.0,2.0);
		Assert.assertEquals(-1.0, ans);
	}
	
}
