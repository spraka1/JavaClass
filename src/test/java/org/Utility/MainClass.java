package org.Utility;

import java.util.List;

public class MainClass {
	
	
	
	public static void main(String[] args) {
		
		String s1="Phone";
		Integer i1 =123456;
		String s2="TV";
		Integer i2 =56789;
		String s3=null;
		Integer i3 =null;
		
		
		System.out.println(helperclass2.createWindowIdValuePairs(s1, i1, s2, i2, s3, i3));
		
		for (List<Object> object : helperclass2.createWindowIdValuePairs(s1, i1, s2, i2, s3, i3)) {
			
			for (Object object1 : object) {
				
				System.out.println(object1);
				
			}}
		
	}}
