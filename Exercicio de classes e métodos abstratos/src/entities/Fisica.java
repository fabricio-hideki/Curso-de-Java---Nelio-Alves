package entities;

public class Fisica extends Pessoa{

	private double Healthcare;

	public Fisica() {
		
	}
	
	public Fisica(String name, double anualSalary, double healtcare) {
		super(name, anualSalary);
		Healthcare = healtcare;
	}

	public double getHealtcare() {
		return Healthcare;
	}

	public void setHealtcare(double healthcare) {
		Healthcare = healthcare;
	}

	
	@Override
	public double fee() {
		double fee = 0;
		if (getAnualSalary() < 20000.00) {
			fee += getAnualSalary() * 0.15;
		}
		else if (getAnualSalary() > 20000.00) {
			fee += getAnualSalary() * 0.25;
		}
		
		fee -= getHealtcare() * 0.5;
		if(fee < 0.0) {
			fee = 0.0;
		}
	
		return fee;
	}
	
	
}
