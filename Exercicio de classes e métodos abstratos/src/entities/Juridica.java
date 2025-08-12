package entities;

public class Juridica extends Pessoa{

	private int employeesNumber;
	
	public Juridica(){
		
	}
	
	public Juridica(String name, double anualSalary, int employeesNumber) {
		super(name, anualSalary);
		this.employeesNumber = employeesNumber;
	}

	public int getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(int employeesNumber) {
		this.employeesNumber = employeesNumber;
	}
	

	@Override
	public double fee() {
		double fee = 0;
		if (getEmployeesNumber() > 10 ) {
			fee += getAnualSalary() * 0.14;
		}
		else {
			fee += getAnualSalary() * 0.16;
		}
		return fee;
	}

}
