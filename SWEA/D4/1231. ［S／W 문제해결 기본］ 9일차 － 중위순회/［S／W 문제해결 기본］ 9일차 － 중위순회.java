

import java.util.Scanner;

public class Solution {
		static char[] arr;
		static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 10개
		for (int tc = 1; tc <= 10; tc++) {
			N = sc.nextInt(); 
			arr = new char[N + 1];
			arr[0] = '\u0000';

			// 노드의 값을 받아온다.
			for (int i = 1; i <= N; i++) {
				 String str = sc.next();
				 String str2 = sc.next();
				 String str3 = sc.nextLine();
				 
				 arr[i] = str2.charAt(0);
				 ;
			}
			// 모양을 보아하니 중위 순회를 사용하면 될듯하다.
			System.out.print("#" +tc +" ");
			traverse(1);
			System.out.println();

		}
	}
	
	private static void traverse(int i) { //i번째 노드의 순회
		//인덱스의 크기가 벗어나지 않는 범위
		if(i <= N) {
			// 중위 순회 : 먼저 출력을 한다.
			//L : 왼쪽 트리로 탐색을 이어나감
			traverse(i*2);
			//V : 자기 자신을 방문처리
			if(arr[i] != '\u0000')
				System.out.print(arr[i]);
			//R : 오른쪽으로 탐색을 이어나감
			traverse(i*2+1);
		}
	}
	
	

}
