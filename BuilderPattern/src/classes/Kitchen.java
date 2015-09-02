package classes;

import enums.RoomType;
import interfaces.Room;

public class Kitchen implements Room{

	@Override
	public RoomType roomType() {
		return RoomType.KITCHEN;
	}
}
