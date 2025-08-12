package entities;

public abstract class Pessoa {

	private String name;
	private double anualSalary;
	
	public Pessoa() {
		
	}

	public Pessoa(String name, double anualSalary) {
		this.name = name;
		this.anualSalary = anualSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnualSalary() {
		return anualSalary;
	}

	public void setAnualSalary(double anualSalary) {
		this.anualSalary = anualSalary;
	}
	
	public abstract double fee();
	
}
