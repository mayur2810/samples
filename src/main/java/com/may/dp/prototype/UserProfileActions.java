package com.may.dp.prototype;

public class UserProfileActions {

	private static UserProfile userProfilePrototype;

	// Load once, may be it is loaded from database which is expensive
	private static void getProfile() {

		if (userProfilePrototype == null) {
			userProfilePrototype = new UserProfile();
			userProfilePrototype.setFirstName("Issac");
			userProfilePrototype.setLastName("Newton");
			userProfilePrototype.setCity("Zurich");
			userProfilePrototype.setCountry("Germany");
		}

	}

	static {
		getProfile();
	}

	/**
	 * Clone the object
	 * @return
	 */
	public static UserProfile getProfileClone() {

		UserProfile clone = null;
		try {
			clone = (UserProfile) userProfilePrototype.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

}
