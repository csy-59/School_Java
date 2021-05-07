
public class InheritanceExample3 {

	public static void main(String[] args) {
		CreditLineAccount obj = new CreditLineAccount("000-11-111111", "±è¼±´Þ", 10000, 200000000);
		obj.deposit(100000);
		
		try {
			int amount = obj.withdraw(47000);
			System.out.println("ÀÎÃâ¾×: " + amount);
			System.out.println("ÀÜ¾×: " + obj.balance);
		}
		catch(Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}

}
