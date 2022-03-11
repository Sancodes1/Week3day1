package Week3day2;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("deposit Axis bank -  overriding Bankinfo class");
	}
	public static void main(String[] args) {
		AxisBank deposit = new AxisBank();
		deposit.deposit();
	}

}
