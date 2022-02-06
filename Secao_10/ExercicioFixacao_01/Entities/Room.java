package Entities;

public class Room {

	private String email;
	private String name;
	private int room;

	public Room(String email, String name, int room) {
		this.email = email;
		this.name = name;
		this.room = room;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public void Print(int rent) {
		System.out.println(rent + ": " + this.name + ", " + this.email);
	}

}
