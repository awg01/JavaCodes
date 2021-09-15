package com.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Hashtable;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> akash = new TreeMap<>();
		 
        akash.put("company", "cdk");
        akash.put("branch", "computer");
        akash.put("city", "pune");
        akash.put("actor", "srk");
        akash.put("city2", "hyderabad");
//        akash.put(null, null);
//        akash.put(null, null);
        
        System.out.println(akash);
        
//        Set<String> keys = akash.keySet();
//        for(String key : keys) {
//        	System.out.println(key);
//        }
        
        //entryset 
//        Set<Entry<String, String>> entries = akash.entrySet();
//        for(Map.Entry<String, String> entry: entries) {
//        	System.out.println(entry.getKey() + " " + entry.getValue());
//        }
		
	}

}
