
import java.util.Scanner;

public class Main {
	// 값을 체크, 중복제거에 쓰일듯
	static boolean check[];
	
	static int arr[];
	// 깊이 측정 for문 한번 돌면서 몇개 뽑을지 정하는 역할
	static int depth = 0;
	//값 모아주기
	static StringBuilder sb = new StringBuilder();
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int m =sc.nextInt();
		
		check = new boolean[n];
		arr = new int[m];
		michinfor(n,m,0);
		System.out.println(sb);
	
	}
	public static void michinfor(int n, int m, int depth) {
		// m개 만큼 뽑는 경우
		if(depth ==m) {
			// 길이 만큼의 값을 리스트에 넣얻줌
			for(int i =0; i<arr.length; i++) {
				sb.append(arr[i]);
				
				if(i!=arr.length-1)sb.append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=0; i<n; i++) {
			//중복방지
			if(!check[i]) {
				check[i] =true;
				// 깊어지면 그 다음값을 중복금지로 잡음
				arr[depth] = i+1;
				// 깊이를 추가
				michinfor(n,m,depth+1);
				check[i]=false;
			}
		}
		return;
	}
	

}
