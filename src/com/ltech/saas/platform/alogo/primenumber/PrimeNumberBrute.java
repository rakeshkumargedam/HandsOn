package com.ltech.saas.platform.alogo.primenumber;

import sun.jvm.hotspot.utilities.Assert;

public
class PrimeNumberBrute {
	public static void main(String args[]) {

		System.out.println(getTotalPrimeNumbers(-1));
		System.out.println(getTotalPrimeNumbers(0));
		System.out.println(getTotalPrimeNumbers(1));
		System.out.println(getTotalPrimeNumbers(2));
		System.out.println(getTotalPrimeNumbers(7));
		System.out.println(getTotalPrimeNumbers(10000));
		System.out.println(getTotalPrimeNumbers(100000));
		System.out.println(getTotalPrimeNumbers(1000000));
	}
	private static int getTotalPrimeNumbers(int input) {

		if (input < 2) {
			return 0;
		}
		int primeCount = 1;

		for (int i =3; i <= input; i++) {
			if (isPrime(i)){
				primeCount++;
			}
		}
		return primeCount;
	}

	private static boolean isPrime(int n) {
		if (n <=1) {
			return false;
		}
		for (int i =2; i < n; i++) {
			if ((n % i) == 0) {
				return false;
			}
		}
		return true;
	}

	private static void testCases(int testData) {
		if (testData == -1) {
			com.sun.tools.javac.util.Assert.check(
					true,
					0
			);
		}
		if (testData == 0) {
			com.sun.tools.javac.util.Assert.check(
					true,
					0
			);
		}
		if (testData == 1) {
			com.sun.tools.javac.util.Assert.check(
					true,
					0
			);
		}
		if (testData == 2) {
			com.sun.tools.javac.util.Assert.check(
					true,
					1
			);
		}
		if (testData == 7) {
			com.sun.tools.javac.util.Assert.check(
					true,
					4
			);
		}
		if (testData == 10000) {
			com.sun.tools.javac.util.Assert.check(
					true,
					1229
			);
		}
		if (testData == 100000) {
			com.sun.tools.javac.util.Assert.check(
					true,
					9592
			);
		}
		if (testData == 1000000) {
			com.sun.tools.javac.util.Assert.check(
					true,
					78498
			);
		}
	}
}
