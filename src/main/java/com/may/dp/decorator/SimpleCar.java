package com.may.dp.decorator;

/**
 *blah blah.  A simple car. 
 */
public class SimpleCar implements Car {
	
	String name;
	
	public SimpleCar(String name) {
		this.name = name;
	}

	public String getDescription() {
		return name+ ": You are a Simple Car. You Suck :\\";
	}

}
