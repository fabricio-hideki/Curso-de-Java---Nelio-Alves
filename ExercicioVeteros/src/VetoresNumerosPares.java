import java.util.Locale;
import java.util.Scanner;

public class VetoresNumerosPares {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
		
		}
		
		int quantidadePares = 0;
		System.out.println("NUMERO PARES: ");
		for(int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.println(vect[i]);
				quantidadePares++;
			}
		
		}
		
		System.out.println("QUANTIDADE DE PARES = "  + quantidadePares);
		
		
		sc.close();
	}
}
