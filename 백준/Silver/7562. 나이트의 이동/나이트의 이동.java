import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			// 체스판의 크기
			int N = sc.nextInt();
			int[][] arr = new int[N][N];

			// 최종 값
			int x2 = 0;
			int y2 = 0;
			// 현재 말의 위치
			int x = sc.nextInt();
			int y = sc.nextInt();

			// 이동해야할 위치
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();

			arr[x][y] = 1;
			arr[x1][y1] = -1;

			if (arr[x][y] == -1) {
				System.out.println(0);
			} else if(arr[x][y] == 1){

				// 그러지말고 카운트를 한다.
				int cnt = 0;

				// 체스판을 돌아다닐 친구를 만듭니다.
				int[] dx = { 2, 2, 1, -1, -2, -2, -1, 1 };
				int[] dy = { 1, -1, -2, -2, -1, 1, 2, 2 };

				Queue<int[]> queue = new ArrayDeque<>();
				int[] array = new int[2];
				array[0] = x;
				array[1] = y;
				
				queue.offer(array); 
				loop:
					while (!queue.isEmpty()) {

					array = queue.poll();
					int cx = array[0];
					int cy = array[1];
					// 8
					for (int i = 0; i < 8; i++) {
						if (cx + dx[i] < 0 || cy + dy[i] < 0 || cx + dx[i] >= N || cy + dy[i] >= N)
							continue;
						if (arr[cx + dx[i]][cy + dy[i]] == 0) {
							arr[cx + dx[i]][cy + dy[i]] = arr[cx][cy];
							// 새로 선언 안해주면 참조여서 다른 값들도 변함
							// 초기화 해야한다.
							array = new int[2];
							array[0] = cx + dx[i];
							array[1] = cy + dy[i];
							queue.offer(array);
							// 각 좌표만큼 이동값을 하나씩 늘려준다,
							arr[array[0]][array[1]] = arr[cx][cy] + 1;
						} else if (arr[cx + dx[i]][cy + dy[i]] == -1) {
							// 여기 나온 값을 저장
							x2 = cx;
							y2 = cy;
							break loop;
						}
					}
				}

				System.out.println(arr[x2][y2]);
			}
		}

	}

}