 package com.dsa;

public class MaxSubArraySum {
	public static int subArraySum(int[] arr) {
		int maximumSum=Integer.MIN_VALUE;
		int currSum=0;
		for(int i=0;i<arr.length;i++) {
			
			currSum=currSum+arr[i];
			if(currSum<0) {
				currSum=0;
			}
			maximumSum=Math.max(currSum, maximumSum);
		}
		return maximumSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {-2,-3,4,-1,-2,1,5,-3};
		
		System.out.println("Maximum subarray Sum= "+subArraySum(numbers));
		

	}

}
