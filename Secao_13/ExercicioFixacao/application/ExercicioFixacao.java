package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrderEX;
import entities.OrderItem;
import entities.Product;
import entities.enums.Status;

public class ExercicioFixacao {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.nextLine();
		Date birthDateClient = sdf1.parse(birthDate);
		Client client = new Client(name, email, birthDateClient);
		System.out.println("Enter order data:");
		System.out.println("Status:");
		System.out.println("PENDING_PAYMENT");
		System.out.println("PROCESSING");
		System.out.println("SHIPPED");
		System.out.println("DELIVERED");
		String status = sc.nextLine();
		OrderEX order = new OrderEX(client, Status.valueOf(status));
		System.out.print("How many items to this order? ");
		int itemsNumber = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= itemsNumber; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer productQuantity = sc.nextInt();
			order.addItem(new OrderItem(productQuantity, new Product(productName, productPrice)));
			sc.nextLine();
		}
		System.out.println("\nORDER SUMMARY:");
		System.out.println(order);
		sc.close();

	}

}
