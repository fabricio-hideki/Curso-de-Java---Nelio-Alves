import java.util.Locale;
import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		// leitura de dados do tipo String
		String x;
		System.out.println("Digite uma mensagem:");
		x = sc.next();
		System.out.println("Você digitou: " + x);

		// leitura de dados do tipo int
		int y;
		System.out.println("\nDigite um número inteiro:");
		y = sc.nextInt();
		System.out.println("Você digitou o número: " + y);

		// leitura de dados do tipo double
		double z;
		System.out.println("\nDigite um número decimal: ");
		z = sc.nextDouble();
		System.out.printf("Você digitou o número decimal: %.2f%n", z);

		// leitura de dados do tipo char
		char u;
		System.out.println("\nDigite um caractére: ");
		u = sc.next().charAt(0);
		System.out.println("Você digitou o caractére " + u);
		
		// Leitura de texto até a quebra de linha
		int n1;
		String s1, s2, s3;
		
		n1 = sc.nextInt();
		sc.nextLine(); // serve para limpar o buffer de leitura, ou seja, ela armazena a linha pendente, e não interfere no código abaixo:
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(n1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);


		sc.close();
	}

}
