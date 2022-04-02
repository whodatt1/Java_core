package list.hotel;

import java.util.ArrayList;

public class Hotel {

	public static void main(String[] args) {
		ArrayList<Room> hotelRooms = new ArrayList<Room>();
		MakeHotel makeHotel = new MakeHotel(hotelRooms);
		HotelMenu hotelMenu = new HotelMenu(makeHotel.getHotel());
		hotelMenu.goMenu();
	}
}
