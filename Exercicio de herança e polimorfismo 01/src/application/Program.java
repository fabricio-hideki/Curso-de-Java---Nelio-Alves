package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of employees: ");
		int N = sc.nextInt();
		
		List<Employee> employee = new ArrayList<>();
		
		for (int i = 1; i <= N; i++ ) {
			System.out.println("Employee #" + i + " data: ");
			System.out.println("Outsourced (y/n)? ");
			char resp = sc.next().charAt(0);
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (resp == 'y') {
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employee.add(emp);
			}
			else {
				Employee emp = new Employee(name, hours, valuePerHour);
				employee.add(emp);
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee emp : employee) {
			System.out.println(emp.getName() + " - $" + emp.payment());
		}
		
		sc.close();
	}

}
