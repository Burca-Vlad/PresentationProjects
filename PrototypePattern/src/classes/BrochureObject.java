package classes;

public class BrochureObject extends ObjectModel{

	public BrochureObject(){
		name = "This is a new promotion!";
		description = "Or new line of products are amazing. \nCome and see our offer!";
	}

	@Override
	public void readObjectContents() {
		System.out.println("Reading brochure object " + name + "\nThat has the message " + description);
	}
}
