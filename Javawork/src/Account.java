
public class Account {

	String accountNo;	//계좌 번호
	String ownerName;	//예금주 명
	int balance;		//잔액
	
	//생성자
	Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	void deposit(int amount) {	
		balance += amount;
	}
	int withdraw(int amount) throws Exception {
		if(balance < amount)
			throw new Exception("잔액이 부족합니다.");
		balance -= amount;
		return amount;
	}
}
