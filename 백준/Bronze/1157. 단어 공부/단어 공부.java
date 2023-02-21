
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26]; // 알파벳의 갯수

		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (65 <= str.charAt(i) && str.charAt(i) <= 90) { // 대문자 범위
				arr[str.charAt(i) - 65]++; // 해당 인덱스의 값 1 증가
			}

			else { // 소문자 범위
				arr[str.charAt(i) - 97]++;
			}
		}
		// 문자 중복 최댓값을 출력
		int max = -1;
		char ch = '?';

		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
			} else if (arr[i] == max) {
				ch = '?';

			}
		}
		System.out.println(ch);

	}

}
