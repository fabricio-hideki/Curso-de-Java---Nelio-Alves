import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class VetoresAlturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoa serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] vetor = new Pessoa[n];
		
		String nome;
		int idade = 0;
		double altura = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.println("Nome: ");
			nome = sc.next();
			System.out.println("Idade: ");
			idade = sc.nextInt();
			System.out.println("Altura: ");
			altura = sc.nextDouble();
			
			vetor[i] = new Pessoa(nome, idade, altura);
		}
		
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getAltura();
		}
		double media = soma / vetor.length;
		
		System.out.printf("Altura média: %.2f%n", media );
		
		int count = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				count++;
			}
		}
		double menorDezesseis = count * 100 / vetor.length;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n ", menorDezesseis);
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}
		}

		sc.close();
	}

}
