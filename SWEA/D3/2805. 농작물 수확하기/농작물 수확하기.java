import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			for (int i=0; i<N; i++) { // 입력
				String str = sc.next();
				int[] line = new int[N];
				for (int j=0; j<N; j++) {
					line[j] = str.charAt(j)-'0';
				}
				arr[i] = line;
			}

			int ans = 0;
			int start = N / 2;
			int end = N / 2;

			for (int i = 0; i < N; i++) {
				for (int j = start; j <= end; j++) { // 각 행마다
					ans += arr[i][j];
				}
				if (i < N / 2) { // 행의 절반 전이면
					start -= 1; // 시작을 줄여주고
					end += 1; // 끝을 늘려서 열의 범위를 키움
				} else { // 행의 절반이 지나면
					start += 1; // 시작을 늘리고
					end -= 1; // 끝을 줄여서 열의 범위를 좁힘
				}
			}
			System.out.printf("#%d %d\n", tc, ans);
		}
	}

}