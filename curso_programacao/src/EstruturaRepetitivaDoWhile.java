import java.util.Scanner;
import java.util.Locale;
public class EstruturaRepetitivaDoWhile {

	public static void main(String[] args) {
		// a diferença do do-while para o for é que o do-while executa o código pelo menos uma vez, enquanto o for apenas se a condição for verdadeira.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.println("Digite a temperatura em Celsius:");
			double c = sc.nextDouble();
			double formula = 9 * c / 5 + 32; 
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", formula);
			System.out.println("Deseja repetir (s/n)?");
			resp = sc.next() .charAt(0);
		} while (resp != 'n');
		
		sc.close();
	
	}

}
