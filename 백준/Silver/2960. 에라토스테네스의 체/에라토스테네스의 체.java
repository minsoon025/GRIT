import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		boolean[] prime = new boolean[N + 1];
		
		int cnt = 0;
		for (int i = 2; i <= N; i++) {    //2이상의 값부터 탐색
			for (int j = i; j <= N; j = j + i) { // n의 값을 가지고 그 배수를 하나씩 대입한다. 
				if (prime[j] == false) { // j가 2인경우 flase를 가지고 하니씩 더해간다. 2의 배수들이 2,4,6,8 true 값으로 바뀜으로 삭제 됨
					cnt++;    // 2의 배수가 teur 가 되었다. 
				prime[j] = true; // 3이 들어와 3의 배수를 모두 true 를 만들어 간다.
				}
				// 값출력
				if (cnt == K) { // K번째가 되었을 때 j 의 값을 확인
					System.out.print(j);
					System.exit(0); // 더이상 함수가 실행되지 않게 종료
			}
		}

		}
	}
}
