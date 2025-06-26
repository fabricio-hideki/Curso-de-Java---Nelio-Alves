
public class Teste {

	public static void main(String[] args) {
		int [] numeros = {10,20,30,5,3,8,17,20,9,4};
		parImpar(numeros);
		
	}
	
	public static void parImpar(int[] numeros) {
		String resp;
		for(int n: numeros) {
			if(n % 2 == 0) {
				resp = "Par";
			}
			else {
				resp = "Impar";
			}
			System.out.printf("%d:%s%n", n, resp);
		}
		
	}

}
