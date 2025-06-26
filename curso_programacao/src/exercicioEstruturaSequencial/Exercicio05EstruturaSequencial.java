package exercicioEstruturaSequencial;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio05EstruturaSequencial {

	public static void main(String[] args) {
		/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int p1, n1, p2, n2;
		double valor1, valor2, total;
		
		System.out.println("Digite o código da peça: ");
		p1 = sc.nextInt();
		
		System.out.println("Digite o número de peças: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o Valor unitário: ");
		valor1 = sc.nextDouble();
		
		System.out.println("Digite o código da peça2: ");
		p2 = sc.nextInt();
		
		System.out.println("Digite o número de peças2: ");
		n2 = sc.nextInt();
		
		System.out.println("Digite o Valor unitário2: ");
		valor2 = sc.nextDouble();
		
		total = (valor1 * n1 ) + (valor2 * n2);
		
		System.out.printf("Valor a pagar: R$ %.2f%n", total);
		
		sc.close();
	}

}
