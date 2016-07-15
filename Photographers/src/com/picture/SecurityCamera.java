package com.picture;

public class SecurityCamera implements Photographer {

	@Override
	public void prepareScene() {
		System.out.println("Activate when you detect motion");

	}

	@Override
	public String takePhotograph() {
		return "Found burglars";
	}

}
