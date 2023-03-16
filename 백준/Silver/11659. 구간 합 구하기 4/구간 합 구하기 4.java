import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 수의 갯수 
		int N = sc.nextInt();
		
		// 시간 복잡도를 줄이기 위해 각 값의 데이터를 담아준다,
		int[] dp = new int[N+1];
		dp[0] = 0;

		// 합을 구해야하는 횟수
		int M = sc.nextInt();
		
		//N개의 수가 주진다.
		for(int i =1; i<=N; i++) {
			int num = sc.nextInt();
			dp[i] = num + dp[i-1];
					}
		
		//ㅡM만큼 돌려야한다.
		for(int i =0; i<M; i++) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(dp[b] - dp[a-1]);
		}
			
		
		
		
	}

}