package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> pessoa = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.println("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Anual Income: ");
			double income = sc.nextDouble();
			if(ch == 'c') {
				System.out.println("Number of employess: ");
				int employeesNumber = sc.nextInt();
				pessoa.add(new Juridica(name, income, employeesNumber));
			}
			else{
				System.out.println("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				pessoa.add(new Fisica(name, income, healthExpenditures));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		double sum = 0;
		for(Pessoa p : pessoa) {
			sum += p.fee();
			System.out.println(p.getName() + ": $ "  + String.format("%.2f", p.fee()));
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}

}
