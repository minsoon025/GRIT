import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        
        
        int N = maps.length;
        int M = maps[0].length;
        
        
        
        // 거리를 구할 리스트를 뽑아준다.
        int[][] dist = new int[N][M];
        dist[0][0] = 0;
        
        //4방 탐색 만들기
        int[] dx =  {-1,1,0,0};
        int[] dy =  {0,0,-1,1};
        
        // queue 만들기
        Queue<int[]> q = new ArrayDeque<>();
        
        // 1인 지점을 만나면 0으로 만들고 큐에 x,y 를 넣음
        // 거리는 하나씩 추가를 한다.
        
                    maps[0][0] =0;
                    
                    // 큐에 좌표 하나씩 넣어준다.
                    int[] array = new int[2];
                    array[0] = 0;
                    array[1] = 0;
                    q.offer(array);
                    
                    //큐에서 거낸 cx, cy를 탐색하고 1을 만나면 0으로 바꿈
                    while(!q.isEmpty()){
                        array = q.poll();
                        int cx = array[0];
                        int cy = array[1];
                        
                        //4방 탐색
                        for(int i=0; i<4; i++){
                            // 값을 벗어나면 다음 꺼 부터
                            if(cx + dx[i] < 0 || cy +dy[i] < 0 || cx + dx[i] >= N || cy + dy[i] >= M)
                                continue;
                            if(maps[cx + dx[i]][cy+dy[i]] == 1){
                                maps[cx+dx[i]][cy+dy[i]] = 0;
                                
                                // 0으로 바꿧으면 새로운 값을 선언을 해줘야한다.
                                array = new int[2];
                                array[0] =  cx + dx[i];
                                array[1] =  cy + dy[i];
                               
                                q.offer(array);
                                //좌표 만금 이동값을 늘려준다,
								dist[array[0]][array[1]] = dist[cx][cy] + 1;
                            }
            
            }
        }
        
        if(dist[N - 1][M - 1] == 0 ){
            return -1;
        }else{
        return dist[N - 1][M - 1] + 1;    
        }
        
        
    }
}