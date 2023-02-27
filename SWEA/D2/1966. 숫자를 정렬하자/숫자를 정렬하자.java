

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스를 받아온다.
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			System.out.print("#" + tc + " " );
			
		// 값이 몇 번 입력될지
		int N =  sc.nextInt();
		int[] arr = new int[N];
		
		for(int i =0; i<N; i++) {
			arr[i] = sc.nextInt(); 
			
			}
		Arrays.sort(arr);
		
		for(int j=0; j<N; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		
		
		
		}
	}

}
