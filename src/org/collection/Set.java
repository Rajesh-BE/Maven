package org.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
	public static void main(String[] args) {
		HashSet<Object> ref = new HashSet<>();//HashSet
		ref.add(10);
		ref.add("Testing");
		ref.add("Software");
		System.out.println(ref);//Add
		int size = ref.size();
		System.out.println(size);//Size
		boolean contains=ref.contains("java");
		System.out.println(contains);//Contains
		LinkedHashSet<Integer> ref1=new LinkedHashSet<>();//LinkedHashSet
		ref1.add(20);
		ref1.add(30);
		ref.addAll(ref1);
		System.out.println(ref);//addAll
		ref1.removeAll(ref1);
		System.out.println(ref1);//removeAll
		ref1.add(40);
		System.out.println(ref1);//Add
		TreeSet<Object> ref2=new TreeSet<>();//TreeSet
		ref2.add(1000);
		ref2.add(500);
		ref2.add(1010);
		System.out.println(ref2);//Add
		ref.addAll(ref2);
		System.out.println(ref);//addALL
		ref2.clear();
		System.out.println(ref2);//Clear
		
		
		}

}
