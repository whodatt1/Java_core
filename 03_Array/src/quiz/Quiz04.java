package quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// 호텔 예약 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("층수 입력하기 > ");
		int floor = sc.nextInt();
		System.out.println("방수 입력하기 > ");
		int rooms = sc.nextInt();
		String avail = "입실가능";
		
		String[][][] makeHotel = new String[floor][rooms][2];
		
		for (int i = 0; i < floor; i++) {
			for (int j = 0; j < rooms; j++) {
				if (j < 9) {
					String roomNo = String.valueOf((i+1)) + '0' + String.valueOf((j+1));
					makeHotel[i][j][0] = roomNo; 
					makeHotel[i][j][1] = avail; 
				} else {
					String roomNo = String.valueOf((i+1)) + String.valueOf((j+1));
					makeHotel[i][j][0] = roomNo; 
					makeHotel[i][j][1] = avail; 
				}
			}
		}
		
		for (String[][] floors : makeHotel) {
			for (String[] room : floors) {
				for (String info : room) {
					System.out.print(info + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		while (true) {
			System.out.println("1. 입실 , 2. 퇴실, 3. 방정보 번호를 선택하여 입력하세요 > ");
			int selectOne = sc.nextInt();
			
			if (selectOne == 1) {
				while(true) {
					System.out.println("방번호를 입력하세요 > ");
					int checkInfloor = 0;
					int checkInRoom = 0;
					int checkInRoomNo = sc.nextInt();
					if (checkInRoomNo <= 999) {
						checkInfloor = checkInRoomNo / 100;
						checkInRoom = checkInRoomNo % 10;
					} else if (checkInRoomNo >= 1000) {
						checkInfloor = checkInRoomNo / 100;
						checkInRoom = checkInRoomNo % 100;
					}
					if (makeHotel[checkInfloor -1][checkInRoom -1][1].equals("입실가능")) {
						makeHotel[checkInfloor -1][checkInRoom -1][1] = "사용중";
						break;
					} else {
						System.out.println("현재 객실은 비어있으므로 다른 객실을 선택해주세요!");
					}
				}
			} else if (selectOne == 2) {
				while(true) {
					System.out.println("방번호를 입력하세요 > ");
					int checkInfloor = 0;
					int checkInRoom = 0;
					int checkInRoomNo = sc.nextInt();
					if (checkInRoomNo <= 999) {
						checkInfloor = checkInRoomNo / 100;
						checkInRoom = checkInRoomNo % 10;
					} else if (checkInRoomNo >= 1000) {
						checkInfloor = checkInRoomNo / 100;
						checkInRoom = checkInRoomNo % 100;
					}
					if (makeHotel[checkInfloor -1][checkInRoom -1][1].equals("사용중")) {
						makeHotel[checkInfloor -1][checkInRoom -1][1] = "입실가능";
						break;
					} else {
						System.out.println("현재 객실이 사용중이므로 다른 객실을 선택해주세요!");
					}
				}
				
			} else if (selectOne == 3) {
				while(true) {
					System.out.println("방번호를 입력하세요 > ");
					int checkInfloor = 0;
					int checkInRoom = 0;
					int checkInRoomNo = sc.nextInt();
					if (checkInRoomNo <= 999) {
						checkInfloor = checkInRoomNo / 100;
						checkInRoom = checkInRoomNo % 10;
					} else if (checkInRoomNo >= 1000) {
						checkInfloor = checkInRoomNo / 100;
						checkInRoom = checkInRoomNo % 100;
					}
					System.out.println(makeHotel[checkInfloor -1][checkInRoom -1][0] + " " + makeHotel[checkInfloor -1][checkInRoom -1][1]);
					break;
				}
			}
			for (String[][] floors : makeHotel) {
				for (String[] room : floors) {
					for (String info : room) {
						System.out.print(info + " ");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
