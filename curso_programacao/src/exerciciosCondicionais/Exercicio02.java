package exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Digite um número inteiro: ");
		x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("Esse número é par");
		}
		else {
			System.out.println("Esse número é ímpar");
		}
		
		sc.close();
	}

}
