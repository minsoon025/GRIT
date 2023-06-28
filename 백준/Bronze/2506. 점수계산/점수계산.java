import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int total = 0;
		int score = 0;
		
		for(int i=0; i<N; i++) {
			int q = sc.nextInt();
			if(q == 1) {
				score++;
				total += score;
				
			}else {
				score = 0;
			}
		}
		System.out.println(total);
		
	}

}