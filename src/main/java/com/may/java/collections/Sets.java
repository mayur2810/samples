package com.may.java.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args) {

		/**
		 * <b> 1. HashSet </b>
		 * <p>
		 * - backed by a hash table (actually a HashMap instance).
		 * </p>
		 * <p>
		 * - It makes no guarantees as to the iteration order of the set
		 * </p>
		 * <p>
		 * - this implementation is not synchronized
		 * </p>
		 * 
		 */
		Set<String> hashSet = new HashSet<String>();
		System.out.println("Hashset: Standard implementation");
		hashSet.add("test1");
		hashSet.add("test2");
		hashSet.add("test3");
		hashSet.add("test1");
		hashSet.add("test4");
		hashSet.add("test5");
		hashSet.add("test5");
		hashSet.add("test6");
		hashSet.stream().forEach(str -> System.out.println(str));

		// synchronize the wrapping object or do below
		Collections.synchronizedSet(hashSet);

		// Modification after getting iterator throws exception
		// ConcurrentModificationException.
		/*
		 * Iterator<String> it = hashSet.iterator(); hashSet.add("test7");
		 * it.next();
		 */

		/**
		 * <b> 2. LinkedHashSet </b>
		 * <p>
		 * - Hash table and linked list implementation of the Set interface,
		 * with predictable iteration order
		 * </p>
		 * <p>
		 * - this implementation is not synchronized
		 * </p>
		 * 
		 */
		System.out.println("LinkedHashset: Maintain insertion order");
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("test1");
		linkedHashSet.add("test2");
		linkedHashSet.add("test3");
		linkedHashSet.add("test1");
		linkedHashSet.add("test4");
		linkedHashSet.add("test5");
		linkedHashSet.add("test5");
		linkedHashSet.add("test6");
		linkedHashSet.stream().forEach(str -> System.out.println(str));

		// synchronize the wrapping object or do below
		Collections.synchronizedSet(linkedHashSet);

		// Modification after getting iterator throws exception
		// ConcurrentModificationException.
		/*
		 * Iterator<String> it1 = linkedHashSet.iterator();
		 * linkedHashSet.add("test7"); it1.next();
		 */

		/**
		 * <b> 3. TreeSet </b>
		 * <p>
		 * - Implements NavigableSet and SortedSet interfaces
		 * </p>
		 * <p>
		 * - A NavigableSet implementation based on a TreeMap. The elements are
		 * ordered using their natural ordering, or by a Comparator provided at
		 * set creation time
		 * </p>
		 * <p>
		 * - this implementation is not synchronized
		 * </p>
		 * 
		 */
		System.out.println("TreeSet: Sorted");
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("test2");
		treeSet.add("test1");
		treeSet.add("test3");
		treeSet.add("test1");
		treeSet.add("test4");
		treeSet.add("test7");
		treeSet.add("test5");
		treeSet.add("test6");
		treeSet.stream().forEach(str -> System.out.println(str));

	}

}
