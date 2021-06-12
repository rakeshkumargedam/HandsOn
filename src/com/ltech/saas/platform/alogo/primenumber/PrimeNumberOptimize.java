package com.ltech.saas.platform.alogo.primenumber;

import java.util.ArrayList;
import java.util.List;

public
class PrimeNumberOptimize {

	public static void main(String [] args) {
		System.out.println(getTotalPrimeNumbers(-1));
		System.out.println(getTotalPrimeNumbers(0));
		System.out.println(getTotalPrimeNumbers(1));
		System.out.println(getTotalPrimeNumbers(2));
		System.out.println(getTotalPrimeNumbers(7));
		System.out.println(getTotalPrimeNumbers(10000));
		System.out.println(getTotalPrimeNumbers(100000));
		System.out.println(getTotalPrimeNumbers(1000000));
	}
	private static List<Integer> primeNumber = new ArrayList<Integer>();
	private static int getTotalPrimeNumbers(int input) {

		if (input < 2) {
			return 0;
		}
		primeNumber.add(2);
		for (int i =3; i<= input; i++) {
			if (isPrime(i)){
				primeNumber.add(i);
			}
		}
		return primeNumber.size();
	}

	private static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}

		for (int i=2; i<n; i++) {
			if ((n % i) == 0) {
				return false;
			}
		}
		return true;
	}
}
