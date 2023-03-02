
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		// 테케
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			// 첫번째 테케
			int N = sc.nextInt();
			int[] arr = new int[5002];
			int P = 0;
			int a = 0;
			int a1 = 0;
			
			for (int i = 0; i < N; i++) {
				a = sc.nextInt();
				a1 = sc.nextInt();

				// 값을 입력받는다.
				for (int j = a; j <= a1; j++) {
					arr[j]++;
				}
			}
			// 숫자의 갯수를 입력받는다.
			P = sc.nextInt();
			
			sb.append("#").append(tc);

			for (int j = 0; j < P; j++) {
				int num = sc.nextInt();
				sb.append((" " + arr[num]));

			}
			sb.append("\n");
		}
		System.out.println(sb);

	}

}
