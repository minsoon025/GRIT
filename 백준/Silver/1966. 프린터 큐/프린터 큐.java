import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// 문서 가장 앞의 중요도를 확인
		// 나머지 문서 중 중요도가 높은 문서가 있음 맨 뒤에 배치
		
		// 문서의 개수 N
		int T = sc.nextInt();
		
		while(T-- >0) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int cnt = 0;
			Queue<int[]> q = new LinkedList<>();
			for(int i=0; i<N; i++) {
				q.add(new int[] {i, sc.nextInt()});
			}
			while(true) {
				int now[] = q.remove();
				boolean flag =  true;
				for(int que[]:q) {
					if(que[1]>now[1]) {
						flag=false;
						break;
					}
				}
				if(flag) {
					cnt++;
					if(now[0]==M) break;
				}else {
					q.add(now);
				}
				
				
			}
			System.out.println(cnt);
			
		}
		
	}

}