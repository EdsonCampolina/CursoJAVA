package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		File file = new File("D:\\WORKSPACES\\WS_ECLIPSE\\secao15.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException ex) {
			System.out.println("Error opening file: " + ex.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally");
		}
	}
}
