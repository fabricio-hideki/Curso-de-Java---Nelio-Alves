
public class Carro {
	
		private String nome;
		private boolean ligado;
		private boolean destruido;
		private int blindagem;
		private boolean armamento;
		
		public Carro(String nome) {
			this.nome = nome;
		}
		
		public String getNome(){
			return "Nome :" +this.nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public boolean getLigado() {
			return this.ligado;
		}
		
		public void setLigado() {
			this.ligado = ligado;
		}
}
