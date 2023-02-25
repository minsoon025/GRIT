

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//N개의 수로 된 수열
		// A[i] + A[i+1] +... + A[j] 가 M이 되는 경우의 수
		Scanner sc = new Scanner(System.in);
		//첫번 숫자 갯수
		int N = sc.nextInt();
		//합
		int M = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
				}
		//1부터 돌아가면서 각 리스트의 합을 구함
		// 리스트의 합만큼 값이 나오게 되면  정지하고 글자 수를 카운트
		int cnt = 0;
		//Nq
		for(int i=0; i<N; i++) {
			//i부터 i 다음 수 부터 더해가면서 증가해야한다.
			int sum = 0;
			for(int j = i; j<N; j++) { 
				sum += arr[j];
				if(sum == M) {
					cnt++ ; 
					
				}
							
			}
			
		}
		System.out.println(cnt);
		
		
		
		
		
		
		
		
		
		
	}

}
