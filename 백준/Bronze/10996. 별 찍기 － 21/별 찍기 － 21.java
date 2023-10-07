import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1; i<= 2*N; i++) {
			
			//홀수 행
			if(i %2 == 1) {
				for(int j=1; j<=N; j++) {
					if(j %2 == 1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			// 짝수
			else {
				for(int j =1; j<=N; j++) {
					if(j %2 ==1) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
			
		}
		
	}	
}