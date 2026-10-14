package com.cdac.day1;

import java.util.Arrays;

public class DescendingOrderBinary {
	//algorithm
	//first take array and key by user
	//then find mid (l+r)/2
	//if key =mid then return idx
	//if(key is less than mid check in right side)
	     //left=mid+1
	//if(key is greater than mid so check left side)
	    //right=mid-1
	
	public static int  binarySearch(int arr[],int key){
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(key==arr[mid])
				return mid;
			else if(key>arr[mid])
				right=mid-1;
			else
				left=mid+1;
		}
	      return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {9,8,7,6,5,4,3,2,1};
		int idx=binarySearch(arr, 7);
	     System.out.println(idx);
	}

}
