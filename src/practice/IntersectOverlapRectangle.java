package practice;

public class IntersectOverlapRectangle {

	/*
	 * public static void main(String[] args) { int thorLeft = 0, thorRight = 0,
	 * thorTop = 0, thorBottom = 0, hulkLeft = 0, hulkRight = 0, hulkTop = 0,
	 * hulkBottom = 0; IntersectOverlapRectangle ior = new
	 * IntersectOverlapRectangle();
	 * System.out.println(ior.IntersectRect(thorLeft, thorRight, thorTop,
	 * thorBottom, hulkLeft, hulkRight, hulkTop, hulkBottom)); }
	 */
	public boolean intersectRect(int thorLeft, int thorRight, int thorTop, int thorBottom, int hulkLeft, int hulkRight,
			int hulkTop, int hulkBottom) {
		if (thorLeft < 0 || thorRight < 0 || thorTop < 0 || thorBottom < 0 || hulkLeft < 0 || hulkRight < 0
				|| hulkTop < 0 || hulkBottom < 0) {
			return false;
		}
		if (thorLeft < hulkLeft && thorRight < hulkLeft) {
			return false;
		} else if (thorLeft > hulkLeft && thorLeft > hulkRight) {
			return false;
		} else if (thorTop < hulkTop && thorBottom < hulkTop) {
			return false;
		} else if (thorTop > hulkTop && thorTop > hulkBottom) {
			return false;
		} else {
			return true;
		}
	}
}
