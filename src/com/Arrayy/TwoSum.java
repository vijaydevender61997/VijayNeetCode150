package com.Arrayy;

import java.util.HashMap;


public class TwoSum {

	public static void main(String[] args) {
	
		
		int arr[]= {3,4,5,6};
		
		int brr[]	=twoSum(arr,7);
	System.out.print("[");
		for (int i : brr) {
			System.out.print(i+",");
		}
		System.out.print("]");
	}

	
public static int[] twoSum(int[] nums, int target) {

HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();

for (int i = 0; i < nums.length; i++) 
{
int b=target-nums[i];
	if (hm.containsKey(b)) {
		
		return new int[]{hm.get(b),i};
		
	}
	else {
		hm.put(nums[i], i);
	}
	
}
return new int[0];

        
    }
	
}
