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
		return _sender.getName() + " -> " + _recipient.getName() + ", " + _amount + ", " + _transferCategory + ", " + _identifier;
	}
}