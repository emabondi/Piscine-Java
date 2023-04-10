import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		char arr[];

		str = sc.nextLine();
		arr = str.toCharArray();
		short letters[] = new short[65535];
		for (char c:arr) {
			letters[c] += 1;
		}
		int best[] = new int[10];
		byte count = 0;
		for (int x = 0; x < 65535; x++) {
			if (letters[x] != 0 && letters[x] > letters[best[count]]) {
				int tmp;
				best[count] = x;
				if (count < 1) {
					count++;
					continue ;}
				byte i = (byte)(count - 1);
				while (i >= 0 && letters[best[i]] < letters[best[i + 1]]) {
					tmp = best[i];
					best[i] = best[i + 1];
					best[i + 1] = tmp;
					i--;
				}
				if (count <= 8)
					count++;
			}
		}
		for (byte i = 0; i < count +1; i++) {
			char c = (char)best[i];
			System.out.println("char: "+c+" count: "+letters[best[i]]);
		}
		
	}
}