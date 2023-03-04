import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 스위치 수를 입력 받는다.
		int T = sc.nextInt();
		// 1부터 T 까지 입력을 한다.
		int[] arr = new int[T + 1];
		// 스위치마다 꺼진지 켜진지를 입력
		for (int i = 1; i <= T; i++) {
			arr[i] = sc.nextInt();
		}

		// 학생수를 입력받는다.
		int N = sc.nextInt();
		// 성별, 스위치 번호
		for (int i = 0; i < N; i++) {
			int sex = sc.nextInt();
			int num = sc.nextInt();

			// 남학생인 경우
			if (sex == 1) {
				// 남학생인 경우 배수를 받아와 스위치의 번호를 바꿔준다.
				for (int j = num; j <= T; j += num) {
					// 번호를 하나씩 낮춰서 입력을 해서 배수 만큼 값을 바꿔주었다
					// 이런 경우 반례가 있을 수 있어 체크 하고 넘어가자

					// 스위치가 0인경우
					if (arr[j] == 1) {
						arr[j] = 0;
					}

					// 스위치가 1인 경우
					else if (arr[j] == 0) {
						arr[j] = 1;
					}

				}
				// 남학생의 경우가 끝나고 확인
			}

			// 여학생인 경우
			else if (sex == 2) {
	
				// 본인과 하나씩 멀어지면서
				// 양쪽 스위치 값이 같은 경우 값을 바꿔주고
				// 어떤 경우에도 자신의 값을 바꿔준다.
				// 본인 부터 멀어짐으로 최대 T/2 인데 일단 보류
				for (int j = 0; j <= T+999; j++) {
					// 일단 num+j, num-j가 범위 안인 경우이다.
					if (num > 0&& num<=T&&(num + j) <= T && (num - j) > 0) {
						// 양쪽 값이 같은 경우
						if (arr[num + j] == arr[num - j]) {
							// 그때 1인 경우
							if (arr[num + j] == 1) {
								arr[num + j] = 0;
								arr[num - j] = 0;
							}
							// 0인 경우
							else if (arr[num + j] == 0) {
								arr[num + j] = 1;
								arr[num - j] = 1;
							}

						}
						// 양쪽값이 다른 경우
						else  {
 							break;
						}

					}
				}
				// 여학생이 마무리 된 경우

			}
		}
		// 한줄에 20개까지만 출력
		
		for (int j = 1; j <= T; j++) {
			System.out.print(arr[j] + " ");
			if(j%20 == 0) System.out.println();
			}
		}
	}