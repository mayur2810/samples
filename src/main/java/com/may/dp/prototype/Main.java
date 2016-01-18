package com.may.dp.prototype;

public class Main {
	
	public static void main(String[] args) {
		
		UserProfile profile = UserProfileActions.getProfileClone();
		
		System.out.println(profile.toString());
		
		profile.setCity("Pune");
		profile.setCountry("India");
		
		System.out.println(profile.toString());
		
	}

}
