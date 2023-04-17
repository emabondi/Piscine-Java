
public class Program {

  public static void main(String[] args) {
    User a = new User(1, "Ema", 200);
    User b = new User(2, "Ame", 500);

    newTransaction(b, a, -600);
  }

  static void newTransaction(User sender, User recipient, int amount){
    if (sender.setBalance((amount *= -1)) == 0){
      System.out.println("Cannot execute transaction.");
      return ;
    }
    System.out.println(amount + " ..." + (amount *= -1));
    Transaction t1 = new Transaction(sender, recipient, Transaction.Category.OUTCOME, (amount *= -1));
    System.out.println(t1);
    Transaction t2 = new Transaction(recipient, sender, Transaction.Category.INCOME, amount);
    System.out.println(t2);
  }
}