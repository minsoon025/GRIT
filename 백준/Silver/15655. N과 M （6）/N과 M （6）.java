import java.util.*;

public class Main {
    static int N, M;
    static int[] arr;
    static int[] num;
    static boolean[] isUsed;
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

        for (int i = start; i < N; i++) {
        	//false 인 경우 값이 돌아가는데, 방문하지 않은 애들만
            if (!isUsed[i]) {
            	isUsed[i] = true;
            	arr[count] = num[i];
                // System.out.println("start : " + start + "  i : " + i + "  count  :" + count);
                // System.out.println(Arrays.toString(arr));
                bfs(i + 1, count+1); // arr의 인덱스를 +1 시켜준다.
                isUsed[i] = false;
            }
        }
    }
}