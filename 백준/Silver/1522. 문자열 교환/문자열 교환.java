import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		// a가 연속적이여야한다
		// 0 부터 a 갯수를 카운트 하고 
		// b fmf 카운트 하면서 교환하면된다
		// 양 끝이 연결되어잇으니 마지막 인덱스 길이 체크
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int min = Integer.MAX_VALUE;
		
		int cnt = 0;
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i) == 'a') {
				cnt++;
			//	System.out.println("a : " + cnt);
			}
		}
		
		for(int i=0; i<str.length(); i++) {
			int cntB = 0;
			for(int j = i; j<i+cnt; j++) {
				int idx = j%str.length();
				if(str.charAt(idx) == 'b') {
					cntB++;
				}
			}
			//System.out.println("b : " + cntB);
			min = Math.min(min, cntB);
		}
		
		System.out.println(min);
	}
}