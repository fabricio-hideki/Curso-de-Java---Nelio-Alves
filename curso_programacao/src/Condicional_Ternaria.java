import java.util.Scanner;

public class Condicional_Ternaria {

	public static void main(String[] args) {
		//Estrutura do operador ternário: 
		// (Considição) ? valor_se_verdadeiro : valor_se_falso
		
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		
		System.out.println("Desconto = " + desconto);

		sc.close();
	}

}
