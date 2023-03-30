import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
	static int[] p; // 대표를 저장할 배열

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			// 섬의 갯수 // 정점의 갯수
			int V = sc.nextInt();
			// 간선의 수
			int E = V*(V-1)/2;

			// 세율은 해저 터널의 길이 제곱 곱하기 세율이다.
			long[][] sum = new long[V][2];
			long[][] edges = new long[E][3];

			
			// 값을 입력해준다
			for (int i = 0; i<V; i++) {
				sum[i][0] = sc.nextInt();
			}
			for (int i = 0; i<V; i++) {
				sum[i][1] = sc.nextInt();
			}
			
			double tax = sc.nextDouble();

			// 모든 간선들을 다 받아와야ㅕ한다.
			int cnt = 0;
			for(int i =0; i<V-1; i++) {
				for (int j = i+1; j<V; j++) {
				edges[cnt][0] = i;
				edges[cnt][1] = j;
				long a = sum[i][0] - sum[j][0];
				long b = sum[i][1] - sum[j][1];
						
				edges[cnt++][2] = (a*a) + (b*b) ;
			}
			}


			// 크루스칼 1단계 : 간선을 정렬한다.(오름차순)
			Arrays.sort(edges, new Comparator<long[]>() {

				@Override
				public int compare(long[] o1, long[] o2) {
					if(o1[2] < o2[2]) return -1;
					if(o1[2] > o2[2]) return 1;
					return (int)(o1[2] - o2[2]);
				}
			});
			

			// 크루스칼 2단계 : V-1개의 간선을 뽑는데 사이클이 발생하지 안는 친구들로 뽑는다.
			p = new int[V];
			// make - set : 나 자신을 대표로 초기화를 하자
			for (int i = 0; i < V; i++) {
				p[i] = i;
			} // makeset 다햇다.

			long ans = 0; // 최소비용을 저장할 친구
			int pick = 0; // 내가 뽑은 간선의 수

			// while() for()응 사용 가능
			// 모든 간선을 순회하면서 체크한다.
			for (int i = 0; i < E; i++) {
				// i번쨰의 간선을 뽑아 두 정점의 대표를 확인하겠다.
				long x = edges[i][0];
				long y = edges[i][1];

				// 이건 무슨 의미?? : 각 대표가 다르다면 사이클이 아니면 고로
				// 고를 수 있다 즉 유니온 해야한다
				if (findset((int)x) != findset((int)y)) {
					union((int)x,(int) y);
					ans += edges[i][2];
					pick++;
				}
				// 뽑은게 간선의 최소 갯수랑 같아진다면 멈춰
				if (pick == (V - 1))
					break;
			}
			System.out.println("#"+ tc  +" "+Math.round(ans * tax));
			//System.out.println(tax);

		}
	}

	// 대표를 반환해야한다
	static int findset(int x) {
		// 패쓰 컴프레션 적용버전
		if (x != p[x])
			p[x] = findset( p[x]);
		return p[x];

	}

	// 유니온 간선 연결 
	static void union(int x, int y) {
		p[findset(y)] = findset(x); // rank 이런거 고려 안했고 그냥 y를 무조건 x밑으로
	}
	

}