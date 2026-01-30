package com.Arrayy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EncodeAndDecode {

	public static void main(String[] args) {
		List<String> list =Arrays.asList("neet","code","love","you");
		
           String sts = encode(list);
		List<String> s = decode(sts);
		System.out.println(s);
	}

	public static String encode(List<String> strs) {

		if (strs.isEmpty()) {
			return "";
		}

		StringBuffer sb = new StringBuffer();

		for (String st : strs) {
			sb.append(st.length());
			sb.append("#");
			sb.append(st);

		}

		return sb.toString();

	}

	 public static List<String> decode(String str) {
	        List<String> res = new ArrayList<>();
	        int i = 0;
	        while (i < str.length()) {
	            int j = i;
	            while (str.charAt(j) != '#') {
	                j++;
	            }
	            int length = Integer.parseInt(str.substring(i, j));
	            i = j + 1;
	            j = i + length;
	            res.add(str.substring(i, j));
	            i = j;
	        }
	        return res;
	    }
}
