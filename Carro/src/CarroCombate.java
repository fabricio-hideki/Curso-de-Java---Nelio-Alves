
public class CarroCombate extends Carro{
	
	private int armamento;
	
	public CarroCombate(String nome, int armamento) {
		super(nome);
		this.armamento = armamento;
		
	}
	
	public String getNome() {
		return super.getNome() + "\nArmamento: " + this.armamento;
	}

}
