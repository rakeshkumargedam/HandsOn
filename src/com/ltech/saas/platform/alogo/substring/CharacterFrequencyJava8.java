package com.ltech.saas.platform.alogo.substring;

public
class CharacterFrequencyJava8 {

	static int MAX_LEN = 1005;
	static int MAX_CHAR = 26;
	static int [][] charCount = new int[MAX_LEN][MAX_CHAR];
	public static void main(String[] args) {
		System.out.println(getFrequencyCount("capitalone",'a',0,4));
		System.out.println(getFrequencyCount("capitalone",'a',0,9));

	}
	private static long getFrequencyCount(String s, char c, int start,
	                                     int end) {
		String finalString = s.substring(start,end);
		/*long count = someString.chars().filter(ch -> ch == 'e').count();*/
		long count =
				finalString.codePoints().filter(ch -> ch == c).count();
		finalString.chars().filter(ch -> ch == c).count();
		return count;
	}
}
