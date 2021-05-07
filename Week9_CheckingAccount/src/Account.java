
public class Account {

	private String accountNo;	//계좌 번호
	private String ownerName;	//예금주 명
	private int balance;		//잔액
	
	//생성자
	Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	//입금
	void deposit(int amount) {	
		balance += amount;
	}
	//출금
	int withdraw(int amount) throws Exception {
		if(balance < amount)
			throw new Exception("잔액 부족");
		balance -= amount;
		return amount;
	}
	
	//setter, getter 함수
	void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	void setBalance(int balance) {
		this.balance = balance;
	}
	
	String getAccountNo() {
		return accountNo;
	}
	String getOwnerName() {
		return ownerName;
	}
	int getBalance() {
		return balance;
	}
}
