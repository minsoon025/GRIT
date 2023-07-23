import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();

		String[][] arr = new String[N][M];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextLine().split("");
		}
		
//		for(int i=0; i<N; i++) {
//		System.out.println(Arrays.toString(arr[i]));
//		}

		int area = 0;
		int maxArea = 0;
		int Min = Math.min(N, M);

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				for (int k = 0; k < Min; k++) {
					if (i + k < N && j + k < M) { // 배열 범위 이내

						// 4개의 꼭짓점이 정사각형이 되는 조건
						if (arr[i][j].equals(arr[i][j + k]) && arr[i][j].equals(arr[i + k][j])
								&& arr[i][j].equals(arr[i + k][j + k])) {
							area = (k + 1) * (k + 1);
							maxArea = Math.max(maxArea, area);
						}
					}
				}
			}
		}

		System.out.println(maxArea);
		sc.close();
	}

}