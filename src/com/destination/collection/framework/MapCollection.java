package com.destination.collection.framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection {
   public static void main(String[] args) {
	   Map<String,Integer> mp = new HashMap<>();
	    mp.put("deepak",1);
	    mp.put("Rahul", 2);
	    mp.put("ravi", 3);
	    mp.put("part", 4);
	    mp.put("patel", 2);
	    System.out.println("This is HashMap");
	    
	    mp.forEach((key,value)->{
	    	System.out.println("key"+key+" "+"value"+value);
	    });
	    
//	    System.out.println(mp.get("deepak"));
//	    System.out.println(mp.remove("deepak"));
//	    System.out.println(mp.containsKey("part"));
	    System.out.println(mp);
	   
	    
	    //Link hashmap;
//	    Map<String,Integer> mp1 = new LinkedHashMap<String,Integer>();
//	    mp1.put("deepak",1);
//	    mp1.put("Rahul", 2);
//	    mp1.put("ravi", 3);
//	    mp1.put("part", 4);
//	    mp1.put("patel", 2);
//	    System.out.println("This is LinkedHashMap");
//	    System.out.println(mp1);
//	    
//	    
//	    //treehashmap
//	    
//	    Map<String, Integer> mp2 = new TreeMap<String, Integer>();
//	    mp2.put("deepak",1);
//	    mp2.put("Rahul", 2);
//	    mp2.put("ravi", 3);
//	    mp2.put("parth", 4);
//	    mp2.put("patel", 2);
//	    System.out.println("This is TreeMap");
//	    System.out.println(mp2);
	    
	    
	    
	    
}
   
}
