import java.util.UUID;

public class Transaction {
	private final UUID	_identifier;
	private User	_sender;
	private User	_recipient;
	private Integer	_amount;
	private Category _transferCategory;

	enum Category {
		OUTCOME, INCOME
	}

	public	Transaction(UUID id, User sender, User recipient,  Category cat, Integer amount){
		_identifier = id;
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