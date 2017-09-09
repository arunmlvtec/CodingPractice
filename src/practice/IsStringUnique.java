package practice;

public class IsStringUnique {
	public boolean isUnique(String str) {
		int checker = 0, len = str.length();
		for (int i = 0; i < len; i++) {
			int val = str.charAt(i) - 'a'; // My name is Arun
			System.out.println(Integer.toBinaryString(checker));
			System.out.println(Integer.toBinaryString(1 << val));
			System.out.println("----------------------------");
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker = checker | (1 << val);
		}
		return true;
	}
}
