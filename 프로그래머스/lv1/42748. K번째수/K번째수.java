import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int N = commands.length; // 커맨드의 개수
        int[] ans = new int[N]; // 결과를 담을 배열

        for (int i = 0; i < N; i++) {
            int start = commands[i][0] - 1; // 자를 시작 위치 (0-based index로 변경)
            int end = commands[i][1]; // 자를 끝 위치
            int k = commands[i][2] - 1; // 찾을 위치 (0-based index로 변경)

            // 자르고 정렬할 배열 생성
            int[] arr = Arrays.copyOfRange(array, start, end);

            // 배열 정렬
            Arrays.sort(arr);

            // 정렬된 배열에서 k번째 수를 결과 배열에 저장
            ans[i] = arr[k];
        }
        return ans;
    }
}
