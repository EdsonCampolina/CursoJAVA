package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		method1();

		System.out.println("End of program!");
	}

	public static void method1() {
		System.out.println("Start method 1");
		method2();
		System.out.println("End method 1");
	}

	public static void method2() {
		System.out.println("Start method 2");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Invalid position!");
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
			sc.next();
		} catch (InputMismatchException ex) {
			System.out.println("Input error!");
		}

		sc.close();
		System.out.println("End method 2");
	}

}
