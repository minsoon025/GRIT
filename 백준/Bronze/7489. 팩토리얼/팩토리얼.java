import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		// 팩토리얼의 마지막 숫자
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			// 팩토리얼 만들기
			long fa = 1;
			for (int i = 1; i <= N; i++) {
				fa = fa * i;
				fa %= 1000000;

				while (fa % 10 == 0) {
					fa = fa / 10;
				}
			}
			System.out.println(fa % 10);
		}
	}

}