package list.hotel;

public class Room {
	private String roomNum;
	private User user;
	private boolean isEmpty;
	private String checkInTime;
	private String checkOutTime;
	
	public Room() {}

	public Room(String roomNum, boolean isEmpty) {
		this.roomNum = roomNum;
		this.isEmpty = isEmpty;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public String getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getCheckOutTime() {
		return checkOutTime;
	}
	
	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	@Override
	public String toString() {
		return "Room [roomNum=" + roomNum + ", user=" + user + ", isEmpty=" + isEmpty + ", checkInTime=" + checkInTime
				+ ", checkOutTime=" + checkOutTime + "]";
	}
}
