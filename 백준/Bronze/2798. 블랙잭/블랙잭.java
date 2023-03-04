import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 카드 합이 21이 넘지 않게
		// 최대합을 크게 만드는 게임
		
		// N장의카드 중 3장을 골라서
		int N = sc.nextInt();
		int[] arr = new int[N];
		//M의 합을 넘기지 않고 최대한 가까워야한다.
		int M = sc.nextInt();
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();			
		}
		
		
		int max = 0;
		// 그런 카드 3개를 뽑는 합은?
		for(int i = 0; i<N; i++ ) {
			for(int j =i+1; j<N; j++) {
				for(int k =j+1; k<N; k++) {
					// 서로 다른 경우일때 합을 구한다.
					if( i != j && j != k && k!=i) {
						int sum = arr[i] + arr[j] + arr[k];
						if(sum <= M) {
							if(sum > max) {
								max = sum;
							}
						}
					}
				}
			}
		}
		System.out.println(max);
		
		
		
		
	}

}