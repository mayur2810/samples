package com.may.dp.builder;

public class Car {

	protected String name;
	protected String registrationNum;

	// Optional
	protected int seats;
	protected boolean _4WD;
	protected boolean musicPlayer;
	protected boolean powerStearing;
	
	private Car(String name, String regNo){
		this.name = name;
		this.registrationNum = regNo;
	}
	

	private Car(CarBuilder builder) {

	}

	/**
	 * The builder class
	 */
	public static class CarBuilder extends Car {
		
		
		public CarBuilder(String name, String regNo){
			super(name, regNo);
		}


		public CarBuilder setSeats(int seats) {
			this.seats = seats;
			return this;
		}

		public CarBuilder hasMusicPlayer(boolean option) {
			this.musicPlayer = option;
			return this;
		}

		public CarBuilder hasPowerStearing(boolean option) {
			this.powerStearing = option;
			return this;
		}

		public CarBuilder is4WD(boolean option) {
			this._4WD = option;
			return this;
		}

		public Car build() {
			return this;
		}

	}

	public String getName() {
		return name;
	}


	public String getRegistrationNum() {
		return registrationNum;
	}


	public int getSeats() {
		return seats;
	}


	public boolean is_4WD() {
		return _4WD;
	}


	public boolean isMusicPlayer() {
		return musicPlayer;
	}


	public boolean isPowerStearing() {
		return powerStearing;
	}
	
	

}
