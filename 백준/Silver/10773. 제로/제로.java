import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> arr = new Stack<>(); 
		//잘못 외치면 0을 사용해서
		// 쓴 수를 지운다.
		// 합을 구하자
		
		int K = sc.nextInt();
		
		for(int  i = 0; i<K; i++) {
			int num = sc.nextInt();
			if(num == 0) {
				arr.pop();
			}else {
				arr.add(num);
				}
			
		}
		int sum =0;
		for(int i : arr) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}

}