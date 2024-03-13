import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] miro = new int[N][M]; // 문제
        int[][] dist = new int[N][M];  // 거리 측정하기 
        boolean[][][]  visit = new boolean[N][M][2]; // 방문 여부 확인, x,y, 벽부숨 0,1

        int[] dx = {-1, 1,0,0};
        int[] dy = {0,0,-1,1};


       // 시작지점과 도착지점이 같을 경우
        if(N-1 == 0 && M-1 == 0){
            System.out.print(1);
            System.exit(0);
        }
        for(int i=0; i<N; i++){
            String str = sc.next(); // readLine() -> next() or nextLine()
                for(int j=0;j<M;j++){
                miro[i][j] = str.charAt(j) -'0';
            }
        }
        // //값 찍히는거 확인 
        // for(int i=0; i<N; i++){
        //     System.out.println(Arrays.toString(miro[i])); 
        //     }
        //     System.out.println(" ----------- 문제 ------------"); 


        Queue<int[]> q = new ArrayDeque<>();

       // 시작점 세팅 (x좌표, y좌표, crash 여부 0- x, 1-crash)
        q.offer(new int[]{0, 0, 0});   

        while(!q.isEmpty()) {
        int[] arr = q.poll();
        for(int i=0; i<4; i++){
            int cx = arr[0] + dx[i];
            int cy = arr[1] + dy[i];

        if (cx < 0 || cx >= N || cy < 0 || cy >= M) 
            continue;
        // 벽을 만났을 떄
        if(miro[cx][cy] == 1){
            // 벽을 부수지 않고 방문 하지 않았다
            // if(!visit[cx][cy][1] && arr[2] == 0){
            if(arr[2] == 0){

            visit[cx][cy][arr[2]] = true; // 방문처리
            dist[cx][cy] = dist[arr[0]][arr[1]] + 1; // 거리 측정
            // q 에 다시 넣을때 부쉇다고 체크해서 보냄
            q.offer(new int[]{cx,cy,1});
                }
            }
        // 벽을 만나지 않앗을때
            else{
            // 방문하지 않앗을때
            if(!visit[cx][cy][arr[2]]){
                visit[cx][cy][arr[2]] = true;
                dist[cx][cy] = dist[arr[0]][arr[1]] + 1;
                q.offer(new int[]{cx,cy,arr[2]});
            }
            // 도착지점에 오면 출력
                if(cx == N-1 && cy == M-1){
                    System.out.print(dist[cx][cy] + 1);
                    System.exit(0);
                }
            }

            
        }
        // //값 찍히는거 확인 
        // for(int i=0; i<N; i++){
        //     System.out.println(Arrays.toString(dist[i])); 
        //     }
        // System.out.println(" ----------- 거리 찍힘 ------------"); 

        // //값 찍히는거 확인 
        // for(int i=0; i<N; i++){
        //     for(int j =0; j<M; j++){
        //     System.out.println(Arrays.toString(visit[i][j])); 
        //     }
        //     }
        // System.out.println(" ----------- 방문여부 찍힘 ------------"); 

}  
System.out.print(-1);
    }
}