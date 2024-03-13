import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 국가의 수
        int N = sc.nextInt();
        // 등수를 알고 싶은 국가
        int K = sc.nextInt();
        int cnt = 0;

        int[][] arr = new int[N][4]; // 국가명, 금, 은, 동

        for (int i = 0; i < N; i++) {
            arr[i][0] = i + 1; // 국가 번호
            arr[i][1] = sc.nextInt(); // 금메달
            arr[i][2] = sc.nextInt(); // 은메달
            arr[i][3] = sc.nextInt(); // 동메달
        }

        // 등수를 알고 싶은 국가(K)의 메달 수와 다른 국가의 메달 수 비교
        for (int i = 0; i < N; i++) {
            if (arr[i][1] > arr[K - 1][1] ||
                (arr[i][1] == arr[K - 1][1] && arr[i][2] > arr[K - 1][2]) ||
                (arr[i][1] == arr[K - 1][1] && arr[i][2] == arr[K - 1][2] && arr[i][3] > arr[K - 1][3])) {
                cnt++;
            }
        }
        
        // 등수 출력
        System.out.println(cnt + 1); // 등수는 (자신보다 더 잘한 나라 수) + 1
    }
}
