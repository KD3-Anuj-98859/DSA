package com.cdac.day1;

public class Gcd {
	public static int gcd(int num,int num2) {
		if(num2%num==0) {
			return num;
		}
		for(int i=num/2;i>0;i--) {
			if(num2%i ==0&&num%i==0)
				return i;
		}
		
		
		
		
		
		
		return 0;
	} 
  public static void main(String[] args) {
    int result = gcd(10,20);
    System.out.println(result);
  }
}
