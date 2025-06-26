package exercicioEstruturaSequencial;

import java.util.Scanner;

public class Exercicio01EstruturaSequencial {

	public static void main(String[] args) {
		
		/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		mensagem explicativa, conforme exemplos.*/
			
		Scanner sc = new Scanner(System.in);	
		int x, y, soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		soma = x + y;
		
		System.out.println("Soma = " + soma);
		
		sc.close();
	}

}
