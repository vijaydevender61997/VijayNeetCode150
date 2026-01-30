package com.Arrayy;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {

		int arr[]= {1,5,2,5,3,4};
		System.out.println(hasDuplicate(arr));
		
	}

	public static boolean hasDuplicate(int[] nums)
    {

   HashSet<Integer> hs=new HashSet();

for(int i=0;i<nums.length;i++)
{
   if(hs.contains(nums[i]))
   {

       return true;
   }
   else 
   {
       hs.add(nums[i]);
   }
}
return false;

   }
	
}
