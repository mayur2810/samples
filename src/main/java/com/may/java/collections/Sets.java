package com.may.java.collections;

import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class Sets {

	enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

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
		System.out.println("Hashset :: Standard implementation");
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
		 * with predictable iteration order. Can be also used as sorted set, if
		 * elements are inserted in sorted order, will cause less overhead than
		 * tree set
		 * </p>
		 * <p>
		 * - this implementation is not synchronized.
		 * </p>
		 * 
		 */
		System.out.println("LinkedHashset :: Maintain insertion order");
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
		System.out.println("TreeSet :: Sorted");
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

		/**
		 * <b> 4. EnumSet </b>
		 * <p>
		 * - Set implementation for enum types. All of the members of an enum
		 * set must be of the same enum type
		 * </p>
		 * <p>
		 * - Enum sets support iteration over ranges of enum types
		 * </p>
		 * 
		 */
		System.out.println("EnumSet :: Set of enum :P");
		EnumSet<Day> enumSet = EnumSet.range(Day.MONDAY, Day.FRIDAY);
		enumSet.forEach(
				d -> System.out.println(d));
		Iterator<Day> it4 = enumSet.iterator();
		enumSet.add(Day.SUNDAY);
		it4.next();
		
		

		/**
		 * <b> 5. CopyOnWriteArraySet </b>
		 * <p>
		 * - backed up by a copy-on-write array
		 * </p>
		 * <p>
		 * - All mutative operations, such as add, set, and remove, are
		 * implemented by making a new copy of the array i.e. an immutable
		 * implementation
		 * </p>
		 * <p>
		 * - appropriate for sets that are rarely modified but frequently
		 * iterated.
		 * </p>
		 * <p>
		 * - No sychronization required
		 * </p>
		 * 
		 */
		System.out.println("CopyOnWriteArraySet :: immutable set");
		Set<String> cpOnWrSet = new CopyOnWriteArraySet<String>();
		cpOnWrSet.add("cpwritetest1");
		cpOnWrSet.add("cpwritetest3"); //New copy of array for each insert, removal
		cpOnWrSet.add("cpwritetest4");
		cpOnWrSet.add("cpwritetest2");
		cpOnWrSet.stream().forEach(str -> System.out.println(str));

	}

}
