
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	// 18장의 카드로 게임을 하고 있다.
	// 한번의 게임에 둘은 카드를 섞어 9장을 나눈다.
	// 한 라운드에 한장씩 내고 적힌 점수를 비교해서 점수를 계산한다.
	// 높은 사람은 합을 얻고 적은 카드를 내면 0점이다.
	// 총점이 높으면 이기고 지면 무승부다.
	// 규영이가 이기는 경우와 지는 경우가 총 몇가지인지
	// 아홉개의 정수가 공백으로 이뤄져잇다.

	static int[] min;
	static int[] gue;
	
	static int win;
	static int lose;
	
	static int minsum;
	static int guesum;
	
	
	static boolean[] sel; // 해당 요소를 선택했다.


	// 규영이가 내는 카드의 순서를 고정한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			min = new int[9];
			gue = new int[9];
			
			sel = new boolean[9];
			
			win =0;
			lose =0;
			
			int[] arr = new int[19];
			
			
			// 규영이 값을 입력
			for(int i=0; i<9; i++) {
			arr[sc.nextInt()]++;
			}

			int min1 = 0;
			int gue1 = 0;
			for (int i = 1; i <= 18; i++) {
				// 0 인 값들은 민영이
				if (arr[i] == 0) {
					min[min1++] = i;
				}
				// 1인 값들은 규영이
				else if (arr[i] == 1) {
					gue[gue1++] = i;
				}
			}
			
			//System.out.println(Arrays.toString(min));
			//System.out.println(Arrays.toString(gue));
			// 각 값들이 잘 들어갔다.
			// 리스트를 돌리면서 원하는 값을 모두 비교해준다.
			game(0);
			
			System.out.println("#" +tc +" "+win+ " " + lose);
		}

	}
	
	
	public static void game(int idx) {
		
		if(idx == 9) { // 더이상 탐색할 노드가 없는 경우
			guesum = 0;
			minsum = 0;
			for (int i = 0; i < 9; i++) {
						// 만약 값이 크다면
				if(min[i] < gue[i]) {
					guesum += min[i] +  gue[i];
				}
				// 만약 값이 작다면
				else if(min[i] > gue[i]) {
					minsum += min[i] +  gue[i];				
				}
			}
				//각 이긴 경우
				if(minsum < guesum) {
					win++;
				}else if(minsum > guesum){
					lose++;
				}
			

			return;
		}
		// 재귀조건
				for (int i = idx; i < 9; i++) {
					swap(i, idx);
					game(idx + 1);
					swap(i, idx); // 원상복구 하는 과정이 필요함 why?
				}
			}

			// swap 메서드
			// 바꿀 인덱스 2개가 인자로 넘어와야 한다.
			// 배열을 스태틱 하게 만들었기 때문
			// 그런 경우가 아니라면 배열까지 인자로 같이 넘겨줘야한다.
			public static void swap(int a, int b) {
				// 빈컵
				int tmp = min[a];
				min[a] = min[b];
				min[b] = tmp;

			}
	
		
	

}
