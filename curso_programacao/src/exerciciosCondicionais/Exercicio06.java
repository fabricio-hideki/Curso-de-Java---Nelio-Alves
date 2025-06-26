package exerciciosCondicionais;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio06 {
	public static void main (String[] args) {
		/* Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 */ 	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double x = sc.nextDouble();
	
		if (x > 0 && x <= 25) {
			System.out.println("Está no invervalo de [0, 25]");
		}
		else if (x >= 25 && x <= 50) {
			System.out.println("Está no intervalo de [25, 50]");
		}
		else if (x >= 50 && x <=75) {
			System.out.println("Está no intervalo de [50, 75]");
		}
		else if (x >= 75 && x <= 100) {
			System.out.println("Está no intervalo de [75, 100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();
	}
}
