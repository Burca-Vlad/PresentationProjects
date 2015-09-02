package classes;

import enums.RoomType;
import interfaces.Room;

public class Guestroom implements Room{

	@Override
	public RoomType roomType() {
		return RoomType.GUESTROOM;
	}
}
