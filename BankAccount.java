public class BankAccount {
	public static void main(String args[]) {
		Account One = new Account();
		
		One.setName("Tom");
		One.setBalance(1000);
		
		One.printDetails();
		
		One.Withdraw(100);
		
		One.printDetails();
		
		One.deposit(500);
		
		One.printDetails();
		
		Account Two = new Account();
		
		Two.printDetails();
	}
}
