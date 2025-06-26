import java.util.Scanner;

public class VetorMediaPares {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] v = new int [n];
		
		for(int i = 0; i < v.length; i++) {
			System.out.println("Digite um numero: ");
			v[i] = sc.nextInt();
		}
		
		double somaPares = 0;
		int countPares = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 == 0) {
				somaPares += v[i];
				countPares++;
			}
		}
		double mediaPares = somaPares / countPares;
		if (countPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			System.out.println("MEDIA DOS PARES = " + mediaPares);
			
		}
	
		sc.close();
	}
}
