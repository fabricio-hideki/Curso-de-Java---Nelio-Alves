import java.util.Scanner;
import entities.Alunos;

public class VetorAprovados {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		double media = 6.0;
		double somaDasNotas = 0;
		Alunos[] aluno = new Alunos[n];
		
		sc.nextLine();
		for(int i = 0; i < aluno.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			aluno[i] = new Alunos(nome, nota1, nota2);
			sc.nextLine();
			
		}
		
		System.out.println("Alunos Aprovados:");
		for (int i = 0; i < aluno.length; i++) {
			somaDasNotas = (aluno[i].getNota1() + aluno[i].getNota2()) / 2;
			if (somaDasNotas >= media) {
				System.out.println(aluno[i].getNome());
			}
		}
		
		sc.close();
	}

}
