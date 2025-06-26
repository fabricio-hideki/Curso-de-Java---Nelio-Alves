import java.util.Scanner;

public class SomaDoisVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
	
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}
		
		
		System.out.println("VETOR RESULTANTE");
		int somaVetores = 0;
		for (int i = 0; i < n; i++) {
			somaVetores = vectA[i] + vectB[i];
			System.out.println(somaVetores);
		}
		
		// Também poderia ter sido feito um terceiro vetor "c", para armazenar a soma dos outros dois vetores.
			
		sc.close();
	}
	
		
}
