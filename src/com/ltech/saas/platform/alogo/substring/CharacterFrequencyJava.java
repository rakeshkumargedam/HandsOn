package com.ltech.saas.platform.alogo.substring;

import java.util.HashMap;
import java.util.Map;

public
class CharacterFrequencyJava {
	public static void main(String[] args) {
		System.out.println(getFrequencyOfChar("capitalone",'a',0,4));
		System.out.println(getFrequencyOfChar("capitalone",'a',0,9));
	}

	private static int getFrequencyOfChar(String s, char c,int start,
	                                      int end) {
		String finalString = s.substring(start,end);
		int count = 0;

		for (int i=0; i <finalString.length(); i++) {
			if (finalString.charAt(i) == c){
				count++;
			}
		}
		return count;
	}

	private static void preProcess(String s, char a) {
		Map<Character,Integer> charCountStore = new HashMap<>();
		int count = 0;
		for (int j=0; j< s.length(); j++) {
			if (s.charAt(j) == a ) {
				count++;
			}
		}
		charCountStore.put(a,count);

	}
}
