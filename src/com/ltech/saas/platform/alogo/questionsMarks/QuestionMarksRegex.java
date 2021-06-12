package com.ltech.saas.platform.alogo.questionsMarks;

import com.sun.tools.javac.util.Assert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public
class QuestionMarksRegex {

	static
	Pattern QUTIONS_MARK = Pattern.compile("(?=([\\d])" +
	                                       "[^\\d?]*\\?[^\\d?]*\\?[^\\d?]*\\?[^\\d?]*([\\d]))");
	public static void main(String [] args) {

		System.out.println(threeQuestionMarksCheck("acc?7??sss?3rr1??????5"));
		System.out.println(threeQuestionMarksCheck("5??aaaaaaaaaaaaaaaaaaaa?5?5"));
		System.out.println(threeQuestionMarksCheck("9???1???9???1???9"));
		System.out.println(threeQuestionMarksCheck("aa6?9"));
		System.out.println(threeQuestionMarksCheck("8???2???9"));
		System.out.println(threeQuestionMarksCheck("10???0???10"));
		System.out.println(threeQuestionMarksCheck("aa3??oiuqwer?7???2"));

		Assert.check(threeQuestionMarksCheck("acc?7??sss?3rr1??????5"));
		Assert.check(threeQuestionMarksCheck("5??aaaaaaaaaaaaaaaaaaaa?5?5"));
		Assert.check(threeQuestionMarksCheck("9???1???9???1???9"));
		Assert.check(threeQuestionMarksCheck("aa6?9"));
		Assert.check(threeQuestionMarksCheck("8???2???9"));
		Assert.check(threeQuestionMarksCheck("10???0???10"));
		Assert.check(threeQuestionMarksCheck("aa3??oiuqwer?7???2"));
	}
	private static boolean threeQuestionMarksCheck(String input) {
		Matcher matcher = QUTIONS_MARK.matcher(input);
		boolean match = false;
		while (matcher.find()) {
			match = true;
			if (Integer.parseInt(matcher.group(1)) + Integer.parseInt(matcher.group(2)) != 10 ) {
				return false;
			}
		}
return match;
	}
}
