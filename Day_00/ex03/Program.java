import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String	str;
		int		n = 0;
		byte	i = 1;
		long	grades = 0;

		str = sc.next();
		while (str.equals("Week") && !str.equals("42")) {
			int 	min = 10;
			int		tmp = 0;

			n = sc.nextInt();
			if (n != (int)i)
				break ;
			for(byte k = 0; k < 5; k++) {
				n = sc.nextInt();
				if (n < 1 || n > 9) {
					System.err.println("IllegalArgument");
					sc.close();
					System.exit(-1); }
				if (n < min)
					min = n;
			}
			if (grades != 0)
				grades *= 10;
			grades += min;
			if (i == 18)
				break ;
			i++;
			str = sc.next();
		}
		if ((!str.equals("Week") || n != (int)i) && i != 18 && !str.equals("42")) {
			System.err.println("IllegalArgument");
			sc.close();
			System.exit(-1);
		}
		long inverted = 0;
		while (grades > 0) {
			if (inverted != 0)
				inverted *= 10;
			inverted += grades % 10;
			grades /= 10;
		}
		i = 1;
		while (inverted > 0) {
			System.out.print("Week "+i+" ");
			i++;
			for (long len = inverted % 10; len > 0; len--)
				System.out.print("=");
			System.out.println(">");
			inverted /= 10;
		}
		sc.close();
	}
}
