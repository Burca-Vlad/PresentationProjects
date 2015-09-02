package model;

import classes.ObjectModel;

public class VideoObject extends ObjectModel{

	public VideoObject() {
		name = "Watch my video";
		description = "https://www.youtube.com/watch?v=lG79da7Uxyk";
	}
	
	@Override
	public void readObjectContents() {
		System.out.println("Reading video object " + name + "\nThat hasthe video " + description);
	}
}
