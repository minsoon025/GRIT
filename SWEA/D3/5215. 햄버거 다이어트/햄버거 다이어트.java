import java.util.Scanner;

public class Solution {
	static int N;
	static int K;
	static int max;
	static int[][] arr;
	public static boolean[] sel;

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Test = sc.nextInt();
		for (int tc = 1; tc <= Test; tc++) {

			// 재료의 수
			N = sc.nextInt();
			// 제한 칼로리
			K = sc.nextInt();
			
			arr = new int[N][2];
			sel = new boolean[N];
			
			max =0;

			for (int i = 0; i < N; i++) {
				// 각 점수
				arr[i][0] = sc.nextInt();
				// 각 칼로리
				arr[i][1] = sc.nextInt();
			}
			
			
			combi(0);
			System.out.println("#" + tc+" " + max);
			

		}

	}
	public static void combi(int idx) {
		//원하는 칼로리 이하인 경우
		if(idx==N) {
			int kcal = 0;
			int point =0;
			// 특정 칼로리 보다 적은 점수중 가장 큰 값을 담는다.
			for(int i=0; i<N; i++) {
				if(sel[i]) {
					kcal += arr[i][1];
					point +=arr[i][0];
				}
				if(kcal <= K) {
					if(max < point) {
						max = point;
					}
				}
				
			}
			return;
		}
		sel[idx] = true; // idx 번째 재료를 사용했어
		combi(idx+1); // 다음 재료를 고려해
		
		sel[idx] = false; // idx 번째 재료를 사용하지 않았어
		combi(idx+1);   // 다름 재료를 고려해
		
		
		
	}

}
