package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntersectOverlapRectangleTest {

	@Test
	public void testIntersectRect() {
//		fail("Not yet implemented");
		IntersectOverlapRectangle ior = new IntersectOverlapRectangle();
		boolean actual1 = ior.intersectRect(6, 9, 6, 9, 10, 13, 6, 9);			//	false
		boolean actual2 = ior.intersectRect(6, 9, 6, 9, 10, 13, 10, 13);		//	false
		boolean actual3 = ior.intersectRect(6, 9, 6, 9, 6, 9, 10, 13);			//	false
		boolean actual4 = ior.intersectRect(6, 9, 6, 9, 1, 4, 10, 13);			//	false
		boolean actual5 = ior.intersectRect(6, 9, 6, 9, 1, 4, 6, 9);			//	false
		boolean actual6 = ior.intersectRect(6, 9, 6, 9, 1, 4, 1, 4);			//	false
		boolean actual7 = ior.intersectRect(6, 9, 6, 9, 6, 9, 1, 4);			//	false
		boolean actual8 = ior.intersectRect(6, 9, 6, 9, 6, 9, 10, 13);			//	false
		
		boolean actual9 = ior.intersectRect(6, 9, 6, 9, 9, 12, 6, 9);			//	true
		boolean actual10= ior.intersectRect(6, 9, 6, 9, 9, 12, 9, 12);			//	true
		boolean actual11= ior.intersectRect(6, 9, 6, 9, 6, 9, 9, 12);			//	true
		boolean actual12= ior.intersectRect(6, 9, 6, 9, 3, 6, 9, 12);			//	true
		boolean actual13= ior.intersectRect(6, 9, 6, 9, 3, 6, 6, 9);			//	true
		boolean actual14= ior.intersectRect(6, 9, 6, 9, 3, 6, 3, 6);			//	true
		boolean actual15= ior.intersectRect(6, 9, 6, 9, 6, 9, 3, 6);			//	true
		boolean actual16= ior.intersectRect(6, 9, 6, 9, 9, 12, 3, 6);			//	true
		
		boolean actual17= ior.intersectRect(6, 9, 6, 9, 7, 10, 6, 9);			//	true
		boolean actual18= ior.intersectRect(6, 9, 6, 9, 7, 10, 7, 10);			//	true
		boolean actual19= ior.intersectRect(6, 9, 6, 9, 6, 9, 7, 10);			//	true
		boolean actual20= ior.intersectRect(6, 9, 6, 9, 5, 8, 7, 10);			//	true
		boolean actual21= ior.intersectRect(6, 9, 6, 9, 5, 8, 6, 9);			//	true
		boolean actual22= ior.intersectRect(6, 9, 6, 9, 5, 8, 5, 8);			//	true
		boolean actual23= ior.intersectRect(6, 9, 6, 9, 6, 9, 5, 8);			//	true
		boolean actual24= ior.intersectRect(6, 9, 6, 9, 7, 10, 5, 8);			//	true

		boolean actual25= ior.intersectRect(6, 9, 6, 9, 7, 11, 5, 12);			//	true
		boolean actual26= ior.intersectRect(6, 9, 6, 9, 5, 11, 7, 17);			//	true
		boolean actual27= ior.intersectRect(6, 9, 6, 9, 1, 7, 4, 17);			//	true
		boolean actual28= ior.intersectRect(6, 9, 6, 9, 1, 7, 1, 7);			//	true
		
		boolean actual29= ior.intersectRect(6, 9, 6, 9, 1, 7, 4, 8);			//	true
		boolean actual30= ior.intersectRect(6, 9, 6, 9, 7, 12, 1, 7);			//	true
		boolean actual31= ior.intersectRect(6, 9, 6, 9, 7, 12, 8, 16);			//	true
		boolean actual32= ior.intersectRect(6, 9, 6, 9, 1, 8, 8, 16);			//	true
		
		boolean actual33= ior.intersectRect(6, 9, 6, 9, 6, 9, 6, 9);			//	true
		boolean actual34= ior.intersectRect(6, 9, 6, 9, 5, 10, 5, 10);			//	true
		boolean actual35= ior.intersectRect(6, 9, 6, 9, 7, 8, 7, 8);			//	true
		boolean actual36= ior.intersectRect(6, 6, 6, 6, 6, 6, 6, 6);			//	true
		
		boolean actual37= ior.intersectRect(-10, 0, 0, 0, 0, 0, 0, 0);
		boolean expectedT = true, expectedF = false;
		
		assertEquals(expectedF, actual1);
		assertEquals(expectedF, actual2);
		assertEquals(expectedF, actual3);
		assertEquals(expectedF, actual4);
		assertEquals(expectedF, actual5);
		assertEquals(expectedF, actual6);
		assertEquals(expectedF, actual7);
		assertEquals(expectedF, actual8);
		
		assertEquals(expectedT, actual9);
		assertEquals(expectedT, actual10);
		assertEquals(expectedT, actual11);
		assertEquals(expectedT, actual12);
		assertEquals(expectedT, actual13);
		assertEquals(expectedT, actual14);
		assertEquals(expectedT, actual15);
		assertEquals(expectedT, actual16);
		
		assertEquals(expectedT, actual17);
		assertEquals(expectedT, actual18);
		assertEquals(expectedT, actual19);
		assertEquals(expectedT, actual20);
		assertEquals(expectedT, actual21);
		assertEquals(expectedT, actual22);
		assertEquals(expectedT, actual23);
		assertEquals(expectedT, actual24);
		
		assertEquals(expectedT, actual25);
		assertEquals(expectedT, actual26);
		assertEquals(expectedT, actual27);
		assertEquals(expectedT, actual28);
		
		assertEquals(expectedT, actual29);
		assertEquals(expectedT, actual30);
		assertEquals(expectedT, actual31);
		assertEquals(expectedT, actual32);
		
		assertEquals(expectedT, actual33);
		assertEquals(expectedT, actual34);
		assertEquals(expectedT, actual35);
		assertEquals(expectedT, actual36);
		
		assertEquals(expectedF, actual37);
	}
}