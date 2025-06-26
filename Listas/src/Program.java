import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		//List é uma interface, portanto deve-se instanciar uma classe que a implementa.
		//Neste exemplo, está sendo utilizado a classe ArrayList. É uma classe que faz parte da biblioteca padrão do Java. 
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
				
		System.out.println(list.size());

		for (String n : list) {
			System.out.println(n);
		}
		
		System.out.println("----------------------");
		
		//list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String n : list) {
			System.out.println(n);
		}
		
		System.out.println("----------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // ele retorna o index -1, pois não existe o nome Marco, no ArrayList.
		System.out.println("----------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x: result) {
			System.out.println(x);
		}
		
		System.out.println("----------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
}
