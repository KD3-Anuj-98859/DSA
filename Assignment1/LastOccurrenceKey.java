package com.cdac.day1;




public class LastOccurrenceKey {
	//Algorithm 
	//first take key from user
	//declare count 
	//increase count when match the element until last idx
	
	
	public static int lastOccurence(int arr[],int key) {
		int idx=0;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				idx=i;
			}
		}
		return idx;
	}
	public static void main(String[] args) {
    	int arr[]= {10,20,40,20,60,20};
    	int index=lastOccurence(arr, 20);
    	System.out.println("Last Occurence : "+index);
    }
}
