import java.util.Scanner;

public class VetorAbaixoDaMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[]v = new double[n];
		
		double media = 0;
		for (int i = 0; i < v.length; i++) {
			System.out.println("Digite um numero: ");
			v[i] = sc.nextDouble();
			media += v[i] / v.length;
		}
		
		System.out.println("MEDIA DO VETOR = " + media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < v.length; i++) {
			if (v[i] < media) {
				System.out.println(v[i]);
			}
		}
		sc.close();
	}

}
