import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] memo = new int[1001];
		memo[1] = 1;
		memo[2] = 2;

		for (int i = 3; i < n + 1; i++) {
				memo[i] = (memo[i - 1] + memo[i - 2])%10007;
			}
		System.out.println(memo[n]);
	}

}