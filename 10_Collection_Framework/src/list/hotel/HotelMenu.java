package list.hotel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelMenu {
	private ArrayList<ArrayList<Room>> hotel;
	
	public HotelMenu(ArrayList<ArrayList<Room>> hotel) {
		this.hotel = hotel;
	}
	
	public void goMenu() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while (flag) {
			System.out.println("\n========== 호텔 관리 메뉴 ==========");
			System.out.println("1:객실현황  2:입실  3:퇴실  4:객실상세조회 5:투숙객조회 Etc:종료");
			System.out.println("-------------------------------------------------------------");
			System.out.println(">>>>>>>>>>>>>>>>>>>>메뉴를 선택하세요>>>>>>>>>>>>>>>>>>>>");
			int menu = sc.nextInt();
			
			flag = choiceMenu(menu);
		}
		System.out.println("프로그램을 종료합니다");
	}

	private boolean choiceMenu(int menu) {
		switch (menu) {
		case 1:
			hotelInfo();
			break;
		case 2:
			checkInRoom();
			break;
		case 3:
			checkOutRoom();
			break;
		case 4:
			roomInfo();
			break;
		case 5:
			userInfo();
			break;

		default:
			return false;
		}
		return true;
	}

	private void userInfo() {
		for (ArrayList<Room> arrayList : hotel) {
			for (Room room : arrayList) {
				if (room.getUser() != null) {
					System.out.println(room.getUser());
				}
			}
		}
	}

	private void roomInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("조회하실 방 번호를 입력하세요");
		String roomNum = sc.next();
		for (ArrayList<Room> arrayList : hotel) {
			for (Room room : arrayList) {
				if (room.getRoomNum().equals(roomNum)) {
					System.out.println(room);
				}
			}
		}
	}

	private void checkOutRoom() {
		Scanner sc = new Scanner(System.in);
		System.out.println("퇴실하실 방 번호를 입력하세요 > ");
		String roomNum = sc.next();
		
		for (ArrayList<Room> arrayList : hotel) {
			for (Room room : arrayList) {
				if (room.getRoomNum().equals(roomNum)) {
					room.setUser(null);
					room.setEmpty(true);
					LocalDateTime todayNow = LocalDateTime.now();
					room.setCheckInTime(null);
					room.setCheckOutTime(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(todayNow));
				}
			}
		}
	}

	private void checkInRoom() {
		Scanner sc = new Scanner(System.in);
		System.out.println("성함을 입력하세요 > ");
		String name = sc.next();
		System.out.println("나이를 입력하세요 > ");
		String age = sc.next();
		System.out.println("성별을 입력하세요 > ");
		String gen = sc.next();
		System.out.println("입실하실 방 번호를 입력하세요 > ");
		String roomNum = sc.next();
		
		for (ArrayList<Room> arrayList : hotel) {
			for (Room room : arrayList) {
				if (room.getRoomNum().equals(roomNum)) {
					room.setUser(new User(name, age, gen));
					room.setEmpty(false);
					LocalDateTime todayNow = LocalDateTime.now();
					room.setCheckInTime(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(todayNow));
					room.setCheckOutTime(null);
				}
			}
		}
		System.out.println("입실이 완료되었습니다");
	}

	private void hotelInfo() {
		for (ArrayList<Room> arrayList : hotel) {
			for (Room room : arrayList) {
				System.out.print(room.getRoomNum() + "호:");
				System.out.print(room.isEmpty() ? "입실가능" : "사용중");
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
