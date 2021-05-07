import java.util.Scanner;

public class InheritanceExample {

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);

		//���� ����
		CheckingAccount obj = setAccount(scan);
		obj.printAccount();
		
		//UI �������̽�
		UIInterface(obj, scan);
		
		//������ ��½�Ű�� ����
		System.out.println("\n���α׷� ����.");
		obj.printAccount();
		
		//scan free
		scan.close();
	}
	
	//���� ����
	static CheckingAccount setAccount(Scanner scan) {
		CheckingAccount obj = new CheckingAccount("", "", 0, "");

		//���¹�ȣ, ������ �̸�, ī���ȣ, �ܾ� �Է�. try catch������ String�� ������ ������ ���� �� ���Է� �ǽ�
		while(true) {
			try {
				System.out.print("���¹�ȣ �Է�: ");
				String accountNoBuff = scan.nextLine();
				if(accountNoBuff.equals("")||accountNoBuff.equals(null)) 
					throw new Exception("���¹�ȣ �Է¾���");
				
				System.out.print("������ �̸� �Է�: ");
				String ownerNameBuff = scan.nextLine();
				if(ownerNameBuff.equals("")||ownerNameBuff.equals(null)) 
					throw new Exception("������ �̸� �Է¾���");
				
				System.out.print("ī���ȣ �Է�: ");
				String cardNoBuff = scan.nextLine();
				if(cardNoBuff.equals("")||cardNoBuff.equals(null)) 
					throw new Exception("ī���ȣ �Է¾���");
				
				System.out.print("�ܾ� �Է�: ");
				int balanceBuff = scan.nextInt();
				
				obj.setAccountNo(accountNoBuff);
				obj.setOwnerName(ownerNameBuff);
				obj.setCardNo(cardNoBuff);
				obj.setBalance(balanceBuff);
				break;
				
			} 
			catch(Exception e) {
				System.err.println("!�Է� ����!\n���Է��� �����մϴ�.\n" + e.toString());
				scan = new Scanner(System.in); //scanner ���� ���� ����
			} 
		}
		
		return obj;
	}
	
	//UI ��� �� ����
	static void UIInterface(CheckingAccount obj, Scanner scan) {
		
		//while���� ������ ���� flag
		boolean exit = false;
		
		//exit�� Ȱ���� while������ �޴�ǥ��
		while(!exit) {
			Menu();
			//�޴� �Է� �ް� ó���ϱ�
			try {
				//�޴� �Է� �ޱ�(+Scanner clear)
				scan = new Scanner(System.in);
				System.out.print("#����: ");
				int menuNum = scan.nextInt();
				
				//switch���� Ȱ���� �޴� ó��
				switch(menuNum) {
					case 1: Deposit(obj, scan); printBalance(obj); break;	//����
					case 2: Withdraw(obj, scan); printBalance(obj); break;	//����
					case 3: Pay(obj, scan); printBalance(obj); break;		//ī�� ����
					case 4:	exit = true; break;
					default: throw new Exception("Menu out of range");
				}
				
			} 
			catch(Exception e) {
				System.err.println("!�޴� ����!\n�߸������̽��ϴ�. �޴��� ���ư��ϴ�.\n" + e.toString());
				scan = new Scanner(System.in);
			}
		}
		
		return;
	}
	
	//�޴� ���0
	static void Menu() {
		System.out.println("###�޴�###");
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. ī�� ����");
		System.out.println("4. ����");
	}

	//����
	static void Deposit(CheckingAccount obj, Scanner scan) {
		try {
			System.out.print("������ �����մϴ�.\n���� �ݾ� �Է�: ");
			int depositBuff = scan.nextInt();
			obj.deposit(depositBuff);
			System.out.println("���� �Ϸ�");
		} 
		catch(Exception e) {
			System.err.println("!���� ����!\n�޴��� ���ư��ϴ�.\n" + e.toString() + "\n");
		}
		
		return;
	}
	
	//����
	static void Withdraw(CheckingAccount obj, Scanner scan) {
		try {
			System.out.print("������ �����մϴ�.\n���� �ݾ� �Է�: ");
			int withdrawBuff = scan.nextInt();
			int result = obj.withdraw(withdrawBuff);
			System.out.println("���� �Ϸ�: " + result + "�� ����");
		} 
		catch(Exception e) {
			System.err.println("!���� ����!\n�޴��� ���ư��ϴ�.\n" + e.toString() + "\n");
		}
		
		return;
	}
	
	//ī�� ����
	static void Pay(CheckingAccount obj, Scanner scan) {
		try {
			scan = new Scanner(System.in);
			System.out.print("ī�� ������ �����մϴ�.\nī�� ��ȣ �Է�: ");
			String cardNoBuff = scan.nextLine();
			if(cardNoBuff.equals("")||cardNoBuff.equals(null)) 
				throw new Exception("ī���ȣ �Է¾���");
			
			System.out.print("���Ҿ� �Է�: ");
			int payBuff = scan.nextInt();
			int result = obj.pay(cardNoBuff, payBuff);
			
			System.out.println("ī�� ���� �Ϸ�: " + result + "�� ����");
		} catch(Exception e) {
			System.err.println("!ī�� ���� ����!\n�޴��� ���ư��ϴ�.\n" + e.toString() + "\n");
		}
		
		return;
	}
	
	//�޴�ó�� �� �ܰ� ���
	static void printBalance(CheckingAccount obj) {
		System.out.println("�ܰ�: " + obj.getBalance()+"\n");
		return;
	}

}
