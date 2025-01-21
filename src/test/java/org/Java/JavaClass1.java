package org.Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JavaClass1 {

	
	public static void main(String[] args) {
		
		
		List <Integer> list = new ArrayList <Integer>();
		list.add(125);
		list.add(545);
		list.add(100);
		list.add(799);
		list.add(666);
		list.add(666);
		list.add(125);
		list.add(277);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		Set <Integer> set = new TreeSet <Integer>(list);
		
		System.out.println(set);
	}
}
