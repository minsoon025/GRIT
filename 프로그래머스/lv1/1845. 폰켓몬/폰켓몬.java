import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        int ans = 0;
        
        HashSet<Integer> arr = new HashSet<>();
        
        for(int i=0; i<=nums.length-1; i++){
            arr.add(nums[i]);
        }
        System.out.println(arr.size());
        
        if(arr.size() > (nums.length/2)){
            return (nums.length/2);
        }else{
            return arr.size();
        }
        
    }
    
}