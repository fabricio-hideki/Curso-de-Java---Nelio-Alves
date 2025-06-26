import java.util.Scanner;

public class VetoresMaiorPosicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] numeros = new double[n];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}

		double valor = 0;
		
		for (int i = 0; i < numeros.length; i++ ) {
			if (numeros[i] > numeros[i] + 1) {
				valor = numeros[i];
			}
		}
		double maiorValor = numeros[0];
		int pos = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maiorValor) {
				maiorValor = numeros[i];
				pos = i;
			}
		}
		
		
		System.out.println("MAIOR VALOR = " + maiorValor);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + pos);
		
		sc.close();
	}

}
