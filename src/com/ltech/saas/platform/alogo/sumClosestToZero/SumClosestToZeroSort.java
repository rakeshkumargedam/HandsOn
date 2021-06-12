package com.ltech.saas.platform.alogo.sumClosestToZero;

import java.util.Arrays;

/**
 * Time Comlexity O(NLogN)
 */
public
class SumClosestToZeroSort {
	public static void main(String[] args) {
		int [] input = {2,8,7,0,-1,-5,3,-2};
		int [] input1 = {13,1,4,6,-2,-9,-20};
		findPairWithMinSum(input1);
	}

	public static void findPairWithMinSum(int[] input) {
		Arrays.sort(input);
		int sum=0;
		int minimumSum = Integer.MAX_VALUE;
		int n = input.length;

		if (n < 0 ) {
			return;
		}
		int firstIndex = 0;
		int secondIndex= n-1;

		int minFirst = firstIndex;
		int minSecond = n-1;

		while (firstIndex < secondIndex) {
			sum = input[firstIndex] + input[secondIndex];
			if (Math.abs(sum) < Math.abs(minimumSum)) {
				minimumSum = sum;
				minFirst = firstIndex;
				minSecond = secondIndex;
			}
			if (sum < 0) {
				firstIndex++;
			} else {
				secondIndex --;
			}
		}
		System.out.println("The Pair whose sum is minimum : " + input[minFirst] + " " + input[minSecond]);
	}

}
