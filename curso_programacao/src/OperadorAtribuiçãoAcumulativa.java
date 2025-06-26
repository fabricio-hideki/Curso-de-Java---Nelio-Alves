
import java.util.Scanner;
import java.util.Locale;

public class OperadorAtribuiçãoAcumulativa {

	public static void main(String[] args) {
		/*Os operadorse de atribuição comulativo são:
		 * a += b é a mesma coisa que a = a + b
		 * a -= b é a mesma coisa que a = a - b
		 * */ 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		
		}
		System.out.println("Valor a pagar: " + conta);
		sc.close();
	}

}
