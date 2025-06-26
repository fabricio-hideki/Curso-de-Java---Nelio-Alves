import java.util.Locale;
import java.util.Scanner;

public class VetorMediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		
		for(int i = 0; i < n ; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		int somaPares = 0;
		int npares = 0;
		for(int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				somaPares += vect[i];
				npares++;
			}
		}
		
		if (npares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			double mediaPares = somaPares / npares;
			System.out.println("MEDIA DOS PARES " + mediaPares);
		}
		
		
		sc.close();
	}

}
