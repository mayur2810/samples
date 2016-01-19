package com.may.dp.decorator;

/**
 * Nitro for your car
 */
public class CarWithNitro implements Car {
	
	private Car car;
	
	public CarWithNitro(Car car){
		this.car = car;
	}

	@Override
	public String getDescription() {
		String description = "...you just got faster 8)";
		return this.car.getDescription() + description;
	}

}
