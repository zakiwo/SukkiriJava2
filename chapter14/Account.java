package chapter14;

public class Account {
	private String accountNumber;
	private int balance; //残高
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	//toStringのオーバーライド
	public String toString() {
		return "¥¥" + this.balance + "(口座番号:" + this.accountNumber + ") "; 
	}
	
	//equalsのオーバーライド
	public boolean equals(Object o) {
		//完全に同一
		if(this == o) {
			return true;
		}
		//口座番号が同じ
		if(o instanceof Account) {  //oをAccountにキャストしても問題ないか
			Account a = (Account)o;  //oをAccountインスタンスにキャスト
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if(an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}
	
}
