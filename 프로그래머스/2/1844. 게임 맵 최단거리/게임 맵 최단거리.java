import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[][] maps) {

        // N,M 을 받아온다,
        int N  = maps.length;
        int M = maps[0].length;
        
        // 거리 입력
        int[][] dist = new int[N][M];
        dist[0][0] = 0;
                
        //4방 탐색
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        
        //Q 만들기
        Queue<int[]> q = new ArrayDeque<>();
        
        maps[0][0] = 0;
        
        int[] arr = new int[2];
        arr[1] = 0;
        arr[0] = 0;
        q.offer(arr);
        
        while(!q.isEmpty()){
            arr = q.poll();
            int cx = arr[0];
            int cy = arr[1];
            
            for(int i=0; i<4; i++){
                if(cx + dx[i] < 0 || cy +dy[i] < 0 || cx + dx[i] >= N || cy + dy[i] >= M)
                    continue;
                if(maps[cx + dx[i]][cy+dy[i]] == 1){
                    maps[cx + dx[i]][cy+dy[i]] = 0;
                    
                    arr = new int[2];
                    arr[0] = cx + dx[i];
                    arr[1] = cy + dy[i];
                    
                    q.offer(arr);
                    dist[arr[0]][ arr[1]] = dist[cx][cy] + 1;
                }
            }
        }
        
        // // 거리 출력
        // for(int i=0; i<M; i++){
        //     System.out.println(Arrays.toString(dist[i]));
        // }
        if(dist[N-1][M-1] == 0)
            return -1;
        else{
        return dist[N-1][M-1] + 1;
        }
    }
}
