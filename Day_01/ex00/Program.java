import java.util.UUID;

public class Program {

  public static void main(String[] args) {
		User a = new User(1, "Ema", 200);
		User b = new User(2, "Ame", 500);

		System.out.println(a);
		System.out.println(b);
		newTransaction(b, a, 220);
		System.out.println(a);
		System.out.println(b);
		newTransaction(a, b, 10);
		System.out.println(a);
		System.out.println(b);
		newTransaction(a, b, 420);
	}

	static void newTransaction(User sender, User recipient, int amount){
		if (amount < 0 || sender.setBalance(-amount) == 0){
			System.out.println("Cannot execute transaction.");
			return ;
		}
		final UUID	id = UUID.randomUUID();
		recipient.setBalance(amount);
		Transaction t1 = new Transaction(id, sender, recipient, Transaction.Category.OUTCOME, -amount);
		System.out.println(t1);
		Transaction t2 = new Transaction(id, recipient, sender, Transaction.Category.INCOME, amount);
		System.out.println(t2);
	}
}