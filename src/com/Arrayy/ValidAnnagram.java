package com.Arrayy;

import java.util.Arrays;

public class ValidAnnagram {

	public static void main(String[] args) {

		String s="jar";
		String t="jam";
		
	boolean b=	validAnnagramm(s,t);
		System.out.println(b);
		
	}

	private static boolean validAnnagramm(String s,String t)
	{
		char a[]=s.toCharArray();
		char b[]=t.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);

		return new String(a).equals(new String(b));
		
		
		
	}

}
