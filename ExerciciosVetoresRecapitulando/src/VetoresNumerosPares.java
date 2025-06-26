import java.util.Scanner;

public class VetoresNumerosPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] v = new int[n];
		
		System.out.println();
		int pares = 0;
		for (int i = 0; i < v.length; i++) {
			System.out.println("Digite um numero: ");
			v[i] = sc.nextInt();
	
		}
		
		System.out.println("NUMEROS PARES: ");
		for (int i = 0 ; i < v.length; i++) {
			if (v[i] % 2 == 0) {
				System.out.print(v[i] + " ");
				pares++;
			}
		}
		System.out.println();
		System.out.println("\nQUANTIDADE DE PARES = " + pares);
		sc.close();
	}

}
