public class Program {
  public static void main(String[] args) {

	int	n = 479598;

	/*if ((n / 100000 < 1) || (n / 1000000 > 0)) {
		System.out.println("Error: Not a six digit number");
		System.exit(1);
	}*/
	int res = 0;
		res += n % 10;
		n /= 10;
		res += n % 10;
		n /= 10;
		res += n % 10;
		n /= 10;
		res += n % 10;
		n /= 10;
		res += n % 10;
		n /= 10;
		res += n % 10;
		n /= 10;
	System.out.println(res);
  }
}