package com.may.dp.builder;

public class Main {
	
	public static void main(String[] args) {
		
		//Call the builder to set the properties needed and we get a super object with many attribs
		Car mini = new Car.CarBuilder("Mini Copper", "MH121212").setSeats(3)
				.is4WD(true).hasMusicPlayer(true).hasPowerStearing(false);
		
		System.out.println(mini.is_4WD());
		System.out.println(mini.isMusicPlayer());
		System.out.println(mini.isPowerStearing());
		
	}

}
