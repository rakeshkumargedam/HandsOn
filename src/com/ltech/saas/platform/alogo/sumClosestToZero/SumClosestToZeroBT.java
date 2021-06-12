package com.ltech.saas.platform.alogo.sumClosestToZero;

public
class SumClosestToZeroBT {

	public static void main(String[] args) {
		int [] input = {2,8,7,0,-1,-5,3,-2};
		int [] input1 = {13,1,4,6,-2,-9,-20};
		findPairClosest(input1);
	}

	private static void findPairClosest(int input[]) {
		if (input.length <2) {
			return;
		}
		int minimumSum = input[0] + input[1];
		int pairFirstIndex = 0;
		int pairSecondIndex = 1;
		for (int i=0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				int tempSum = input[i] + input[j];

				if (Math.abs(tempSum) < Math.abs(minimumSum)) {
					pairFirstIndex = i;
					pairSecondIndex = j;
					minimumSum = tempSum;
				}
			}
		}
		System.out.println("The pair whose sum is closest to zero is " + input[pairFirstIndex] + " " + input[pairSecondIndex]);
	}
}
