import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		char[] str;

		s = sc.nextLine();
		str = s.toCharArray();
		//System.out.println(str.length);
		short[] letters;
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
