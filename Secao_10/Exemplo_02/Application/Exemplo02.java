package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class Exemplo02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String productName = sc.nextLine();
			double productPrice = sc.nextDouble();
			vect[i] = new Product(productName, productPrice);
		}
		double sum = 0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		System.out.printf("AVG PRICE : %.2f\n", avg);
		sc.close();

	}

}
