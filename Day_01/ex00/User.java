import java.util.UUID;

public class User {
	private UUID	_identifier;
	private String	_name;
	private int		_balance;

	public User(String name, int balance){
		_identifier = UUID.randomUUID();
		_name = name;
		if (balance < 0)
			_balance = 0;
		else
			_balance = balance;
	}
}