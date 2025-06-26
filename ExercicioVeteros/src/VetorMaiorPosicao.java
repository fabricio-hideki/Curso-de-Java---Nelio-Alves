import java.util.Scanner;

public class VetorMaiorPosicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double maior = vect[0];
		int posMaior = 0;
		
		for(int i = 1; i < vect.length; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posMaior = i;
			}
		}
		
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posMaior);
		
		
		sc.close();
	}

}
