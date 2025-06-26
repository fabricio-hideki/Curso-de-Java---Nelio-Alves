import java.util.Scanner;

public class VetorMaisVelho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + ("a pessoa"));
			System.out.println("Nome: ");
			nome[i] = sc.nextLine();
			System.out.println("Idade: ");
			idade[i] = sc.nextInt();
			sc.nextLine();
		}
		
		int maisVelho = idade[0];
		String pessoa = null;
		for (int i = 0; i < n; i++) {
			if (idade[i] > maisVelho) {
				maisVelho = idade[i];
				pessoa = nome[i];
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + pessoa);
		sc.close();

	}

}
