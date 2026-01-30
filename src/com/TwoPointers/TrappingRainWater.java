package com.TwoPointers;

public class TrappingRainWater {

	public static void main(String[] args) {

		int heights[]=new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
int total=trap(heights);
		System.out.println(total);
	}

	private static int trap(int[] heights) {

		int left=0;
		int right=heights.length-1;
		int total=0;
		int leftMax=heights[left];
		int rightMax=heights[right];
		
		while (left<right)
		{
		
			if (heights[left]<heights[right])
			{
			leftMax=Math.max(leftMax, heights[left]);
			
			if (leftMax-heights[left]>0)
			{
			
				total=total+leftMax-heights[left];
		
			}
		left++;		
			}
			
		else {
			
rightMax=Math.max(rightMax, heights[right]);
			
			if (rightMax-heights[right]>0)
			{
			
				total=total+rightMax-heights[right];
		
			}
		right--;		
			
			
			
			
		}		
			}
			
		
		
		
		
		
		return total;
	}

}
