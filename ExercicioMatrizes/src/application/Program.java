package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas da matriz: ");
		int m = sc.nextInt();
		System.out.println("Digite a quantidade de colunas da matriz: ");
		int n = sc.nextInt();
		
		int [][] matriz = new int [m][n];
		System.out.println("Digite os valores: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite o número X: ");
		int x = sc.nextInt();
		
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz [i][j] == x) {
					System.out.println("Position " + i + "," + j + ": ");
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if(j < matriz[i].length -1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if(i < matriz[i].length - 1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
			
		}
		sc.close();

	}

}
