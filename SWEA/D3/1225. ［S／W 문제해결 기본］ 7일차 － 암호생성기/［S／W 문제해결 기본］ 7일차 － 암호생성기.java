
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		// 10번의 테스트 케이스가 존재
		for (int i = 0; i < 10; i++) {
			q.clear();

			int T = sc.nextInt();
			for (int j = 0; j < 8; j++) {
				q.add(sc.nextInt());
			}
			// q안에 값을 모두 넣어준다.

			// q에 값을 넣는데 맨 마지막 값이 0이 되면 종료하고
			// q 값을 출력한다.
			int a = 100;
			int k = 1;
			
			while (a - k > 0) {
				for (k = 1; k <= 5; k++) {
					a = q.poll();
					// 맨 앞의 값을 뽑았ㄴ
					if (a - k > 0) {
						q.add(a - k);

					} else {
						q.add(0);
						break;
					}
				}
			}

			// 0보다 작아지면 사이클을 그만 돌리고
			System.out.print("#" + (i+1) + " ");
			System.out.print(q.poll() + " ");
			System.out.print(q.poll() + " ");
			System.out.print(q.poll() + " ");
			System.out.print(q.poll() + " ");
			System.out.print(q.poll() + " ");
			System.out.print(q.poll() + " ");
			System.out.print(q.poll() + " ");
			System.out.print(q.poll());
			
			System.out.println();

		}

	}

}
