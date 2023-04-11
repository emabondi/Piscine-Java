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
		if (count == 9)
			count++;
		else if (count == 0)
			return ;
		System.out.println();
		float ratio = (float)letters[best[0]] / 10;
		for (byte i = 0; i < count && letters[best[i]] == letters[best[0]]; i++) {
			if (letters[best[i]] <= 9)
				System.out.print(" "+letters[best[i]]+" ");
			else
				System.out.print(letters[best[i]]+" ");
		}
		System.out.println();
		for (byte y = 10; y > 0; y--) {
			for (byte i = 0; i < count; i++) {
				if (letters[best[i]] >= (ratio * (float)y))
					System.out.print(" # ");
				else if (letters[best[i]] >= (ratio * (float)(y - 1))){
					if (letters[best[i]] <= 9)
						System.out.print(" "+letters[best[i]]+" ");
					else
						System.out.print(letters[best[i]]+" ");
				}
				//System.out.print("  ");
			}
			System.out.println();
		}
		for (byte i = 0; i < count; i++) {
				System.out.print(" "+(char)best[i]+" ");
		}
		System.out.print("\n");
	}
}
