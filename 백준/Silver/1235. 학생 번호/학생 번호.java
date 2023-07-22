import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		String[] arr = new String[N];

		
		// 뒤에서 부터 값을 확인하다가
		// 모든 값이 달라지는 순간이 생기면
		// 카운트를 멈추고 출력을 한다.

		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();

		}
		// 모두의 값이 다르면 hssh 값에 N개가 들어오고 그떄 i(글자의 갯수를 넣어주면 글자의 갯수를 알 수 있다.)
		HashSet<String> temp  = new HashSet<>();
		
		// 글자 하나하나 뒤에서 검사하기
		for(int i =1; i<=arr[0].length(); i++) {
			// 1번 2번 줄 돌리기
			for(int j=0; j<N; j++) {
				temp.add(arr[j].substring(arr[0].length() - i));
				//System.out.println((temp));
			}
			if(temp.size() == N) {
				System.out.println(i);
				return;
			}
			temp.clear();
		}
		
		
	}

}