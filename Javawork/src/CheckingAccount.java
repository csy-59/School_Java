
public class CheckingAccount extends Account{

	String cardNo;
	
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance); //Account�� ������ ȣ��
		this.cardNo = cardNo;
	}
	
	int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("������ �Ұ����մϴ�.");
		return withdraw(amount);
	}
	
}
