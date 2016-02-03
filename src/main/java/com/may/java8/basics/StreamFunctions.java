package com.may.java8.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFunctions {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<>();
		strList.add("str1");
		strList.add("str2");
		strList.add("str3");
		strList.add("str4");
		strList.add("str5");

		List<String> output = strList.stream()
				.filter((str) -> str.equals("str3"))
				.collect(Collectors.toList());
		
		output.forEach((str) -> System.out.println(str));

	}

}
