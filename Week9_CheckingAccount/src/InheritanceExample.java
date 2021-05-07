import java.util.Scanner;

public class InheritanceExample {

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);

		//계좌 설정
		CheckingAccount obj = setAccount(scan);
		obj.printAccount();
		
		//UI 인터페이스
		UIInterface(obj, scan);
		
		//정보를 출력시키고 종료
		System.out.println("\n프로그램 종료.");
		obj.printAccount();
		
		//scan free
		scan.close();
	}
	
	//계좌 설정
	static CheckingAccount setAccount(Scanner scan) {
		CheckingAccount obj = new CheckingAccount("", "", 0, "");

		//계좌번호, 예금주 이름, 카드번호, 잔액 입력. try catch문으로 String형 정보가 들어오지 않을 시 재입력 실시
		while(true) {
			try {
				System.out.print("계좌번호 입력: ");
				String accountNoBuff = scan.nextLine();
				if(accountNoBuff.equals("")||accountNoBuff.equals(null)) 
					throw new Exception("계좌번호 입력없음");
				
				System.out.print("예금주 이름 입력: ");
				String ownerNameBuff = scan.nextLine();
				if(ownerNameBuff.equals("")||ownerNameBuff.equals(null)) 
					throw new Exception("예금주 이름 입력없음");
				
				System.out.print("카드번호 입력: ");
				String cardNoBuff = scan.nextLine();
				if(cardNoBuff.equals("")||cardNoBuff.equals(null)) 
					throw new Exception("카드번호 입력없음");
				
				System.out.print("잔액 입력: ");
				int balanceBuff = scan.nextInt();
				
				obj.setAccountNo(accountNoBuff);
				obj.setOwnerName(ownerNameBuff);
				obj.setCardNo(cardNoBuff);
				obj.setBalance(balanceBuff);
				break;
				
			} 
			catch(Exception e) {
				System.err.println("!입력 오류!\n재입력을 시작합니다.\n" + e.toString());
				scan = new Scanner(System.in); //scanner 버퍼 오류 방지
			} 
		}
		
		return obj;
	}
	
	//UI 출력 및 실행
	static void UIInterface(CheckingAccount obj, Scanner scan) {
		
		//while문을 돌리기 위한 flag
		boolean exit = false;
		
		//exit를 활용한 while문으로 메뉴표시
		while(!exit) {
			Menu();
			//메뉴 입력 받고 처리하기
			try {
				//메뉴 입력 받기(+Scanner clear)
				scan = new Scanner(System.in);
				System.out.print("#선택: ");
				int menuNum = scan.nextInt();
				
				//switch문을 활용한 메뉴 처리
				switch(menuNum) {
					case 1: Deposit(obj, scan); printBalance(obj); break;	//저금
					case 2: Withdraw(obj, scan); printBalance(obj); break;	//인출
					case 3: Pay(obj, scan); printBalance(obj); break;		//카드 지불
					case 4:	exit = true; break;
					default: throw new Exception("Menu out of range");
				}
				
			} 
			catch(Exception e) {
				System.err.println("!메뉴 오류!\n잘못누르셨습니다. 메뉴로 돌아갑니다.\n" + e.toString());
				scan = new Scanner(System.in);
			}
		}
		
		return;
	}
	
	//메뉴 출력0
	static void Menu() {
		System.out.println("###메뉴###");
		System.out.println("1. 저금");
		System.out.println("2. 인출");
		System.out.println("3. 카드 지불");
		System.out.println("4. 종료");
	}

	//저금
	static void Deposit(CheckingAccount obj, Scanner scan) {
		try {
			System.out.print("저금을 시작합니다.\n저금 금액 입력: ");
			int depositBuff = scan.nextInt();
			obj.deposit(depositBuff);
			System.out.println("저금 완료");
		} 
		catch(Exception e) {
			System.err.println("!저금 오류!\n메뉴로 돌아갑니다.\n" + e.toString() + "\n");
		}
		
		return;
	}
	
	//인출
	static void Withdraw(CheckingAccount obj, Scanner scan) {
		try {
			System.out.print("인출을 시작합니다.\n인출 금액 입력: ");
			int withdrawBuff = scan.nextInt();
			int result = obj.withdraw(withdrawBuff);
			System.out.println("인출 완료: " + result + "원 인출");
		} 
		catch(Exception e) {
			System.err.println("!인출 오류!\n메뉴로 돌아갑니다.\n" + e.toString() + "\n");
		}
		
		return;
	}
	
	//카드 지불
	static void Pay(CheckingAccount obj, Scanner scan) {
		try {
			scan = new Scanner(System.in);
			System.out.print("카드 지불을 시작합니다.\n카드 번호 입력: ");
			String cardNoBuff = scan.nextLine();
			if(cardNoBuff.equals("")||cardNoBuff.equals(null)) 
				throw new Exception("카드번호 입력없음");
			
			System.out.print("지불액 입력: ");
			int payBuff = scan.nextInt();
			int result = obj.pay(cardNoBuff, payBuff);
			
			System.out.println("카드 지불 완료: " + result + "원 지불");
		} catch(Exception e) {
			System.err.println("!카드 지불 오류!\n메뉴로 돌아갑니다.\n" + e.toString() + "\n");
		}
		
		return;
	}
	
	//메뉴처리 후 잔고 출력
	static void printBalance(CheckingAccount obj) {
		System.out.println("잔고: " + obj.getBalance()+"\n");
		return;
	}

}
