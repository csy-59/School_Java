
public class InheritanceExample1 {

	public static void main(String[] args) {
		CheckingAccount obj = new CheckingAccount("", "", 0, "");
		obj.accountNo = "111-222-33333333";
		obj.ownerName = "È«±æµ¿";
		obj.cardNo = "5555-6666-7777-8888";
		obj.deposit(100000);
		
		try {
			int paidAmount = obj.pay("5555-6666-7777-88889", 47000);
			System.out.println("ÁöºÒ¾×: " + paidAmount);
			System.out.println("ÀÜ¾×: " + obj.balance);
		}
		catch(Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}

}
