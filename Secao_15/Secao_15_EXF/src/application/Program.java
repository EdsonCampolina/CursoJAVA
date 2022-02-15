package application;

import java.util.Scanner;

import entities.Account;
import exceptions.WithdrawException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			System.out.println();
			Account account = new Account(number, holder, initialBalance, withdrawLimit);
			System.out.print("Enter the amount for withdraw: ");
			Double withdraw = sc.nextDouble();
			account.withdraw(withdraw);
			System.out.println("New balance: "+ account.getBalance());
		}catch(WithdrawException ex) {
			System.out.println("Withdraw error: "+ ex.getMessage());
		}
		sc.close();
	}

}
