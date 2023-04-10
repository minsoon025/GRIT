import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc =1; tc<=T; tc++) {
		
		// 1일, 1달, 3달, 12개월
		int day = sc.nextInt();
		int month = sc.nextInt();
		int three = sc.nextInt();
		int year =  sc.nextInt();
		
		int[] arr = new int[13];
		for(int i = 1; i<=12; i++) {
			int per = sc.nextInt();
			// 3달 전까지를 카운트 해준다.
			arr[i] = Math.min(arr[i-1]+ per*day, arr[i-1]+ month);
			// 하루하루 계산하는 것과 3개월 치를 비교하는 것을 비교해 준다.
			if(i>=3) arr[i] = Math.min(arr[i], arr[i-3] + three);
		}
		// 1년 치랑 하나하나 계산한 값을 비교
		int min = Math.min(arr[12], year);
		System.out.println("#"+ tc + " " + min);
		
		
		}
		
		
	}

}