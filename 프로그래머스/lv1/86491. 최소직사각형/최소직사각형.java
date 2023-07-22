import java.util.*;

class Solution {
    public int solution(int[][] sizes) {

        System.out.println(sizes.length);
        
        int a = 0;
        int b = 0;
        
        
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
            a= Math.max(sizes[i][1], a);
            b= Math.max(sizes[i][0], b);
                
                
            }else{
            a= Math.max(sizes[i][0], a);
            b= Math.max(sizes[i][1], b);
                
            }
 
        }
        
        return a*b;
    }
}