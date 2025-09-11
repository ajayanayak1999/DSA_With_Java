 package com.dsa;

public class CheckWhetherArrayContainsDuplicateElementsOrNot {
	public static boolean checkArray(int[] num) {
		int count=0;
		 for(int i=0;i<num.length;i++) {
			 for(int j=i+1;j<num.length;j++) {
				 if(num[i]==num[j]) {
					 count++;
				 }
			 }
		 }
		 if(count>0) {
			 return true;
		 }
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {1,1,2,3,};
		
		System.out.println("Array contails duplicate elements :"+checkArray(nums));

	}

}
