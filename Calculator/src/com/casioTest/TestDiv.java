
package com.casioTest;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;

import com.casio.Maths;

public class TestDiv {								//class to perform Division

	@Test
	public void testDivideTwoPositiveGreatByLess() {
		Maths math=new Maths();
		double ans=math.div(3.0,2.0);
		Assert.assertEquals(1.5, ans,0);
	}
	
	@Test
		public void testDivideTwoPositiveLessByGreat() {
		Maths math=new Maths();
		double ans=math.div(3.0,4.0);
		Assert.assertEquals(0.75, ans,0);
	}
	@Test
	public void testDivideTwoNegativesGreatByLess() {
		Maths math=new Maths();
		double ans=math.div(-3.0,-2.0);
		Assert.assertEquals(1.5, ans,0);
	}
	@Test
	public void testDivideTwoNegativesLessByGreat() {
		Maths math=new Maths();
		double ans=math.div(-3.0,-6.0);
		Assert.assertEquals(0.5, ans,0);
	}
	@Test
	public void testDivideTwoMixedGreatByLess() {
		Maths math=new Maths();
		double ans=math.div(-3.0,2.0);
		Assert.assertEquals(-1.5, ans,0);
	}
	@Test
	public void testDivideTwoMixedLessByGreat() {
		Maths math=new Maths();
		double ans=math.div(3.0,-6.0);
		Assert.assertEquals(-0.5, ans,0);
	}
	
	@Test
	public void testNumeratorDivByZero() {
		Maths math=new Maths();
		double ans=math.div(3.0,0.0);
		Assert.assertEquals(Double.POSITIVE_INFINITY, ans,0);
	}

	@Test
	public void testNumeratorZero() {
		Maths math=new Maths();
		double ans=math.div(0.0,2.0);
		Assert.assertEquals(0, ans,0);
	}



}
