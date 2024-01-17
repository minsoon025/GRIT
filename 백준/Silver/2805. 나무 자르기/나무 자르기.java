import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 높이가 H  보다 크면 잘린다
        // 나무의 수 N
        int N  = sc.nextInt();

        // 집에 가져갈 나무 M
        int M  = sc.nextInt();

        int[] tree =  new int[N];

        int min = 0;
        int max = 0;
        
        for(int i =0; i<N; i++){
            tree[i] = sc.nextInt();

            if (max < tree[i]){
            max  = tree[i];
            }   
        }

        // 이분 탐색
        while(min < max){
            // 최대 최소의 중간 값을 저장해둔다
        int mid = (min + max) / 2;
            long sum = 0;
                for(int treehight :tree){
                    // 잘리는 부분만 sum 에 더하기
                if(treehight - mid > 0){
                    sum += (treehight - mid);
                }
                
            }
            // 합이 가져가야 할 길이 보다 작다면
            // mid  + 1을 해주면서 이분 탐색을 해준다.
            if(sum < M){
            max  = mid;    
            }
            else {
                min = mid  + 1;
                
            }
        }
        System.out.println(min -1);
    

        

        
    }
}