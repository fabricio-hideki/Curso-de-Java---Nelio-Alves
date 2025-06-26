package exercicioEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04EstruturaSequencial {

	public static void main(String[] args) {
		/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		decimais. */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu número: ");
		
		int num_func, hr_tr;
		double  vl_hr, salario;
		
		num_func = sc.nextInt();
		
		System.out.println("Digite suas horas trabalhadas:");
		
		hr_tr = sc.nextInt();
		System.out.println("Digite o valor por hora: ");
		vl_hr = sc.nextDouble();
		salario = hr_tr * vl_hr;
		
		System.out.println("Numero = " + num_func);
		System.out.printf("Salário = U$ %.2f%n", salario );
		
		
		sc.close();
		
	}

}
