package exerciciosEstruturaRepetitivaFor;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for(int i = 0; i < n ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (b == 0) {
				System.out.println("divisao impossivel");	
			}
			else { 
				double divisao = (double) a /  b;
				System.out.printf("%.2f%n", divisao);
			}
		}
		sc.close();
	}

}
