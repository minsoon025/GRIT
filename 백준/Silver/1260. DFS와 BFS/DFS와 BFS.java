import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int N, M, V;
	static int[][] arr = new int[1001][1001];
	static boolean[] visited = new boolean[1001];

	public static void main(String[] args) {
		// DFS를 실행한 결과 - 시스템 스택
		// BFS를 수행한 결과 - 큐를 사용하기
		Scanner sc = new Scanner(System.in);

		// 정점의 갯수N
		N = sc.nextInt();

		// 간선의 갯수 M
		M = sc.nextInt();

		// 탐색을 시작할 정점
		V = sc.nextInt();

		arr = new int[1001][1001];
		visited = new boolean[1001];

		// M개의 줄에 두 정점의 번호가 들어가 있다.
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			//양쪽에 1 값을 넣어줘야한다.
			arr[x][y] = 1;
			arr[y][x] = 1;
		}

		DFS(V);
		System.out.println();

		// BFS
		visited = new boolean[1001];
		Queue<Integer> q = new LinkedList<>();
		q.offer(V);
		visited[V] = true;

		// 방문 확인
		while (!q.isEmpty()) {
			int curr = q.poll();
			System.out.print(curr + " ");

			for (int k = 1; k <= N; k++) {
				if (arr[curr][k] == 1 && visited[k] == false) {
					q.offer(k);
					visited[k] = true;
				}

			}
		}

	}

	// 시작점이 들어간다.
	static void DFS(int idx) {
		// DFS를 사용하자

		visited[idx] = true;
		System.out.print((idx) + " ");

		for (int i = 1; i < N + 1; i++) {
			if (!visited[i] && arr[idx][i] == 1) {
				DFS(i);
			}
		}

	}

}