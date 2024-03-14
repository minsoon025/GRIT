import java.util.*;

public class Main {
    static int N, M;
    static int[] arr;
    static int[] num;
    static boolean[] isUsed;
// 이전 arr 저장하는 함수 추가
    static int[] arrcheck;
	public static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        isUsed = new boolean[N];
        arr = new int[M];
        num = new int[N];
        // 변수 저장
        for(int i =0; i<N; i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);

        bfs(0, 0);
        System.out.println(sb);
    }

    private static void bfs(int start, int count) {
        if (count == M) {
            for (int i = 0; i < M; i++) {
				sb.append(arr[i] + " ");
            }
			sb.append('\n');
            return;
        }

            int brfore = -1;
        for (int i = start; i < N; i++) {
        	//false 인 경우 값이 돌아가는데, 방문하지 않은 애들만
            int now = num[i];
            if (brfore == now || isUsed[i]) { //  중복이 되거나 이미 방문했다면
                continue;
            } else{
                brfore = now;
                isUsed[i] = true;
            	arr[count] = num[i];
                // System.out.println("start : " + start + "  i : " + i + "  count  :" + count);
                // System.out.println(Arrays.toString(arr));
                // 이전 arr 값을 받아온다
                bfs(i + 1, count+1); // arr의 인덱스를 +1 시켜준다.
                isUsed[i] = false;
            }
        }
    }
}