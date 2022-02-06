package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class ExercicioProposto01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1));
			System.out.println("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			employees.add(new Employee(name, id, salary));
		}
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp != null) {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.IncreaseSalary(percentage);
		} else {
			System.out.println("This id does not exist!");
		}
		for (Employee entitie : employees) {
			
			entitie.Print();
		}

		sc.close();
	}

}
