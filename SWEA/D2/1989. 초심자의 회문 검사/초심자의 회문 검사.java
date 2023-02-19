

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			String pal = sc.next();
			System.out.print("#" + (i + 1) + " ");
			int n = pal.length();
			for (int j = 0; j < n / 2 ; j++) {
				//문자의 앞 뒤를 본다.
				if (pal.charAt(j) == pal.charAt(n - j - 1)) {
					System.out.println("1");
					break;
				} else {
					System.out.println("0");
					break;
				}
			}

		}

	}

}
