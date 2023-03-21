import java.util.Scanner;

public class Solution {

	static int T;
	static int N;
	static int K;
	static int[] arr;
	static int cnt;
	static boolean[] sel;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {

		// 갯수
		N = sc.nextInt();
		// 합
		K = sc.nextInt();

		cnt = 0;

		sel = new boolean[N];
		// 배열 만들기
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		allsum(0);
		System.out.println("#"+ tc+" " + cnt);
		}

	}

	// 원하는 합
	public static void allsum(int idx) {
		// 원하는 합이 되었을 때
		if (idx == N) {
			int sum = 0;
			for (int i = 0; i < N; i++) {
				if(sel[i])
				sum += arr[i];

			}
			if (sum == K) {
				cnt++;
			}
			return;
		}
		
		sel[idx] = true; // idx 번째 재료를 사용했어
		allsum(idx+1); // 다음 재료를 고려해
		
		sel[idx] = false; // idx 번째 재료를 사용하지 않았어
		allsum(idx+1);   // 다름 재료를 고려해
	
	}
}