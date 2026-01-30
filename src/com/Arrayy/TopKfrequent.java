package com.Arrayy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TopKfrequent {

	public static void main(String[] args) {

	int brr[]=	topKFrequent2(new int[] { 7,7,5,5,2}, 2);
		
	for (int i : brr) {
		System.out.println(i);
	}
		
		
	}
	
	  public  int[] topKFrequent(int[] nums, int k) {
	        
	        if(nums.length==0)
	        {
	            return new int[]{};
	        }

	int output[]=new int[k];
	int j=0;
	Map<Integer,Integer>map=new LinkedHashMap<Integer, Integer>();
	
	for(int i=0;i<nums.length;i++)
	{

		
		if (map.containsKey(nums[i])) {
			map.put(nums[i], map.get(nums[i]) + 1);
		} else {
			map.put(nums[i], 1);
		}
		}

		for (int i = 0; i < k; i++) {
			int max = Integer.MIN_VALUE;
			int key = 0;
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getValue() > max) {
					max = entry.getValue();
					key = entry.getKey();
				}
			}
			output[j++] = key;
			map.remove(key);
		}



	    
	return output;



	}
	  
	  
	  
	  public static int[] topKFrequent2(int[] nums, int k) {
	        
		  if(nums.length==0)
		  {

		      return new int[]{};
		  }

		  int output[]=new int[k];

		  HashMap<Integer,Integer>hm=new HashMap<>();
		  int j=0;
		  for(int i=0;i<nums.length;i++)
		  {

		  if(hm.containsKey(nums[i]))
		  {

		      hm.put(nums[i],hm.get(nums[i])+1);
		  }
		  else
		  {
		          hm.put(nums[i],1);

		  }

		  }


		  for(int i=0;i<k;i++)
		  {

		  int max = Integer.MIN_VALUE;
		  			int key = 0;
		  			for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
		  				if (entry.getValue() > max) {
		  					max = entry.getValue();
		  					key = entry.getKey();
		  				}
		  			}
		              output[j++]=key;
		              hm.remove(key);
		  	
		  }


		  return output;

		  }


	

}
