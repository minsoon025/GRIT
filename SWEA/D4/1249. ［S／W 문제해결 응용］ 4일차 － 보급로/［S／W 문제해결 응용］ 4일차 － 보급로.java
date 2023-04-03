
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = Integer.parseInt(sc.nextLine());

		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, -1, 1 };

		for (int tc = 1; tc <= T; tc++) {

			int N = Integer.parseInt(sc.nextLine());
			// 값을 입력받음, 한번 변환해서 넣어야됨
			int[][] arr = new int[N][N];
			// 최소 거리 비용만큼만 값을 받아온다
			int[][] dist = new int[N][N];

			for (int i = 0; i < N; i++) {
				char[] str = sc.nextLine().toCharArray();
				for (int j = 0; j < N; j++) {
					arr[i][j] = str[j] - '0'; 
				}
			}
			int big = Integer.MAX_VALUE;
 			// 값을 최대치로 바꿔주고
			for (int i = 0; i < N; i++) {
				Arrays.fill(dist[i], big);
			}
			// 값 초기화
			dist[0][0] = 0;

			// queue를 선언하고 값을 넣기
			Queue<int[]> q = new LinkedList<>();
			q.offer(new int[] {0, 0});

			// q가 빌때까지
			while (!q.isEmpty()) {
				// 각 값을 꺼낸다.
				int[] arr2 = q.poll();
				int x = arr2[0];
				int y = arr2[1];

				// 사방탐색
				for (int i = 0; i < 4; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];
					// bfs 를 하는데 엔드보다 or 값으로 예외처리하는게 더 좋다
					if (nx < 0 || ny < 0 || nx >= N || ny >= N)
						continue;

					// 해당 값 중에서 작은 값을 불러온다.
					if (dist[nx][ny] <= dist[x][y] + arr[nx][ny])
						continue;
					dist[nx][ny] = dist[x][y] + arr[nx][ny];
					q.offer(new int[] { nx, ny });

				}

			}
//			for(int i =0; i<N; i++) {
//				for(int  j =0; j<N; j++) {
//					System.out.print(dist[i][j] + " ");
//				}System.out.println();
//			}
			int ans = dist[N - 1][N - 1];
			System.out.println("#" + tc + " " + ans);
		}
	}
}
