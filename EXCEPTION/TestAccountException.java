package in.com.raystec.exception;

public class TestAccountException {
	
	public static void main(String[] args)  {
		
		AccountException a = new AccountException();

		a.setNumber("xxxxxxxxxx123");
		a.setAccountType("Saving Account");
		a.setBalance(1000);

		System.out.println("Account Number = " + a.getNumber());
		System.out.println("Account Type = " + a.getAccountType());
		System.out.println("Account Balance = " + a.getBalance());

		System.out.println();
		
		double dp = a.deposit(150);
		double wd = a.withdrawal(800);
		double ft = a. fundTransfer(100);
		double pb = a.payBill(300);

			System.out.println();
		
		System.out.println("After deposit, current balance is " + dp);
		System.out.println("After withdrawal, current balance is " + wd);
		System.out.println("After fund transfer, current balance is " + ft);
		System.out.println("After bill payment, current balance is " + pb);
	}
}

