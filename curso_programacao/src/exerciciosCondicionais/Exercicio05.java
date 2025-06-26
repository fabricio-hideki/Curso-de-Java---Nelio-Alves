package exerciciosCondicionais;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio05 {
	public static void main(String[] args) {
/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double preco;
		
		System.out.println("Digite o código e a quantidade: ");
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			preco = quantidade * 4.00;
		}
		else if (codigo == 2) {
			preco = quantidade * 4.50;
		}
		else if (codigo == 3) {
			preco = quantidade * 5.00;
		}
		else if (codigo == 4) {
			preco = quantidade * 2.00;
		}
		else {
			preco = quantidade * 1.50;
		}
		
		System.out.printf("Total : %.2f%n", preco);
		
		sc.close();
	}
}
