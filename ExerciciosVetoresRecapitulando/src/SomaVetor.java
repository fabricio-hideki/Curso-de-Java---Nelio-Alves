import java.util.Scanner;
import java.util.Locale;


public class SomaVetor {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos numeros você vai digitar?");
		int n = sc.nextInt();
		double [] vetor = new double[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero: ");
			vetor [i] = sc.nextDouble();
		}

		System.out.print("VALORES = " );
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

		double sum  = 0;
		for (int i = 0; i < vetor.length; i++) {
			sum += vetor[i];
		}
		double media = sum / vetor.length;
		
		System.out.printf("\nSOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f%n", media);

		
		sc.close();
	}
}
