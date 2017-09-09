package practice;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckPermutationsTest {
	CheckPermutations cp;
	
	@Before
	public void before(){
		cp = new CheckPermutations();
	}
	
	@Test
	public void test() {
		Assert.assertEquals(false, cp.permutationCheck("ArunKP", "ArunKp"));
		//fail("Not yet implemented");
	}

}
