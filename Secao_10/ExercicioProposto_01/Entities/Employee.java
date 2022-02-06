package Entities;

public class Employee {

	private String name;
	private int id;
	private double salary;

	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void IncreaseSalary(double value) {
		this.salary *= (1 + (value / 100));
	}

	public void Print() {
		System.out.print(this.id + ", ");
		System.out.print(this.name);
		System.out.printf(", %.2f\n", this.salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
