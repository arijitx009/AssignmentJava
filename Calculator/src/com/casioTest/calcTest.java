package com.casioTest;



import org.junit.Assert;
import org.junit.Test;

import com.casio.Maths;

public class calcTest {							//Class to perform Addition

	@Test
	public void testAddTwoPositive() {
		Maths math=new Maths();
		double ans=math.add(2.0,2.0);
		Assert.assertEquals(4.0, ans);
		
	}
	
	@Test
	public void testAddTwoNegative() {
		Maths math=new Maths();
		double ans=math.add(-2.0,-2.0);
		Assert.assertEquals(-4.0, ans);
	

	}
	@Test
	public void testAddOnePositiveOneNegative() {
		Maths math=new Maths();
		double ans=math.add(-2.0,2.0);
		Assert.assertEquals(0, ans);
	

	}
	@Test
	
	public void testAddOneGreaterPositiveOneNegative() {
		Maths math=new Maths();
		double ans=math.add(-2.0,5.0);
		Assert.assertEquals(3.0, ans);
	

	}
	@Test
	public void testAddOnePositiveOneGreaterNegative() {
		Maths math=new Maths();
		double ans=math.add(-5.0,2.0);
		Assert.assertEquals(-3.0, ans);
	}
	

	
	
	
}
