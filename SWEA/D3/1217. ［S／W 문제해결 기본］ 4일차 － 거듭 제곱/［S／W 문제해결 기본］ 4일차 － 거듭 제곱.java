import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		for(int i =0; i<10; i++) {
		int T = sc.nextInt();
		int C = sc.nextInt();
		int N = sc.nextInt();
		

		System.out.println("#" + T +" " +pow(C, N));
	}
	}

	public static int pow(int C, int N) {
		 
		// 기저조건
		if (N == 1) return C;

		// 재귀 조건
		int y = pow(C, N/2);
		// 1. 짝수인 경우 //짝수일 떄는 pow를 n/2 로 내려간다
		if (N % 2 == 0) {
			return y * y;
		}

		// 2. 홀수인 경우
		else {
			return y * y * C;
		}
	}
}