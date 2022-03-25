package quiz;

import java.util.Scanner;

class Room2 {
	private String name;
	private int roomNo;
	private boolean avail = true;
	
	public void checkIn(String name) {
		this.name = name;
		this.avail = false;
	}
	public void checkOut() {
		this.name = null;
		this.avail = true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public boolean isAvail() {
		return avail;
	}
	public void setAvail(boolean avail) {
		this.avail = avail;
	}
}

class MakeHotel {
	
	private int floor;
	private int room;
	Room2[][] hotel;
	Room2 rooms;
	
	public MakeHotel(Scanner sc) {
		System.out.println("호텔의 층 수를 입력 > ");
		floor = sc.nextInt();
		System.out.println("층 당 방 수를 입력 > ");
		room = sc.nextInt();
		hotel = new Room2[floor][room];
		
		for (int i = 0; i < hotel.length; i++) {
			for (int j = 0; j < hotel[i].length; j++) {
				rooms = new Room2();
				rooms.setRoomNo(((i+1)*100) + (j+1));
				hotel[i][j] = rooms;
			}
		}
	}
	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public Room2[][] getHotel() {
		return hotel;
	}

	public void setHotel(Room2[][] hotel) {
		this.hotel = hotel;
	}

	public Room2 getRooms() {
		return rooms;
	}

	public void setRooms(Room2 rooms) {
		this.rooms = rooms;
	}
	
}

public class HotelMgrMyVer {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MakeHotel mh = new MakeHotel(sc);
		boolean flag = true;
		
		while (flag) {
			System.out.println("\n========== 호텔 관리 메뉴 ==========");
			System.out.println("1:객실현황  2:입실  3:퇴실  Etc:종료");
			System.out.println("--------------------------------------");
			System.out.println(">>>>>>>>>>메뉴를 선택하세요>>>>>>>>>>");
			int menu = sc.nextInt();
			String name;
			int roomNo;
			
			switch (menu) {
			case 1:
				for (int i = 0; i < mh.getHotel().length; i++) {
					for (int j = 0; j < mh.getHotel()[i].length; j++) {
						System.out.print(mh.getHotel()[i][j].getRoomNo() + " " + mh.getHotel()[i][j].getName() + " " + mh.getHotel()[i][j].isAvail() + " ");
					}
					System.out.println();
				}
				break;
			case 2:
				System.out.println("입실자 성함을 입력 > ");
				name = sc.next();
				System.out.println("입실할 방번호를 입력 > ");
				roomNo = sc.nextInt();
				
				mh.getHotel()[(roomNo/100)-1][roomNo%10-1].checkIn(name);
				break;
			case 3:
				System.out.println("퇴실할 방번호를 입력 > ");
				roomNo = sc.nextInt();
				
				mh.getHotel()[(roomNo/100)-1][roomNo%10-1].checkOut();
				break;
			default:
				System.out.println("저희 호텔을 이용해 주셔서 감사합니다");
				flag = false;
				break;
			}
		}
		System.out.println("프로그램을 종료합니다");
	}
}
