package org.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Maps {
	public static void main(String[] args) {
		Map<Integer,String> ref=new HashMap<>();//HashMap()
		ref.put(22,"Varun");
		ref.put(23,"Rajesh");
		System.out.println(ref);//Put()
		boolean containsKey = ref.containsKey(22);//ContainsKey()
		System.out.println(containsKey);
	    boolean containsValue = ref.containsValue("Java");
	    System.out.println(containsValue);//ContainsValue()
	    Map<Integer,String> ref1=new LinkedHashMap<>();//LinkedHashMap
	    ref1.put(10,"Ten" );
	    ref1.put(20, "Twenty");
	    System.out.println(ref1);//Put()
	    String string=ref1.get(10);
	    System.out.println(string);//Get()
	    System.out.println(ref1.values());//Values()
	    Map<Integer,String>ref2=new TreeMap<>();//TreeMap
	    ref2.put(1,"Apple");
	    ref2.put(2, "Banana");
	    System.out.println(ref2);//Put()
	    int size=ref2.size();
	    System.out.println(size);//Size()
	    System.out.println(ref1.keySet());//Keyset()
	    Set<Entry<Integer, String>> entrySet = ref.entrySet();
	    for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);//Entryset()
		Map<Integer, String> ref3= new ConcurrentHashMap<>();
		ref3.put(380, "result");
		ref3.put(802, "result");
		System.out.println(ref3);
		
		}
	   
	    
	
		
	}

}

