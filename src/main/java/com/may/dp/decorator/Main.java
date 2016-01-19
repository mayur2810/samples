package com.may.dp.decorator;

public class Main {
	
	public static void main(String[] args) {
		
		Car indica = new SimpleCar("Tata Indica");
		System.out.println(indica.getDescription());
		
		Car updrage1 = new CarWithVinyl(indica);
		System.out.println(updrage1.getDescription());
		
		Car updrage2 = new CarWithNitro(indica);
		System.out.println(updrage2.getDescription());
		
		System.out.println(indica.getDescription());
		
		//Chained
		Car allUpgrades = new CarWithNitro(new CarWithVinyl(new SimpleCar("Tata Nano")));
		System.out.println(allUpgrades.getDescription());
		
		
	}

}
