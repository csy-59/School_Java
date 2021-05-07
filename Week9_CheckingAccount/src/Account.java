
public class Account {

	private String accountNo;	//���� ��ȣ
	private String ownerName;	//������ ��
	private int balance;		//�ܾ�
	
	//������
	Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	//�Ա�
	void deposit(int amount) {	
		balance += amount;
	}
	//���
	int withdraw(int amount) throws Exception {
		if(balance < amount)
			throw new Exception("�ܾ� ����");
		balance -= amount;
		return amount;
	}
	
	//setter, getter �Լ�
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
