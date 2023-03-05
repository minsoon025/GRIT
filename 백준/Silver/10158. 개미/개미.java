import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 격자 크기
		int w = sc.nextInt();
		int h = sc.nextInt();

		// 초기 위치값
		int x = sc.nextInt();
		int y = sc.nextInt();

		// timr
		int time = sc.nextInt();

		// 한번 움직일때마다 시간을 카운트 해준다.
		int cnt = 1;

		// 그 방향이 범위안에 있으면 카운트 하고 그렇지 않음 범위 밖으로 나간다.
		// x좌표 y좌표를 따로 구해줄 것이다.
		// 길이를 두배라고 잡고 그 나머지 만큼 이동하는 것이다.
		// move는 돌아갔다 온다.
		// x축 구하기
		int x_move = ((time + x) % (2 * w));
		// 한 변보다 길이가 짤은경우
		if (x_move <= w) { // 위치는
			System.out.print(x_move + " ");

		} else { // 길이가 긴 경우
			int x_long = x_move - w;
			while (x_long > w) {
				x_long -= w;
			}
			x_move = w - x_long;
			System.out.print(x_move + " ");
		}

		// y축 구하기
		int y_move = ((time +y) % (2 * h)) ;
		// 한 변보다 길이가 짤은경우
		if (y_move <= h) { // 위치는
			System.out.println(y_move);

		} else { // 길이가 긴 경우
			// y_long가 길이가 짧아질대 까지 수행
			int y_long = y_move - h;
			while (y_long > h) {
				y_long -= h;
			}
			y_move = h - y_long;
			System.out.println(y_move);
		}

	}

}