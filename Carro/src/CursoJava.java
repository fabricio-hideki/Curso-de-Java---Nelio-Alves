
public class CursoJava {

	public static void main(String[] args) {
		
		Carro c1 = new Carro ("Golf");
		Carro c2 = new Carro ("HRV");
		CarroCombate c3 = new CarroCombate("Sinistro", 10);
		
		System.out.println(c1.getNome() + "\n");	
		System.out.println(c3.getNome());	
		}

}
