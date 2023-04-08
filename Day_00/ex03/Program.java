import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		byte	i = 1;

		str = sc.nextLine();
		while (str.equals("Week " + i) && !str.equals("42")) {

			if (i == 18)
				break ;
			i++;
			str = sc.nextLine();
		}
		if (!str.equals("Week " + i) && i != 18 && !str.equals("42")) {
			System.err.println("IllegalArgument");
			System.exit(-1);
		}

	}
}
