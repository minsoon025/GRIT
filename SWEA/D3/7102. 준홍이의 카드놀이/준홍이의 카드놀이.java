
import java.util.Arrays;
import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		//테스트 케이스 만큼 돌리기
		for(int i =0; i< T; i++) {
			
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			// n+m+1 사이즈의 함수를 만든다.
			// 카드의 숫자는 1부터 시작하고 최대값
			int[] arr = new int[N+M];
			
			for(int j =0; j<N; j++) {
				for(int k=0; k<M; k++) {
					arr[j+k]++;
					}
			}
			// 리스트에 나온 숫자 만큼 카운트를 해줬다.
			// 가장 큰 값의 리스트를 불러오면된다.
			int max = 0;
			int max_arr = 0;
			 
			//공통인 맥스 값인 애들을 리스트에 넣어서 따로 표현해 줘야한다.
			
			for(int j= 0; j<N+M; j++) {
				if(arr[j] >max) {
					max = arr[j];
					max_arr = j;
								}}
			System.out.print("#"+(i+1) + " ");
			//맥스값이랑 같은 애들을 뽑아온다.
			for(int j= N+M-1; j>=0; j--) {
				// 공통으로 큰 값이 있으면 값을 뽑아온다.
				if(arr[max_arr] == arr[j]) {
					System.out.print(N+M-j + " ");
			}
						}
			System.out.println();
			
			
			
			
			
			
					}
		}

}
