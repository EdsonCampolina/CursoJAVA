package Application;

import java.util.Scanner;

import Entities.Room;

public class ExercicioFixacao01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rooms will be rented?");
		int rented = sc.nextInt();
		sc.nextLine();
		Room[] rooms = new Room[10];
		for (int i = 0; i < rented; i++) {
			System.out.println("RENT #" + (i+1));
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			rooms[room] = new Room(email, name, room);
		}
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				rooms[i].Print(i);
			}
		}

		sc.close();

	}

}
