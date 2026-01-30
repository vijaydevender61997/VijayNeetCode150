package com.TwoPointers;

public class CheckPalindrome {

	public static void main(String[] args) {

		
		String str="A man, a plan, a canal: Panama";

		System.out.println(isPalindrome2(str));
	}

	
	//best approach
	private static boolean isPalindrome(String s) {


		int left=0,right=s.length()-1;
		while (left<right)
		{
		
			while (left<right&& !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			while (left<right&& !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			if (Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))) 
			{
			return false;	
			}
			
			left++;
			right--;
			
		}
		
		
		return true;
	}

	
	//brute force
	private static boolean isPalindrome2(String str) {

		
		
		String check=str.replaceAll("[^a-zA-Z0-9]", "");

		
		StringBuffer sb=new StringBuffer(check);
		String reversed= sb.reverse().toString();
		
		
		return check.equalsIgnoreCase(reversed);
	}
	
	
	 	
	
	

}
