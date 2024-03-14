import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] dist = new long[N-1];
        long[] price = new long[N]; 

            
        // 거리 입력 
		for(int i = 0; i < N - 1; i++) {
			dist[i] = sc.nextLong();
		}
		
		// 리터당 기름값 입력
		for(int i = 0; i < N; i++) {
			price[i] = sc.nextLong();
		}
        // 가격 더하가
        long total = 0;
        // 최저값이 나오면, 업데이트
        long mini = 9999999;

        for(int i=0; i<N-1; i++){
            if(price[i] < mini) 
                mini = price[i];
                 total += (mini*dist[i]);
            }
            System.out.println(total);
        


    }
}