import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			//1일 이용권
			int one  =sc.nextInt();
			//1달이용권
			int month  =sc.nextInt();
			//3달이용권
			int three  =sc.nextInt();
			//1년 이용권
			int year  =sc.nextInt();
			
			// 1년간 계획
			int[] plan = new int[13];
			for(int i = 1; i<=12; i++) {
				int day  = sc.nextInt();
				plan[i] = Math.min(plan[i-1]+day*one, plan[i-1] + month);
				// 3달 이상 넘어가면 
				if(i>=3) plan[i] = Math.min(plan[i], plan[i-3]+ three);
				
			}
			int min = Math.min(plan[12], year);
			System.out.println("#" + tc + " " + min);
			
			
		}
	}

}