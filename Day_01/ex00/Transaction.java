import java.util.UUID;

public class Transaction {
	UUID	_identifier;
	User	_recipient;
	User	_sender;
	boolean	_category;
	int		_amount;

	public	Transaction(User recipient, User sender, String category, int amount){
	_identifier = UUID.randomUUID();
	_recipient = recipient;
	_sender = sender;
	
	}
}