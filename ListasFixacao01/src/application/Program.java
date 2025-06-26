package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		
		ArrayList<Employee> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.println("Id already taken, try another one: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
		}
		System.out.println();
		System.out.println("Enter the employee that will have salary increase: ");
		Integer id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist! ");
		}else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee e : list) {
			System.out.println(e);
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
}
