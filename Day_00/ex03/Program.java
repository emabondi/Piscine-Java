import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		byte	i = 1;
		long	grades = 0;

		str = sc.nextLine();
		while (str.equals("Week " + i) && !str.equals("42")) {
			Scanner	scan = new Scanner(System.in);
			String	pattern = "[0-9]*";
			String	s;
			int 	min = 10;
			int		tmp = 0;

			for(byte k = 0; k < 5; k++) { 
				s = scan.next(pattern);
				if (s.equals("1"))
					tmp = 1;
				else if (s.equals("2"))
					tmp = 2;
				else if (s.equals("3"))
					tmp = 3;
				else if (s.equals("4"))
					tmp = 4;
				else if (s.equals("5"))
					tmp = 5;
				else if (s.equals("6"))
					tmp = 6;
				else if (s.equals("7"))
					tmp = 7;
				else if (s.equals("8"))
					tmp = 8;
				else if (s.equals("9"))
					tmp = 9;
				else {
					System.err.println("IllegalArgument");
					System.exit(-1); }
				if (tmp < min)
					min = tmp;
			}
			if (grades != 0)
				grades *= 10;
			grades += min;
			if (i == 18)
				break ;
			i++;
			str = sc.nextLine();
		}
		
		if (!str.equals("Week " + i) && i != 18 && !str.equals("42")) {
			System.err.println("IllegalArgument");
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
	}
}
