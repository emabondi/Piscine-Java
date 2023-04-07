import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int	n, count = 0;
	while ((n = sc.nextInt()) != 42) {
		if (n <= 1){
			System.err.println("IllegalArgument");
			System.exit(1);
		}
		int	sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}

		int start = 1, end = sum / 2, max = 0;

		while (start <= end) {
			if (start * start == sum) {
				max = start;
				break ;
			}
			if (start * start < sum) {
				max = start;
			}
			else 
				break ;
			start++;
		}

		int	i = 1;
		while (++i <= max) {
			if (sum % i == 0)
				break ;
		}
		if (--i == max)
			count++;
	}
	System.out.println("Count of coffee - request - " + count);
	System.exit(0);
  }
}