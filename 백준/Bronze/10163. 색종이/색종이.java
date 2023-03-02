import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//색종이의 개수 N이 주어진다.
		int N = sc.nextInt();
		
		int[][] arr =  new int[1001][1001];
		
		// 각 값을 입력한다. 색종이 별로 번호를 입력한다.
		for(int i = 1; i<= N; i++) {
			// 첫번째 
			// x,y좌표, x1, y1 순으로 입력된다.
			int x = sc.nextInt();
			int y = sc.nextInt();
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			
			// 첫 색종이는 1을 입력하고 두번쨰는 2
			for(int j = x; j<x+x1; j++) {
				for(int k =y; k<y+y1; k++) {
					arr[j][k] = i;
				}
		}
			
		}
	
		
		
		// 각 색종이마다 값들이 들어가고
		// 그 값들을 출력한다.
		for(int i =1; i<=N; i++) {
			int cnt = 0;
		for(int l =0; l<1001; l++) {
			for(int m = 0; m<1001; m++) {
				if(arr[l][m] == i) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		}
	}
		
		
		
	
}