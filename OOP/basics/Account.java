package in.com.raystec.basics;

public class Account {
	private String number;						//attributes
	private String accountType;
	private double balance;
	
	
	//setters
	public void setNumber(String number) {
		this.number = number;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//getters
	public String getNumber() {
		return number;
	}
	public String getAccountType() {
		return accountType;
	}
	public double getBalance() {
		return balance;
	}
	
	//methods
	
	public double deposit(double dp ) {
		balance = balance + dp;
		return this.balance;
		}
	
	public double withdrawal(double wd ) {
		balance = balance - wd;
		return this.balance;
			}
	
	public double fundTransfer(double ft) {
		balance = balance+ft;
		return this.balance;
		}
	
	public double payBill(double pb) {
		balance = balance -pb;
		return this.balance;
		
	}
}
