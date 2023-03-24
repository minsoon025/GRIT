import java.util.Scanner;

public class Solution {
	
	static int N, B, ans, mini; // n 점원의 수, B  선반의 높이
	static int[] H; // 점원의 키를 저장
	static boolean[] sel;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 높이가 b인 선반
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			// n 점원들의 명수
			N = sc.nextInt();
			// B 높이가 B 인 선반
			B = sc.nextInt();
			H= new int[N];
			sel = new boolean[N];
			ans = 0;
			mini = 999999999;

			for(int i=0; i<N; i++) {
				H[i] = sc.nextInt();
			}// d입력끝
			key(0);	
			System.out.println("#" + tc + " " +mini);
		}
		
	}
	
	public static void key(int idx) {
		//base case : 재귀를 빠져 나갈 수있는 조건
		// 모든 재료를 넣을지 말지에 대한 판단을 끝났어
		if(idx == N) {
			ans =0;
			for(int i =0; i<N; i++) {
				
				if(sel[i])
					ans +=H[i];
			}
			if(ans - B >= 0) {
				mini = Math.min((ans - B), mini);
				//System.out.println(mini);
			}
			return;
		}
		
		
		
		// recursive : 나 자신을 다시 호출하는 조건
		sel[idx] = true; // idx 번째 재료를 사용했어
		key(idx+1); // 다음 재료를 고려해
		
		sel[idx] = false; // idx 번째 재료를 사용하지 않았어
		key(idx+1);   // 다름 재료를 고려해 
		
		
		
	}

}