package com.Arrayy;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {

		int nums[]= {1,2,3,4};
		for (int i : nums) {
			System.out.print(i+" ");
		}
		
	int brr[]=	solution(nums);
		System.out.println();
	for (int i : brr)
	{
	System.out.print(i+" ");	
	}
	
	
	}

	private static int[] solution(int[] nums) {

		
		int result[]=new int[nums.length];
		int pre=1,post=1;
		
		Arrays.fill(result, 1);
		
		for (int i = 0; i < nums.length; i++)
		{
		
			result[i]=pre;
			
			pre=nums[i]*pre;
			
		}
		
		for (int i =result.length-1;i>=0; i--)
		{
			
			result[i]=result[i]*post;
			
			post=nums[i]*post;
			
		}
		
		return result;
	}

}
