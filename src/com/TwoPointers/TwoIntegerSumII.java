package com.TwoPointers;

public class TwoIntegerSumII {

	public static void main(String[] args) {

		int target[]= {1,2,3,4};
	int brr[]	=twoSum(target, 4);
	
	for (int i : brr) {
		System.out.print(i+" ");
	}
	
	
	}

	
	
	
	
	 public static int[] twoSum(int[] numbers, int target) {
	 
		    int left=0,right=numbers.length-1;

		    while(left<right)
		    {

		    	int sum=numbers[left]+numbers[right];
		    	
		    	if(sum==target){

		 		   return new int[]{left+1,right};
		 		}

		    	
		    	
		    	if(target>sum)
		    	{
				left++;	
				}
		    	else {
		    		
				right--;	
				}
		    	
		    }
		    
			return  null;



		    }

	
}
