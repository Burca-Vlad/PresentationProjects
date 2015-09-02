package classes;

import enums.RoomType;
import interfaces.Room;

public class Bedroom implements Room{

	@Override
	public RoomType roomType() {
		return RoomType.BEEDROOM;
	}
}
