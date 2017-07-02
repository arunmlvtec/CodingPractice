package practice;

public class FindSubString {
	public int findSubStr(String source, String target){
		if (source == null || target == null) {
			System.out.println("null string handling...");
			return -1;
		}
		int srcLen = source.length();
		int tgtLen = target.length();
		if (srcLen == 0 || tgtLen == 0) {
			System.out.println("empty string handling...");
			return -1;
		}
		for (int i = 0; i < (srcLen - tgtLen + 1); i++) {
			int j = 0;
			for (j = 0; j < tgtLen; j++) {
				if (source.charAt(i + j) != target.charAt(j)) {
					break;
				}
			}
			if (j == tgtLen) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String source = "ABCDefgh";
		String target = null;
		FindSubString f = new FindSubString();
		System.out.println(f.findSubStr(source, target));
	}

}
