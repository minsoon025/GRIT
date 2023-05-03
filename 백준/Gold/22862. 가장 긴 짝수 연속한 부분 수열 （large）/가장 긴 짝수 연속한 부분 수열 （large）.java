import java.util.Scanner;

public class Main {
	static int N, K;
	static int arr[];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 홀수를 없애면서 가는데
		// 투포인터 사용 홀수면 cnt 증가
		// cnt가 K개 이하일때 까지 hol길이를 늘리면서 max 구함

		N = sc.nextInt();
		K = sc.nextInt();

		arr = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}
		combi();
	}

	static void combi() {
		int len = 0; // 길이
		int cnt = 0; // 홀수 갯수
		int hol = 0; // 홀수 길이 늘리기

		for (int i = 1; i <= N; i++) {
			// 카운트가 1이상, 홀수인경우
			if (cnt >= 1 && arr[i - 1] % 2 != 0)
				cnt--;
			// 홀수 길이를 카운트
			while (hol + 1 <= N && cnt <= K) {
				// 홀수인 갯수를 카운트
				if (arr[++hol] % 2 != 0)
					cnt++;
			}
			//늘린 길이만큼에서 
			len = Math.max(len, hol - i + 1 - cnt);

		}
		System.out.println(len);

	}

}