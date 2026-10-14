package com.cdac.day1;

public class FabnachiSeries {
	 public static int fabonachiSeries(int nterm) {
		 if(nterm==0)
			 return 0;
		 if(nterm==1)
			 return 1;
		 return fabonachiSeries(nterm-1) + fabonachiSeries(nterm-2);
	 }          
    public static void main(String[] args) {
    	
    int res=fabonachiSeries(4);
    System.out.println(res);
    	
    }
}
