import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int qntdperguntas = 5;
		
		String[] perguntas = 
			{"Qual a maior estrela do nosso sistema solar?", 
		     "Qual a primeira letra do nosso Alfabeto?",
			 "2x10 é igual a:",
			 "O fantástico mundo de ___. (desenho anos 80)",
			 "Valor de PI?"};
		
		char [] gabarito = {'a','a','b','c','d'};
		
		String [] alternativas = 
			{"a) Sol / b)Lua / c) Marte",
			 "a) Z / b)C / c)A",
			 "a)10 / b)20 / c) 12",
			 "a)Bob / b)Carl / c) Zec",
			 "a)3.10 / b)3  / c)3.14"};
		
		System.out.println("Digite o seu nome: ");
		String nome = sc.nextLine();
		
		char[] respostas = new char[qntdperguntas];
		char resp;
		int pontoQuestao = 2;
		int nota = 0;
		
		for(int i = 0; i < qntdperguntas; i++) {
			System.out.println("-----------------------------");
			System.out.println("Pergunta " + (i+1));
			System.out.println(perguntas[i]);
			System.out.println(alternativas[i]);
			resp = sc.nextLine().charAt(0);
			respostas[i] = resp;
			
		}
		
		for(int i = 0; i < qntdperguntas; i++) {
			if(gabarito[i] == respostas[i]) {
			 nota += pontoQuestao;
			}
		}
		System.out.println("Fim da prova, confira o resultado;");
		System.out.println(nome + " sua nota foi " + nota + " você foi " +(nota >=6 ? "aprovado" : "reprovado"));
		
		sc.close();
	
	
	}
}
