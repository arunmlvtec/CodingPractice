package practice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringEReductionTest {
	StringEReduction ser;
	@Before
	public void before(){
		ser = new StringEReduction();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		String input1 = "eeeeeeee";
		String input2 = "feeeexeeeeet";
		String input3 = "aeiou";
		Assert.assertEquals("e", ser.reduceString(input1));
		Assert.assertEquals("fexet", ser.reduceString(input2));
		Assert.assertEquals("aeiou", ser.reduceString(input3));
	}

}
