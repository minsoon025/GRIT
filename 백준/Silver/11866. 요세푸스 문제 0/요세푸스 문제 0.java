import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();

		// 명수
		int N = sc.nextInt();
		// 마다 내보냄
		int K = sc.nextInt();

		// q에 값들을 넣어준다.
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}

		// 사이즈가 모두 빠질 때 까지
		System.out.print("<");
		while (q.size() != 0) {
			for (int i = 1; i < K; i++) {
				q.add(q.remove());
			}
			System.out.print(q.remove());
			if (q.size() != 0)
				System.out.print(", ");

		}

		System.out.print(">");

	}

}