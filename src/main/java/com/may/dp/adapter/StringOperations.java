package com.may.dp.adapter;

public class StringOperations {

	private String str;

	// We have a efficient/clean implementation from other library with
	// unsupported interfaces! make StringOperation to adapt
	private NewStringOperations nsop;

	public StringOperations(String str) {
		this.str = str;
		nsop = new NewStringOperations(str);
	}

	/**
	 * A buggy implementation of trim spaces :P
	 * 
	 * @param str
	 * @return string
	 */
	/*public String trimSpaces() {
		char[] chars = str.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (char c : chars) {
			if (!(c == ' '))
				builder.append(c);
		}
		return builder.toString();
	}*/

	/**
	 * Use implementation from other lib
	 * @return
	 */
	public String trimSpaces() {
		return nsop.trim();
	}
	
	
	public String getStr() {
		return str;
	}

}
