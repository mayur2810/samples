package com.may.java.collections;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args) {

		/**
		 * <b> 1. HashMap </b>
		 * <p>
		 * - backed by a hash table
		 * </p>
		 * <p>
		 * - An instance of HashMap has two parameters that affect its
		 * performance: initial capacity and load factor. The capacity is the
		 * number of buckets in the hash table, and the initial capacity is
		 * simply the capacity at the time the hash table is created. The load
		 * factor is a measure of how full the hash table is allowed to get
		 * before its capacity is automatically increased. When the number of
		 * entries in the hash table exceeds the product of the load factor and
		 * the current capacity, the hash table is rehashed (that is, internal
		 * data structures are rebuilt) so that the hash table has approximately
		 * twice the number of buckets.
		 * </p>
		 * <p>
		 * - this implementation is not synchronized
		 * </p>
		 * 
		 */
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		System.out.println("HashMap :: Standard implementation");
		hashMap.put("test5", 51);
		hashMap.put("test3", 3);
		hashMap.put("test2", 2);
		hashMap.put("test1", 11);
		hashMap.put("test4", 4);
		hashMap.put("test5", 52);
		hashMap.put("test6", 6);
		hashMap.put("test1", 12);
		hashMap.forEach((k, v) -> System.out.println(k + ":" + v));

		// synchronize the wrapping object or do below
		Collections.synchronizedMap(hashMap);

		// Modification after getting iterator throws exception
		// ConcurrentModificationException.
		/*
		 * Iterator<String> it = hashMap.keySet().iterator();
		 * hashMap.put("test7", 7); it.next();
		 */

		/**
		 * <b> 2. LinekedHashMap </b>
		 * <p>
		 * - backed by a hash table and linkedlist. his implementation differs
		 * from HashMap in that it maintains a doubly-linked list running
		 * through all of its entries.
		 * </p>
		 * <p>
		 * - this implementation is not synchronized
		 * </p>
		 * 
		 */
		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		System.out.println("LinkedHashMap :: maintains insertion order");
		linkedHashMap.put("test5", 51);
		linkedHashMap.put("test3", 3);
		linkedHashMap.put("test2", 2);
		linkedHashMap.put("test1", 11);
		linkedHashMap.put("test4", 4);
		linkedHashMap.put("test5", 52);
		linkedHashMap.put("test6", 6);
		linkedHashMap.put("test1", 12);
		linkedHashMap.forEach((k, v) -> System.out.println(k + ":" + v));

		// synchronize the wrapping object or do below
		Collections.synchronizedMap(linkedHashMap);

		/**
		 * <b> 3. TreeMap </b>
		 * <p>
		 * - A Red-Black tree based NavigableMap implementation. The map is
		 * sorted according to the natural ordering of its keys or by a
		 * Comparator provided at map creation time
		 * </p>
		 * <p>
		 * - this implementation is not synchronized
		 * </p>
		 * 
		 */
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		System.out.println("TreeMap :: Keeps sorted on keys");
		treeMap.put("test5", 51);
		treeMap.put("test3", 3);
		treeMap.put("test2", 2);
		treeMap.put("test1", 11);
		treeMap.put("test4", 4);
		treeMap.put("test5", 52);
		treeMap.put("test6", 6);
		treeMap.put("test1", 12);
		treeMap.forEach((k, v) -> System.out.println(k + ":" + v));

		// synchronize the wrapping object or do below
		Collections.synchronizedMap(treeMap);

		/**
		 * <b> 4. EnumMap </b>
		 * <p>
		 * - specialized Map implementation for use with enum type keys. Enum
		 * maps are represented internally as arrays
		 * </p>
		 * <p>
		 * - this implementation is not synchronized
		 * </p>
		 * 
		 */
		Map<Day, Integer> enumMap = new EnumMap<Day, Integer>(Day.class);
		System.out.println("EnumMap :: For Enum keys");
		enumMap.put(Day.FRIDAY, 6);
		enumMap.put(Day.SUNDAY, 1);
		enumMap.put(Day.SATURDAY, 7);
		enumMap.forEach((k, v) -> System.out.println(k + ":" + v));
		
		// synchronize the wrapping object or do below
		Collections.synchronizedMap(enumMap);
		
		
		/**
		 * <b> 5. EnumMap </b>
		 * <p>
		 * - specialized Map implementation for use with enum type keys. Enum
		 * maps are represented internally as arrays
		 * </p>
		 * <p>
		 * - this implementation is not synchronized
		 * </p>
		 * 
		 */
		
	}

}
