import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정수 갯수
		int N = sc.nextInt();
		int[] arr = new int[N];

		// M보다 크면서 가장 작은 차이
		int M = sc.nextInt();
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		// m값 초기화
		int start = 0;
		int end = 0;
		int min = Integer.MAX_VALUE;
		Arrays.sort(arr);
		while (start <= end && end < N) {
			if (arr[end] - arr[start] >= M) {
				min = Math.min(min, arr[end] - arr[start]);
				start++;
			} else {
				end++;
			}

		}
		System.out.println(min);
	}
}
