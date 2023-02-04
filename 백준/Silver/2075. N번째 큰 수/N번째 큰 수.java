import java.io.BufferedReader;
import java.io.InputStreamReader;
// 힙을 사용해보자
// 힙의 크기를 유지하면서 넣고 빼고를 반복
// 모든 수는 자신의 한칸 위에 보다 크다
// n번째 큰 수를 뽑기에
// 오름차순으로 한 값씩 받으면서 리스트에 추가하면 서 돌고
// n을 초과하게 되면 뽑는다.
// 오름차순의 힙을 유지
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 처음에 스캐너 쓰니 시간초과뜸
		StringTokenizer st; // 값을 스트링으로 받아들여 쪼개기

		int n = Integer.parseInt(br.readLine()); // n 값을 받아들임
		int[] arr = new int[n * n]; // 크기 지정
		int idx = 0; // 들어가는 값

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine()); // 스트링값으로 들어가는 것들 토큰화
			for (int j = 0; j < n; j++) {
				arr[idx++] = Integer.parseInt(st.nextToken()); // 값 입력해서 안에 들어가게
			}
		}

		Arrays.sort(arr); // 배열

		System.out.println(arr[n * n - n]); // 값 출력
	}
}
