import java.util.UUID;

public class Transaction {
	private final UUID	_identifier;
	private User	_sender;
	private User	_recipient;
	private int		_amount;
	private Category _transferCategory;

    enum Category {
        OUTCOME, INCOME
    }

	public	Transaction(User sender, User recipient,  Category cat, int amount){
		_identifier = UUID.randomUUID();
		_sender = sender;
		_recipient = recipient;
		_transferCategory = cat;
		_amount = amount;
	}

	@Override
    public String toString() {
		//String str;
		//if (_transferCategory == Category.OUTCOME)
		//	str = ", "
		return _sender.getName() + " -> " + _recipient.getName() + ", " + _amount + ", " + _transferCategory + ", " + _identifier;
        //return "Transaction: \n" +
        //        "identifier = " + _identifier +
        //        "\nrecipient = " + _recipient.getName() +
        //        "\nsender = " + _sender.getName() +
        //        "\ntransferAmount = " + _amount +
        //        "\ntransferCategory = " + _transferCategory;
    }
}