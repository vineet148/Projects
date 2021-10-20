package com.example.algopractice.DP;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKUNiquechars {

	public static void main(String args[]) {

		String str = "aabacbebebe";
		int k = 3;
		int len = str.length();
		findLongSubStr(str, k, len);

	}

	private static void findLongSubStr(String str, int k, int len) {
		// TODO Auto-generated method stub

		int max = 0, tempCount = 0, subArrCount = 0;
		int i = 0, j = 0;
		Map<Character, Integer> charMap = new HashMap<>();

		while (j < len) {
			if (charMap.get(str.charAt(j)) == null) {
				charMap.put(str.charAt(j), 1);
			} else {
				charMap.put(str.charAt(j), charMap.get(str.charAt(j)) + 1);
			}

			if (charMap.size() < k) {
				j++;
			} else if (charMap.size() == k) {
				if (max < j - i + 1) {
					max = j - i + 1;
				}
				j++;
			} else if (charMap.size() > k) {

				while (charMap.size() > k) {
					int v = charMap.get(str.charAt(i));
					charMap.put(str.charAt(i), v - 1);
					if (charMap.get(str.charAt(i)) == 0) {
						charMap.remove(str.charAt(i));
					}
					i++;
				}
				j++;

			}

		}
		System.out.println("max count of sub Array is" + max);
		
	}

}