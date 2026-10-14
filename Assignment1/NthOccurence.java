package com.cdac.day1;

public class NthOccurence {
	//algorithm 
	//first take key 
	//traverse array and match
	// if match so increase count 
	//then match occurence to count 
	//if match return idx
	//otherwise -1
	public static int nOccurence(int arr[],int key,int occurence) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				count++;
			  if(count==occurence) {
				  return i;
			  }	
			
			}
		}
		
		return -1;
	}
   public static void main(String[] args) {
     int arr[]= {0,20,40,20,60,20};	   
     int count=nOccurence(arr, 0,3);
      System.out.println(count);
   }
}
