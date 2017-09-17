package practice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DegreeOfAnArrayTest {
	DegreeOfAnArray da;
	@Before
	public void before(){
		da = new DegreeOfAnArray();
	}
	@Test
	public void test() {
		int [] arr1 = {1, 2, 2, 3, 1};
		Assert.assertEquals(2, da.smallestSubarrayLen(arr1));
		int [] arr2 = {1, 2, 4, 3, 1, 2};
		Assert.assertEquals(5, da.smallestSubarrayLen(arr2));
		//fail("Not yet implemented");
	}
	
	@After
	public void after (){
		da = null;
	}
}
