package com.ltech.saas.platform.alogo.questionsMarks;

import com.sun.tools.javac.util.Assert;

import java.io.IOException;

public
class QuestionMarks {
	public static void main(String args[]){

		System.out.println(validateQuestionMark("acc?7??sss?3rr1??????5"));
		System.out.println(validateQuestionMark("5??aaaaaaaaaaaaaaaaaaaa?5?5"));
		System.out.println(validateQuestionMark("9???1???9???1???9"));
		System.out.println(validateQuestionMark("aa6?9"));
		System.out.println(validateQuestionMark("8???2???9"));
		System.out.println(validateQuestionMark("10???0???10"));
		System.out.println(validateQuestionMark("aa3??oiuqwer?7???2"));

/*		Assert.check(validateQuestionMark("acc?7??sss?3rr1??????5"));
		Assert.check(validateQuestionMark("5??aaaaaaaaaaaaaaaaaaaa?5?5"));
		Assert.check(validateQuestionMark("9???1???9???1???9"));
		Assert.check(validateQuestionMark("aa6?9"));
		Assert.check(validateQuestionMark("8???2???9"));
		Assert.check(validateQuestionMark("10???0???10"));
		Assert.check(validateQuestionMark("aa3??oiuqwer?7???2"));*/


	}

	private static boolean validateQuestionMark(String input)  {

		int numberOfQuestions = 0, firstnumber = -1;
		boolean matches = false;

		for (char c: input.toCharArray()) {
			/* First check if first character in string is digit and
			number of questions is 0 then set the first number */

			if (Character.isDigit(c) && numberOfQuestions == 0) {
				firstnumber = Character.getNumericValue(c);
			}

			/* Now look for question mark symbol and make sure
			firstNumber is not equals to -1*/

			if (c == '?' && firstnumber != -1) {
				numberOfQuestions++;
			}
			/* Now check if Number of question marks is equals 3 and the
				current character is digit and sum of first number and
				current character is not equal to 10 then return false
			 */

			if (numberOfQuestions == 3 && Character.isDigit(c)) {
				if (firstnumber + Character.getNumericValue(c) != 10) {
					return false;
				}

				/* reset the value for number of questions and set the
				value for firstnumber to current character and return true.
				 */
				firstnumber = Character.getNumericValue(c);
				numberOfQuestions = 0;
				matches = true;
			}

			if (numberOfQuestions > 3) {
				numberOfQuestions = 0;
				firstnumber = -1;
			}

		}

		return matches;
	}
}
