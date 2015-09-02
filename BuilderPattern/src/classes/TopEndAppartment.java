package classes;

import java.util.ArrayList;

import interfaces.Appartment;
import interfaces.Room;

public abstract class TopEndAppartment implements Appartment{
	@Override
	public ArrayList<Room> appartmentRooms() {
		ArrayList<Room> topEndLayout = new ArrayList<>();
		topEndLayout.add(new Guestroom());
		topEndLayout.add(new Bedroom());
		topEndLayout.add(new Bedroom());
		topEndLayout.add(new Kitchen());
		topEndLayout.add(new Bathroom());
		topEndLayout.add(new Bathroom());
		return topEndLayout;
	}
}
