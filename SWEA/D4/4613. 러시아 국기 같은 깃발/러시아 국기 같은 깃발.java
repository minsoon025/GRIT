import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 양 끝 값은 색을 칠해준다.
		// 파랑이 좋을지 하양이 좋을지 판단해서 색을 칠한다.
		// 한번 색을 칠하고 나선 파랑이 좋을지 빨강이 좋을지 판단단.
		// 한번 그 색이 좋기 시작하면 계속 그 값으로 카운트를 한다.

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			// 행
			int N = sc.nextInt();
			// 열
			int M = sc.nextInt();
			char[][] arr = new char[N][M];

			// 값 입력받음
			for (int i = 0; i < N; i++) {
				String str = sc.next();
				for (int j = 0; j < M; j++) {
					arr[i][j] = str.charAt(j);
				}
			}

			// 각 줄마다 색을 카운트해서 담아둔다.
			// w-0 b-0 r-2
			int[][] color = new int[N][3];

			// 각 색의 값들을 입력받는다.
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (arr[i][j] == 'W') {
						color[i][0]++;
					}
					if (arr[i][j] == 'B') {
						color[i][1]++;
					}
					if (arr[i][j] == 'R') {
						color[i][2]++;
					}
				}
			}

			// 색별로 카운트를 했다.
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < 3; j++) {
				}
			}

			// 처음과 마지막은 흰색 / 빨강으로 칠해야한다.
			// 마지막 답을 구할 때 보자
			// 1부터 N-1 까지
			
			int min = 999999;

			for (int i = 0; i < N; i++) {
				for (int j = 1; j < N; j++) {
					for (int k = 0; k < N; k++) {
						if (i + j + k == N - 2) {
							// 모든 경우의 수가 나온다.
							// 각 범위를 체크해주는데
							// 그 범위에 알맞은 수가 없으면 카운트를 해준다.
							// 그리고 그 값의 최소값을 찾는다.
							// 흰색인경우
							int ans = 0;
							for (int l = 1; l < 1 + i; l++) {
								ans += color[l][2] + color[l][1];
							}
							// 파란색인경우
							for (int m = 1 + i; m < 1 + i + j; m++) {
								ans += color[m][0] + color[m][2];
							}
							// 빨강인 경우
							for (int n = 1 + i + j; n < N-1; n++) {
								ans += color[n][1] + color[n][0];
							}
							//여기서 나온 값들의 최저를 뽑는다,
							min = Math.min(min, ans);
						}
					}
				}
			}
			//맨 위 흰색 , 아래 빨강을 더해준다.
			System.out.println("#" + tc + " " + (min + color[0][2] + color[0][1] + color[N-1][0] + color[N-1][1]));

		}

	}

}