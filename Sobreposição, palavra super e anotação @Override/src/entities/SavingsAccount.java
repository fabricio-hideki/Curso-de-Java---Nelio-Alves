package entities;

//Quando o final é utilizado em uma classe, serve para garantir que não possa existir uma subclasse dessa classe
public final class SavingsAccount extends Account{

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += interestRate;
	}
	
	//Esse método é uma sobrescrita do método da super classe, o @Override serve para identificar isso.
	// Quando o final é utilizado em um método é para garantir que esse método não possa ser sobrescrito.
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
}
