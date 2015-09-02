package insects;

import intefaces.Insect;

public class Grasshopper implements Insect{

	@Override
	public void hatches() {
		System.out.println("Helo world I just hatched.");
		System.out.println("I am a grasshoper.");
	}

	@Override
	public void eat() {
		System.out.println("I am eating.");
	}

	@Override
	public void transform() {
		System.out.println("I am now transforming.");
	}

	@Override
	public void die() {
		System.out.println("I have reached the end of my life.");
		System.out.println("Dies.");
	}
}
