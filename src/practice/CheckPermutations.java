package practice;

import java.util.HashMap;

public class CheckPermutations {
	public boolean permutationCheck(String first, String second){
		if ((first == null || second == null) || (first.length() != second.length())) {
			return false;
		}
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (Character c: first.toCharArray()) {
			if (hm.containsKey(c)){
				hm.put(c, hm.get(c) + 1);
			}
			else {
				hm.put(c,  1);
			}
		}
		for (Character c: second.toCharArray()) {
			if ((!hm.containsKey(c)) || hm.get(c) < 1) {
				return false;
			}
			else {
				hm.put(c, hm.get(c) - 1);
			}
		}
		return true;
	}
}
