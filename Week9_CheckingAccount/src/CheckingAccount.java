
public class CheckingAccount extends Account{
	private String cardNo;//ī�� ��ȣ
	
	//������: super ���
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo){
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	//ī�� ����
	int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(this.cardNo)||(this.getBalance() < amount))
			throw new Exception("���� �Ұ���");
		return withdraw(amount);
	}
	
	//ī������ ���
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
