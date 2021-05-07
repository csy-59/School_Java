
public class CheckingAccount extends Account{
	private String cardNo;//카드 번호
	
	//생성자: super 사용
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo){
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	//카드 지불
	int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(this.cardNo)||(this.getBalance() < amount))
			throw new Exception("지불 불가능");
		return withdraw(amount);
	}
	
	//카드정보 출력
	void printAccount() {
		System.out.println("AccountNo: " + this.getAccountNo() +"\tOwner: " + this.getOwnerName() 
								+ "\nCardNo: " + this.getCardNo()+"\tBalance: " + this.getBalance());
	}
	
	//setter, getter
	void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	String getCardNo() {
		return cardNo;
	}
}
