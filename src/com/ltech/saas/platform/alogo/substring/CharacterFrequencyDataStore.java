package com.ltech.saas.platform.alogo.substring;

public
class CharacterFrequencyDataStore {

	//
	static int MAX_LEN = 1005;
	static int MAX_CHAR = 26;
	static int [][] charStore = new int [MAX_LEN][MAX_CHAR];
	public static void main(String[] args) {
	//String s = "capitalone";
	String s = "geeksforgeeks";
	//int Q = 4;
	preProcess(s);
/*		System.out.println(findCharFreq(0,4,'a'));
		System.out.println(findCharFreq(0,9,'a'));*/
		System.out.println(findCharFreq(0, 5, 'e'));
		System.out.println(findCharFreq(2, 6, 'f'));
		System.out.println(findCharFreq(4, 7, 'm'));
		System.out.println(findCharFreq(0, 12, 'e'));
	}
	private static void preProcess(String s) {
		int n = s.length();

		/*
		Store occurence of character
		 */

		for (int i=0; i<n; i++) {
			charStore[i][s.charAt(i) - 'a']++;
		}
		/** store occurence o character i **/

		for (int i =1; i < n; i++) {
			for (int j=0; j<26; j++) {
				charStore[i][j] += charStore[i-1][j];
			}
		}
	}

	static int findCharFreq(int start, int end, char c) {
		return (charStore[end] [(c) - 97] - charStore[start][(c) - 97]);
	}

}
