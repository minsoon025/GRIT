
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	static int N;
	static int cnt;
	static int[] arr;


	// 8방 탐색을 하면서 그 값에 들어가는 퀸들을 경우를 만들어준다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			// 체스판의 크기들 받아온다
			N = sc.nextInt();
			// 함수에 넣어서 나온 최대값을 출력해준다.
			arr = new int[N];
			cnt = 0;
			
			backtracking(0);
			
			System.out.println("#"+ tc +" "+cnt);

		}
	}



	// 값들이 들어왔고 포문을 돌리면서 원하는 값들이 얼마나 있는지 확인해본다.
	// 만약 원하는 값을 만나지 않는다면 그 값을 false 로 바꾸고 한칸 위로 올라가야한다.
	// 포문을 돌리는데 원하는 값이 나온다면 그 값에 배열을 만들어준다.
	// 배열을 만들어주고 값을 계속 돌리는데  원치 않는 값을 만난다면..? 
	
	// columm 값이라 생각하하고 하나의 값씩 ㄴ려가면서 row 값을 저장하고 그 값만 확인해도 된다.
	
	public static void backtracking(int row) {
		if(row == N ) { // 더이상 탐색할 노드가 없다.
			// 맞는 솔루션인 경우
			cnt++;
			return;
		}
		//  만나면 안되기 때문ㅇ
		for(int col =0; col<N; col++) {
			boolean meet = false;
			for(int j=0; j< row; j++) {
				// 이미 값이 놓여진 곳을 저장한다
				// row는 하나씩 증가함으로 그 증가하는 값에 맞는 col 값을 저장해준다.
				int point = arr[j];
				// 돌과 같은 자리에 없는 경우 , 각 한칸 아래의 값을 넣어준다.
				if(point == col || point + (row-j) == col || point -(row-j) == col) {
					//System.out.println(Arrays.toString(arr));
					// 만약 돌이 들어간다면 true 값으로1 바꿔준다.
					meet = true;
					break;
				}
				
			}
			if(meet)continue; // 트루 값이면 다음 값을 실행한다.
			
			// 행열을 저장해준다
			arr[row] = col;
			backtracking(row+1);
			
		}
		
		}


}
