import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int F, G, S, U, D;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 전체 건물의 넢이
		F = sc.nextInt();
		int[] arr = new int[F + 1];
		// 본인의 현위치
		S = sc.nextInt();
		// 목적지
		G = sc.nextInt();

		// 오르락 내리락
		U = sc.nextInt();
		D = sc.nextInt();

		// bfs돌리기
		Queue<Integer> q = new LinkedList<>();
		// 시작 값을 넣어준다.
		q.add(S);
		arr[S] = 1;

		while (!q.isEmpty()) {
			//System.out.println(Arrays.toString(arr));
			int curr = q.poll();
			if (curr == G) {
				System.out.println(arr[curr]-1);
				return;
			}
			// 만약 도착지가 더 높은 경우
			if (curr + U <= F) {
				// 그리고 방문하지 않은 경우
				if (arr[curr + U] == 0) {
					// 이동했으니까 값 하나 추가
					arr[curr + U] = arr[curr] + 1;
					// 그리고 다시 큐에 값을 넣어준다.
					q.add(curr + U);
					// 도착지가 더 낮은 경우, 방문하지 않은 값이여야 한다 // 1층 부터 시작한다.
				} 
			}
				if (curr - D > 0) {
					if (arr[curr - D] == 0) {
						arr[curr - D] = arr[curr] + 1;
						q.add(curr - D);
					}

				}

			}
		System.out.println("use the stairs");

		}

	}