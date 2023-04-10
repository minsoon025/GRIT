import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int N = sc.nextInt();
	int K = sc.nextInt();
	
	int b = Math.abs(N-K);
	
	System.out.println(fact(N)/fact(K)/fact(b));
	
	}
	
	static int fact(int n ) {
		if(n == 0) {
			return 1;
		}else {
			return fact(n-1)*n;
		}
		
	}
	

}