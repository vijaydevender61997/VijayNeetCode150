package com.SlidingWindow;

import java.util.HashMap;

public class BestTimeToBuy {

	public static void main(String[] args) {
		int price[]= {7,1,5,3,6,4};

	int ans=maxProfit(price);
System.out.println(ans);
	}
	
	  public static  int maxProfit(int[] prices) {
		    int min=prices[0];
int profit=0;

for (int i = 0; i < prices.length; i++) 
{

if (prices[i]<min)
{

	min=prices[i];
	
}	

profit=Math.max(profit, prices[i]-min);
	
}


		  
		  return profit;
	    }
	
	
}
