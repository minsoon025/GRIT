

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 많은 값들을 입력받고 그 값들을
		// 추가 받고 밀어내고 하는 문제이다.

		// 테스트 케이스 10개가 주어진다.
		for (int tc = 1; tc <= 10; tc++) {
		List<Integer> arr = new ArrayList<>();

			// 암호문의 길이를 받아온다.
			int N = sc.nextInt();
			System.out.print("#" + tc + " ");

			// 리스트 안에 값을 넣어준다.
			for (int i = 0; i < N; i++) {
				arr.add(sc.nextInt());
			}

			// 명령어의 갯수
			int ea = sc.nextInt();
			for (int i = 0; i < ea; i++) {

				// |값을 받아온다.
				String str = sc.next();

				// 시작값을 받아온다.
				int start = sc.nextInt();
				// 숫자 삽입 갯수
				int in = sc.nextInt();

				// 그리고 값을 넣어줘야한다.
				for (int j = 0; j < in; j++) {
					arr.add(start +j, sc.nextInt());
				}

			}
			for (int i = 0; i < 10; i++) {
				System.out.print(arr.get(i) + " ");
			}
			System.out.println();
		}
	}

}
