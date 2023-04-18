
public class UserIdsGenerator {
	private static UserIdsGenerator instance = new UserIdsGenerator();
	private int last = 0;
	private UserIdsGenerator() {}

	public static UserIdsGenerator getInstance() {
		return instance;
	}

	public int generateId() {
		return ++last;
	}
}