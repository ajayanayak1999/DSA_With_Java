package com.dsa;

/*
 * Use the following sorting algorithms tosort an array in DESCENDING order :a.Bubble Sortb.Selection Sortc.
 * Insertion Sortd.Counting SortYou can use this array as an example :[3,6,2,1,8,7,4,5,3,1]*/

public class ImplementSortingAlgo {
	
	public static void bubbleSort(int[] arr) {
		int len=arr.length;
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void selectionSort(int[] arr) {
		int len=arr.length;
		for (int i=0;i<len;i++) {
			int idx=i;
			for(int j=i+1;j<len;j++) {
				if(arr[idx]<arr[j]) {
					idx=j;
				}
			}
			int temp=arr[idx];
			arr[idx]=arr[i];
			arr[i]=temp;
			
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void insertionSort(int[] arr) {
		int len=arr.length;
		for(int i=1;i<len;i++) {
			int curr=arr[i];
			int prev=i-1;
			
			while(prev>=0 && arr[prev]<curr) {
				arr[prev+1]=arr[prev];
				prev--;
			}
			arr[prev+1]=curr;
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void countingSort(int[] arr) {
		int maxEle=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxEle) {
				maxEle=arr[i];
			}
		}
		int countAr[] =new int[maxEle+1];
		for(int i=0;i<arr.length;i++) {
			int idx=arr[i];
			countAr[idx]++;
		
		}
		int start=0;
		for(int i=countAr.length-1;i>=0;i--) {
			
			while(countAr[i]>0 && start<arr.length) {
				arr[start]=i;
				countAr[i]--;
				start++;
			}
			
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {3,6,2,1,8,7,4,5,3,1};
		//int[] arr= {1,2,3,4,5,6,7};
		bubbleSort(arr);
		System.out.println();
		selectionSort(arr);
		System.out.println();
		insertionSort(arr);
		System.out.println();
		countingSort(arr);

	}

}
