package com.may.dp.decorator;

/**
 * Stickers for your car
 */
public class CarWithVinyl  implements Car{
	
	private Car car;
	
	public CarWithVinyl(Car car){
		this.car = car;
	}

	@Override
	public String getDescription() {
		String description = "...but got the looks now!!";
		return this.car.getDescription() + description;
	}

}
