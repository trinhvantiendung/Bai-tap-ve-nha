package Triagle_TestCase;


import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import Triagle_Test.Triagle;

public class Triagle_TestCase_JUnit {
	
	@Test
	public void testcase1() throws Exception{
		Triagle t = new Triagle(4, 1, 2);
		int expected = -1;
		int actual = t.checkTriagle();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tescase2() throws Exception{
		Triagle t = new Triagle(1, 4, 2);
		int expected = -1;
		int actual = t.checkTriagle();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tescase3() throws Exception{
		Triagle t = new Triagle(1, 1, 4);
		int expected = -1;
		int actual = t.checkTriagle();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tescase4() throws Exception{
		Triagle t = new Triagle(5, 5, 5);
		int expected = 2;
		int actual = t.checkTriagle();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tescase5() throws Exception{
		Triagle t = new Triagle(2, 2, 3);
		int expected = 1;
		int actual = t.checkTriagle();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tescase6() throws Exception{
		Triagle t = new Triagle(2, 3, 2);
		int expected = 1;
		int actual = t.checkTriagle();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tescase7() throws Exception{
		Triagle t = new Triagle(3, 2, 2);
		int expected = 1;
		int actual = t.checkTriagle();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tescase8() throws Exception{
		Triagle t = new Triagle(3, 4, 5);
		int expected = 0;
		int actual = t.checkTriagle();
		Assert.assertEquals(expected, actual);
	}
}