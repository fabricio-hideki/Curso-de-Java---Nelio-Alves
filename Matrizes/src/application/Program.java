package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da matriz: ");
		int n = sc.nextInt();
		int [][] matriz = new int [n][n];
		
		System.out.println("Digite os valores da matriz: ");
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++ ) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for (int i = 0; i < n; i++) {
			System.out.println(matriz[i][i] + " ");
		}
		
		int countNegativos = 0;
		for (int i =0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					countNegativos++;
				}
			}
		}
		System.out.println();
		System.out.println("Negative numbers = " + countNegativos);
		sc.close();

	}

}
