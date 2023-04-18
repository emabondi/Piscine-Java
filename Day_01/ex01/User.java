import java.util.UUID;

public class User {
	private final int	_id;
	private String	_name;
	private int		_balance;

	public User(String name, int balance){
		_id = UserIdsGenerator.getInstance().generateId();
		_name = name;
		if (balance < 0)
			_balance = 0;
		else
			_balance = balance;
	}

	public int getIdentifier(){
		return this._id;
	}

	public String getName(){
		return this._name;
	}

	public int	setBalance(int amount) {
		int tmp = _balance;

		if ((tmp += amount) < 0)
			return 0;
		this._balance += amount;
		return 1;
	}

	@Override
	public String toString() {
		return "ID: " + _id + " name: " + _name + " balance: " + _balance;
	}
}
