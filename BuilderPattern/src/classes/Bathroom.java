package classes;

import enums.RoomType;
import interfaces.Room;

public class Bathroom implements Room{

	@Override
	public RoomType roomType() {
		return RoomType.BATHROOM;
	}
}
