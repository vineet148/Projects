package com.example.algopractice.slidigWindow;

public class CheckForAnagram {

	public static void main(String args[]) {

		String parentString = "aabaabaa";
		String childString = "aab";
		int asciiValue = calculateAscii(childString);
		System.out.println(asciiValue);
		checkForAnagram(parentString, childString, childString.length(), asciiValue);

	}

	private static int calculateAscii(String childString) {
		// TODO Auto-generated method stub
		int value = 0;
		for (int i = 0; i < childString.length(); i++) {
			value = value + childString.charAt(i);
		}
		return value;
	}

	private static void checkForAnagram(String parentString, String childString, int k, int asciiValue) {
		// TODO Auto-generated method stub
		int count = 0;
		int i = 0, j = 0;
		StringBuilder str = new StringBuilder();

		while (j < parentString.length()) {

			if (j - i + 1 < k) {
				str.append(parentString.charAt(j));
				j++;
			} else if (j - i + 1 == k) {
				str.append(parentString.charAt(j));
				int x = calculateAscii(str.toString());
				if (x == asciiValue) {
					count++;
					System.out.println(str.toString());
				}
				String str2 = str.toString().substring(1);
				str.delete(0, str.length());
				str = str.append(str2);
				i++;
				j++;

			}

		}

		System.out.println("number of anagrams"+count);
	}
	
}
