
public class LaçoForEach {

	public static void main(String[] args) {
		String[] vect = new String[]{"Maria", "Bob", "Alex"};
		
		// Array convencional
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		// Esse é o array de vetores/ for each
		for (String nomes: vect) {
			System.out.println(nomes);
		}
	}

}
