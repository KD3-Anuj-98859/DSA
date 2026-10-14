package com.cdac.day1;

public class NonRepeatingElement {
	// Algorithm
	// first we take array 
	// then we declare count=zero
	// then we match element with condition =
	// if count ==0 so return element
	//then we take element allReadyPrint
	//then we again check idx 0 to till i 
	//if element match so allprint become true
   //if not match than we print element
	public static int nonElement(int arr[]) {
		int count = 0;//1
		for (int i = 0; i < arr.length; i++) {
		    boolean repeated=false;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					repeated=true;
					break;
				}// 1 2 3 2 1 4 3
			}
//			if(!repeated) {
//				boolean allReadyPrint=false;
//				for(int k=0;k<i;k++) {
//					if(arr[i]==arr[k]) {
//						allReadyPrint=true;
//					}
//				}
//				if(!allReadyPrint)
//				     return arr[i];
//			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, -1, 2, 1,0, 4, -1, 7, 8};
		int element = nonElement(arr);
		System.out.println(element);
	}
}
