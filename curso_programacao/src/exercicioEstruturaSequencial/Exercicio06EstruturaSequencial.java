package exercicioEstruturaSequencial;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio06EstruturaSequencial {

	public static void main(String[] args) {
		/* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areat, areac, areatra, areaq, arear;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areat = A * C / 2.0;
		areac = 3.14159 * C * C;
		areatra = (A + B) / 2.0 *C;
		areaq = B * B;
		arear = A * B;
		System.out.printf("Triangulo: %.3f%n", areat);
		System.out.printf("Circulo: %.3f%n", areac);
		System.out.printf("Trapezio: %.3f%n", areatra);
		System.out.printf("Quadrado: %.3f%n", areaq);
		System.out.printf("Retangulo: %.3f%n", arear);
		
		sc.close();
		
	}

}
