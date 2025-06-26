import java.util.Scanner;
import java.util.Locale;
public class VetoresDadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i=0; i < n; i++) {
			System.out.println("Altura da " + (i + 1) + "a pessoa");
			altura[i] = sc.nextDouble();
			System.out.println("Genero da " + (i + 1 ) + "a pessoa");
			genero[i] = sc.next().charAt(0);
		}
		
		double menorAltura = altura[0];
		double maiorAltura = altura[0];
		double mediaAlturaMulheres = 0;
		
		for(int i=0; i<n; i++) {
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			if(altura[i] < menorAltura){
				menorAltura = altura[i];
			}
		}
		
		for (int i = 0; i < n; i++) {
			mediaAlturaMulheres += altura[i] / n;
		}
		
		System.out.println("Menor altura = " + menorAltura);
		System.out.println("Maior altura = " + maiorAltura);
		System.out.printf("Media da altura das mulheres = %.2f%n" , mediaAlturaMulheres);
		
		int numHomem = 0;
		for (int i = 0; i < n; i++) {
			if (genero[i] == 'M') {
				numHomem++;
			}
		}
		System.out.println("Numero de homens = " + numHomem);
		
		sc.close();
	}

}
