package com.picture;

public class TrafficCamera implements Photographer {

	@Override
	public void prepareScene() {
		System.out.println("Activate when light is red");

	}

	@Override
	public String takePhotograph() {
		return "Caught red light runner";
	}

}
