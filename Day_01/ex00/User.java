import java.util.UUID;

public class User {
	private final Integer	_identifier;
	private String	_name;
	private Integer	_balance;

	public User(Integer	identifier, String name, Integer balance){
		_identifier = identifier;
		_name = name;
		if (balance < 0)
			_balance = 0;
		else
			_balance = balance;
	}

	public Integer getIdentifier(){
		return this._identifier;
	}

	public String getName(){
		return this._name;
	}

	public Integer	setBalance(Integer amount) {
		Integer tmp = _balance;

		if ((tmp += amount) < 0)
			return 0;
		this._balance += amount;
		return 1;
	}

	@Override
	public String toString() {
		return "ID: " + _identifier + " name: " + _name + " balance: " + _balance;
	}
}
