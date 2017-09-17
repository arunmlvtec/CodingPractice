package practice;

import java.util.HashMap;

public class DegreeOfAnArray {
	public int smallestSubarrayLen(int[] arr) {
		if (arr.length == 0 || arr == null) {
			return -1;
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		int maxKey = findMax(map, Integer.MIN_VALUE);
		int maxValue = map.get(maxKey);
		set.put(maxKey, 0);
		for (Integer i : map.keySet()) {
			if (maxValue == map.get(i)) {
				set.put(i, -1);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (set.containsKey(arr[i])) {
				if (set.get(arr[i]) == -1) {
					set.put(arr[i], i);
				}
				map.put(arr[i], map.get(arr[i]) - 1);
				if (map.get(arr[i]) == 0) {
					return (i - set.get(arr[i]) + 1);
				}
			}

		}

		return -1;
	}

	public int findMax(HashMap<Integer, Integer> map, int maxKey) {
		int maxValue = -1;
		for (Integer i : map.keySet()) {
			if (maxValue < map.get(i)) {
				maxKey = i;
				maxValue = map.get(i);
			}
		}
		return maxKey;
	}
}
