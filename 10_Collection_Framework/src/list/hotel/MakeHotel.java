package list.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class MakeHotel {

	private ArrayList<ArrayList<Room>> hotel = new ArrayList<ArrayList<Room>>();
	

	public MakeHotel(ArrayList<Room> hotelRooms) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("호텔의 층 수를 입력 > ");
		int floorCount = sc.nextInt();
		System.out.println("층 당 방 수를 입력 > ");
		int roomCount = sc.nextInt();
		
		initRooms(floorCount, roomCount, hotelRooms);
	}

	private void initRooms(int floorCount, int roomCount, ArrayList<Room> hotelRooms) {
		for (int i = 0; i < floorCount; i++) {
			for (int j = 0; j < roomCount; j++) {
				hotelRooms.add(new Room(makeRoomNum(i, j), true));
			}
			hotel.add(hotelRooms);
		}
		
	}

	private String makeRoomNum(int i, int j) {
		String roomNum = "";
		if (j < 9) {
			roomNum = "0"+ String.valueOf(j+1);
		} else {
			roomNum = String.valueOf(j+1);
		}		
		return String.valueOf(i+1) + roomNum;
	}

	public ArrayList<ArrayList<Room>> getHotel() {
		return hotel;
	}
}
