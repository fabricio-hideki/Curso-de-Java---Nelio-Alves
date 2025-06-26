import java.util.Scanner;

public class VetorDadosPessoas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoa serão digitadas?");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			System.out.println("Altura da " + (i + 1) + "a pessoa:");
			altura[i] = sc.nextDouble();
			System.out.println("Gênero da " + (i + 1) + "a pessoa:");
			genero[i] = sc.next().charAt(0);
			sc.nextLine();
		}
		
		double menorAltura = altura[0];
		double maiorAltura = altura[0];
		double somaAlturaMulheres = 0;
		int qntdHomens = 0;
		int qntdMulheres = 0;
		
		for (int i = 0; i < n; i++) {
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			if (genero[i] == 'F' || genero[i] == 'f') {
				qntdMulheres++;
				somaAlturaMulheres += altura[i];
			}
			
			if (genero[i] == 'M' || genero[i] == 'm') {
				qntdHomens++;
			}
		}
		
		double mediaAlturaMulheres = somaAlturaMulheres / qntdMulheres;
		System.out.println("Menor altura = " + menorAltura);
		System.out.println("Maior altura = " + maiorAltura);
		System.out.printf("Media das alturas das mulheres %.2f%n", mediaAlturaMulheres);
		System.out.println("Numero de homens = " + qntdHomens);
		
		sc.close();

	}

}
