package animals;

import intefaces.Mamal;

public class Rat implements Mamal{
	
	@Override
	public void isBorn() {
		System.out.println("Helo world I was just born.");
		System.out.println("I am a rat.");
	}

	@Override
	public void eat() {
		System.out.println("I am now eating.");
	}

	@Override
	public void drink() {
		System.out.println("I am now drinking.");
	}

	@Override
	public void die() {
		System.out.println("I have reached the end of my life.");
		System.out.println("Dies.");
	}
}
