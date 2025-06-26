package exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int x;
		x = sc.nextInt();
		
		if(x > 0) {
			System.out.println("Esse número é positivo!");
		}
		else {
			System.out.println("Esse número é negativo!");
		}
		
		sc.close();

	}

}
