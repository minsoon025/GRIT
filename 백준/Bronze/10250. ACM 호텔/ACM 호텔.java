import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 0; tc < T; tc++) {
			// 높이
			int H = sc.nextInt();
			// 층의 방수
			int W = sc.nextInt();
			// 몇 번째 손님
			int N = sc.nextInt();

			if (N % H == 0) {
				System.out.println((H * 100) + (N / H));

			} else {
				System.out.println(((N % H) * 100) + ((N / H) + 1));

			}

		}

	}

}