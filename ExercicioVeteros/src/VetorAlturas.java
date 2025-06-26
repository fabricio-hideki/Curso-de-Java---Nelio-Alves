import java.util.Locale;
import java.util.Scanner;

public class VetorAlturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		double soma = 0.0;
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.println("Nome:");
			nome[i] = sc.next();	
			System.out.println("Idade:");
			idade[i] = sc.nextInt();
			System.out.println("Altura:");
			altura[i] = sc.nextDouble();
			
			soma += altura[i];
		}
		
		double media = soma / n;
		
		System.out.printf("Altura média: %.2f%n" , media);
		
		
		double menores = 0;
		double alturaTotal = 0;
		for(int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				menores++;
			}
		}
		
		double percentualMenores = ((double)menores / n ) * 100.0;
			
		System.out.println("Pessoas com menos de 16 anos: " + percentualMenores + "%");
	
		for(int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}
