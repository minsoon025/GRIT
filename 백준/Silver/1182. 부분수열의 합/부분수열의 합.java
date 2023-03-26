import java.util.Scanner;

public class Main {
	static int N,S, cnt;
	static int[] arr;
	static boolean[] sel;
	
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	N = sc.nextInt();
    	S = sc.nextInt();
    	
    	cnt =0;
    	
    	arr = new int[N];
    	sel = new boolean[N];
    	
    	for(int i = 0; i<N; i++){
    		arr[i] = sc.nextInt();
    	}
    	all(0);
    	if(S == 0) {
    		cnt--;
    		System.out.println(cnt);
    	}else {
    		System.out.println(cnt);
    	}
	}
    
    // 모든 값들을 출력해야한다.
    public static void all(int idx) {
    	if(idx == N) {
    		int sum =0;
    		for(int i =0; i<N; i++) {
    		if(sel[i]) {
    			sum += arr[i];
    		}}
    		if(sum == S) cnt++;
    		
    		return;
    	}
    	
    	sel[idx] = true;
    	all(idx+1);
    	
    	sel[idx] = false;
    	all(idx+1);
    }
}