import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		double new_sum = 0;
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		double newnew = 0 ;
		double new_point =0;
		double avg = 0;
		
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			num = sc.nextInt();
			list.add(num);
		}

			list.sort(null);
			// 제일 큰 수
			double high = list.get(T - 1);
			// 새로운 점수
			for(int i = 0; i < T; i++) {
			new_point = (list.get(i)/high) * 100;
			newnew = new_point + newnew;
			}
			
			avg = (newnew)  / T;  
			
			System.out.println(avg);
	} 
}

