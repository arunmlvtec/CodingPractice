package practice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsStringUniqueTest {
	IsStringUnique is;
	@Before
	public void before(){
		is = new IsStringUnique();
	}
	
	@Test
	public void test1() {
		boolean actual = is.isUnique("My name is Arun"), expected = false;
		//Assert.assertEquals(expected, actual);
		Assert.assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		boolean actual = is.isUnique(""), expected = true;
		//Assert.assertEquals(expected, actual);
		Assert.assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	public void test3() {
		boolean actual = is.isUnique("My"), expected = true;
		//Assert.assertEquals(expected, actual);
		Assert.assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@After
	public void after(){
		is = null;
	}

}
