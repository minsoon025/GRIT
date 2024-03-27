import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] dp = new int[N];

        for(int i =0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        
        dp[0] = arr[0];
        
        for(int i=0; i<N; i++){
            dp[i] = arr[i];
            for(int j=0; j<N; j++){
                // 이전숫자, why? 증가를 확인해야하니까
                if(arr[i] > arr[j])
                    dp[i] = Math.max(dp[j] + arr[i], dp[i]);   
            }
        }
        Arrays.sort(dp);
        System.out.println(dp[N-1]);
    }
}