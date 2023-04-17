import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
		Scanner		scan = new Scanner(System.in);
		String[][]	table = new String[11][11];
		byte		count = 1;


		table[count][0] = scan.nextLine();
		while (!table[count][0].equals(".")){
			count++;
			table[count][0] = scan.nextLine();
		}
		for (byte i = 0; i < count; i++) {
			System.out.println(table[i][0]);
		}
	}
}
