import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        String[] name = new String[N];
        int[] num = new int[N];

        // 입력 받기
        for (int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            name[i] = input[0];
            num[i] = Integer.parseInt(input[1]);
        }

        // 이진 탐색을 이용하여 칭호 찾기
        for (int i = 0; i < M; i++) {
            long score = Long.parseLong(br.readLine());
            int left = 0;
            int right = N - 1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (num[mid] < score) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            sb.append(name[left]).append('\n');
        }

        System.out.print(sb);
    }
}
