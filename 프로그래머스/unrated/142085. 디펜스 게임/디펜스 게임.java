import java.util.*;
import java.io.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        // 병사의 수 n
        // 무적권 k
        int r = enemy.length; // 라운드수
        Queue<Integer> pq =  new PriorityQueue<>(Collections.reverseOrder());
        
        int round = r;
        
        // 처음 병사로 밀고 나가다가 0이 되면 
        for(int i =0; i<r; i++){
            n -= enemy[i];
            pq.add(enemy[i]);
        
        if(n <0){
            if(k > 0 && !pq.isEmpty()){
                n += pq.poll();
                k--;
            }else{
                round = i;
                break;
            }
        }
        }
        
        // 지나온 라운드 중 가장 큰 값에 무적권을 사용하고
        // 병사 수를 리필을 한다.
        
        
        
        
        
        return round;
    }
}