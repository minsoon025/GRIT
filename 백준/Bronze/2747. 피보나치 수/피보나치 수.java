import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] dp = new int[46];
		
		dp[0] =0;
		dp[1] =1;
		dp[2] =1;
		for(int i =2; i<=N; i++) {
			dp[i] = dp[i-1] +dp[i-2];
		}
		System.out.println(dp[N]);
	}

}