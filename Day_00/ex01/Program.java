import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int	n = sc.nextInt();
	if (n <= 1){
		System.err.println("IllegalArgument");
		System.exit(1);
	}
	int start = 1, end = n / 2;
	int	max = 0;
	
	while (start <= end) {
		if (start * start == n) {
			max = start;
			break ;
		}
		if (start * start < n) {
			max = start;
		}
		else 
			break ;
		start++;
	}
	
	int	i = 1;
	while (++i <= max) {
		if (n % i == 0) {
			System.out.println("false "+ (i - 1));
			System.exit(0);
		}
	}
	System.out.println("true "+ (i - 1));
	System.exit(0);
  }
}