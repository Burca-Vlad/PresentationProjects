package classes;

import java.util.ArrayList;

import interfaces.Appartment;
import interfaces.Room;

public abstract class StandardAppartment implements Appartment{

	@Override
	public ArrayList<Room> appartmentRooms() {
		ArrayList<Room> standardLayout = new ArrayList<>();
		standardLayout.add(new Bedroom());
		standardLayout.add(new Kitchen());
		standardLayout.add(new Bathroom());
		return standardLayout;
	}
}
