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
		short best[] = new short[10];
		byte count = 0;
		for (int x = 0; x < 65535; x++) {
			if (letters[x] != 0 && letters[x] >= best[count]) {
				short tmp ;
				
				best[count] = (short)x;
				for (byte i = (byte)(count - 1); i >= 0; i--) {
					if (letters[best[i]] >= letters[x]) {
						tmp = best[i];
						best[i] = (short)x;
						best[i + 1] = tmp;
					}
				}
			}
			else if (count <= 9){
				best[count] = (short)x;
				count++;
			}
		}
		for (byte i = 0; best[i] != 0; i++) {
			char c = (char)best[i];
			System.out.println("char: "+c+"count: "+letters[best[i]]);
		}
		
	}
}
