
public class BankAccount {

	String name;// 口座名義名
	int no;// 口座番号
	int balance; // 預金残高

	public BankAccount(String name, int no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("安西", 1234, 200);
		b1.deposite(10);
		System.out.println(b1.name + "," + b1.balance);

		BankAccount b2 = new BankAccount("木村", 5678, 500);
		b2.withdraw(5);
		System.out.println(b2.name + "," + b2.balance);
	}

	// 引数で指定された金額を、預けます。よって、預金残高が、 val 円増えます。
	public void deposite(int val) {
		balance += val;
	}

	// 引数で指定された金額を、引き出します。よって、預金残高が、 val 円減ります。
	public void withdraw(int val) {
		balance -= val;
	}

}
