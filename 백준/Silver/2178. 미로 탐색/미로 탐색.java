import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int[][] map = new int[N][M];

        for(int i=0; i<N; i++){
                String num = sc.nextLine();
            for(int j=0; j<M; j++){
                map[i][j] = num.charAt(j) - '0';
                    }
            }



    Queue<int[]> q = new ArrayDeque<>();
    int[] arr = new int[2];
    arr[0] = arr[1] = 0;
    q.offer(arr);
    int dist = 1; 
    while(!q.isEmpty()){
        arr = q.poll();
        int cx = arr[0];
        int cy = arr[1];
        for(int i=0; i<4; i++){
            if(cx + dx[i] < 0 || cx + dx[i] >= N || cy +dy[i] < 0 || cy + dy[i] >= M)
            continue;
            if(map[cx+dx[i]][cy+dy[i]] == 1){
                map[cx+dx[i]][cy+dy[i]] = map[cx][cy] +1;
                // map[cx+dx[i]][cy+dy[i]] = 0;

                arr = new int[2];
                arr[0] = cx + dx[i];
                arr[1] = cy + dy[i];
                q.offer(arr);
            }
        }
    //     System.out.println(" 거리 추가");
    //     for(int i=0; i<N; i++){
    //     System.out.println(Arrays.toString(map[i]));
    // } 
}
    System.out.println(map[N-1][M-1]);
    
} }
