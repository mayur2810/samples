package com.may.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Lists {

	public static void main(String[] args) {

		/**
		 * <b> 1. ArrayList </b>
		 * <p>
		 * - offers constant-time positional access
		 * </p>
		 * <p>
		 * - this implementation is not synchronized
		 * </p>
		 * 
		 */
		System.out.println("ArrayList :: Backed by array");
		List<String> arrayList = new ArrayList<>();
		arrayList.add("list1");
		arrayList.add("list3");
		arrayList.add("list4");
		arrayList.add("list6");
		arrayList.add("list2");
		arrayList.add("list6");
		arrayList.stream().forEach(l -> System.out.println(l));

		/**
		 * <b> 2. LinkedList </b>
		 * <p>
		 * - Positional access requires linear-time
		 * </p>
		 * <p>
		 * - frequently add elements to the beginning of the List or iterate
		 * over the List to delete elements from its interior
		 * </p>
		 * <p>
		 * - this implementation is not synchronized
		 * </p>
		 * 
		 */
		System.out.println("LinkedList :: Backed by object references");
		List<String> linkedList = new LinkedList<>();
		linkedList.add("list1");
		linkedList.add("list3");
		linkedList.add("list4");
		linkedList.add("list6");
		linkedList.add("list2");
		linkedList.add("list6");
		linkedList.stream().forEach(System.out::println);
		
		
		/**
		 * <b> 3. Vector</b>
		 * <p>
		 * - offers constant-time positional access
		 * </p>
		 * <p>
		 * - this implementation IS synchronized
		 * </p>
		 * 
		 */
		System.out.println("Vector :: Backed by array and synchronised");
		List<String> vector = new Vector<>();
		vector.add("list1");
		vector.add("list3");
		vector.add("list4");
		vector.add("list6");
		vector.add("list2");
		vector.add("list6");
		vector.stream().forEach(l -> System.out.println(l));
		
		
		/**
		 * <b> 5. CopyOnWriteArrayList </b>
		 * <p>
		 * - backed up by a copy-on-write array
		 * </p>
		 * <p>
		 * - All mutative operations, such as add, set, and remove, are
		 * implemented by making a new copy of the array i.e. an immutable
		 * implementation
		 * </p>
		 * <p>
		 * - appropriate for lists that are rarely modified but frequently
		 * iterated.
		 * </p>
		 * <p>
		 * - No synchronization required
		 * </p>
		 * 
		 */
		System.out.println("CopyOnWriteArrayList :: Backed by array, new copy of array for each modifications");
		List<String> cpOnWriteArrayList = new CopyOnWriteArrayList<>();
		cpOnWriteArrayList.add("list1");
		cpOnWriteArrayList.add("list3");
		cpOnWriteArrayList.add("list4");
		cpOnWriteArrayList.add("list6");
		cpOnWriteArrayList.add("list2");
		cpOnWriteArrayList.add("list6");
		cpOnWriteArrayList.stream().forEach(l -> System.out.println(l));
		
		
		

	}

}
