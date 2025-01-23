package org.Utility;

import java.util.ArrayList;
import java.util.List;

public class helperclass1 {
    
 
    public static List<Object> list1;
    public static List<Object> list2;
    public static List<Object> list3;
    public static List<Object> list4;
    public static ArrayList<Object> listAll;
    public static String windowID;
    public static Integer windowIDValue;

    public void ListsMethod() {
    	list1 = new ArrayList<Object>();
    	list2 = new ArrayList<Object>();
    	listAll = new ArrayList<Object>();
    	
    	windowID = "Device";
    	windowIDValue = 125;
    	list1.add(windowID);
    	list1.add(windowIDValue);
    	
    	
    	list2.add(windowID);
    	list2.add(windowIDValue);
    	
  
    	
    	
    	listAll.add(list1);
    	listAll.add(list2);
    	
	}
    
    public static void main(String[] args) {
      
    	
    	
    	list1 = new ArrayList<Object>();
    	
    	
    	list2 = new ArrayList<Object>();
    	listAll = new ArrayList<Object>();
    	
    	windowID = "Device";
    	windowIDValue = 125;
    	list1.add(windowID);
    	list1.add(windowIDValue);
    	
    	
    	list2.add(windowID);
    	list2.add(windowIDValue);
    	
    	
    	listAll.add(list1);
    	listAll.add(list2);
    	System.out.println(listAll);
    	
    	
    	
      
    }}
