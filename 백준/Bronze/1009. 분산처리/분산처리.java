import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			// 각 각의 값을 받아온다.

			int ans = 1;

			for (int j = 0; j < b; j++) {
				ans = ans * a;
				ans = ans % 10;

			}
			if (ans == 0) {
				System.out.println(10);
			}else {
				System.out.println(ans);
			}
		}
	}

}