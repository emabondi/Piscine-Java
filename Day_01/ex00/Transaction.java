import java.util.UUID;

public class Transaction {
	private final UUID	_identifier;
	private User	_recipient;
	private User	_sender;
	private int		_amount;
	private Category transferCategory;

    enum Category {
        DEBIT, CREDIT
    }

	public	Transaction(User recipient, User sender, String category, int amount){
	_identifier = UUID.randomUUID();
	_recipient = recipient;
	_sender = sender;
	
	}
}