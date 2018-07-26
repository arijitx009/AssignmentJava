package com.casioTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.casio.Maths;

public class TestMul {							//class to perform multiplication

	@Test
	public void testMultiplyTwoPositives() {
		Maths math=new Maths();
		double ans=math.mul(3.0,2.0);
		Assert.assertEquals(6.0, ans,0);
		
	}
	
	@Test
	public void testMultiplyTwoNegatives() {
		Maths math=new Maths();
		double ans=math.mul(-3.0,-2.0);
		Assert.assertEquals(6.0, ans,0);
	}
	@Test
	public void testMultiplyByZero() {
		Maths math=new Maths();
		double ans=math.mul(3.0,0.0);
		Assert.assertEquals(0.0, ans,0);
	}
	
	@Test
	public void testMultiplyOneNegativeOnePositive() {
		Maths math=new Maths();
		double ans=math.mul(3.0,-2.0);
		Assert.assertEquals(-6.0, ans,0);
	}
	

}
