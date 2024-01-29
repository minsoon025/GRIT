import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
        StringTokenizer st = new StringTokenizer(br.readLine());		
        int n=Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());		
        int [][] map = new int[n][m];
        int [][] ans=new int[n][m];
		int sx=0;
        int sy=0;

        		for(int i=0;i<n;i++) {			
                    st=new StringTokenizer(br.readLine());			
                    for(int j=0;j<m;j++) {				
                        map[i][j]=Integer.parseInt(st.nextToken());				
                        if(map[i][j]==2) {	// 입력이 2이면 도착위치지만 BFS에서는 시작위치로 만드는 것이 편함					
                            sx=i;					
                            sy=j;				
                        }				
                        else if(map[i][j]==0)	// 원래 벽이 있는 위치면 0으로 출력한다					
                            ans[i][j]=0;				
                // 아무것도 아니면 원래 갈 수 잇는 위치이기에 기본 출력 값을 -1로 설정					
                        else			
                            ans[i][j]=-1;			
                    }			
                }
        Queue<int []> q = new LinkedList<int[]>();
        int []dx = {-1,1,0,0};
        int []dy = {0,0,1,-1};
        q.add(new int[] {sx, sy , 0});
        while(q.size()>0){
            int [] cur = q.poll();
            int x = cur[0], y=cur[1], v=cur[2];

        for(int i=0; i<4; i++){
        if(x+dx[i]<0 || x+dx[i]>=n || y+dy[i]<0 || y+dy[i]>=m)
            continue;
                if(map[x + dx[i]][y+dy[i]] == 1 && ans[x+dx[i]][y+dy[i]]==-1){
                    q.add(new int[]{x+dx[i], y+dy[i], v+1});
                    ans[x+dx[i]][y+dy[i]] = v+1;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
                bw.write(ans[i][j] + " ");
            bw.write("\n");
        }
        bw.close();
    }
}