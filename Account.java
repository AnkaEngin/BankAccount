public class Account {
	
	private String Name = "NoName";
	private double Balance = 0;
	
	
	public void setName(String name) {
		Name = name;
	}
	
	public void setBalance(double balance) {
		Balance = balance;
	}
	
	public void printDetails() {
		System.out.println(Name+" has $"+Balance+" in their account");
	}
	
	public void Withdraw(double draw) {
		Balance = Balance - draw;
	}
	
	public void deposit(double depo) {
		Balance+=depo;
	}
}
