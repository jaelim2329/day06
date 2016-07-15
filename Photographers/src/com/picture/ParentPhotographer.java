package com.picture;

public class ParentPhotographer implements Photographer {

	@Override
	public void prepareScene() {
		System.out.println("Have the child look into the camera");

	}

	@Override
	public String takePhotograph() {
		return "Child is crying";
	}

}
