import java.util.Scanner;

public class VetorMaisVelho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n" , n + 1);
			System.out.println("Nome: ");
			nome[i] = sc.next();
			System.out.println("Idade: ");
			idade[i] = sc.nextInt();
		}

		int maisVelho = idade[0];
		String name = nome[0];
		
		for(int i = 1; i < n; i++) {
			if(idade[i] > maisVelho) {
				maisVelho = idade[i];
				name = nome[i];
			}
		}
	
		System.out.println("PESSOA MAIS VELHA: " + name);
		sc.close();
	}

}
