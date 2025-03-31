package week2.day4;

public class Amazon extends CanaraBank{

	@Override
	public void cashOnDelivery() {
		System.out.println("COD available");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("UPI Payments are there");
	}

	@Override
	public void cardPayments() {
		System.out.println("Debit and Credit card payments available");
	}

	@Override
	public void internetBanking() {
		System.out.println("Net Banking not available");
	}
	
	//public void goldLoan() {
		//System.out.println("Gold Loan upto 10 Lakhs");
	//}
	
	public static void main(String[] args) {
		Amazon obj = new Amazon();
		obj.recordPaymentDetails();
		obj.cashOnDelivery();
		obj.upiPayments();
		obj.cardPayments();
		obj.internetBanking();
		//obj.goldLoan();
		
	}

}
