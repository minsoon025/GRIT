
import java.util.Arrays;
import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 10개
		for (int i = 0; i < 10; i++) {
			// 덤프 횟수 입력
			int dum = sc.nextInt();
			// 박스만들기
			int[] box = new int[100];

			for (int k = 0; k < box.length; k++) {
				box[k] = sc.nextInt();
			}
			// 박스를 보기 좋게 정렬한다.

			// 최대 최소에서 하나씩 빼고 더하면서 재배열
			for (int j = 0; j < dum; j++) {
				Arrays.sort(box);
				box[0]++;
				box[99]--;
			}
			Arrays.sort(box);
			System.out.printf("#%d %d\n", i+1, box[99]-box[0]);
		}
	}
}
