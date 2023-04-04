import java.util.Scanner;

public class Main {
	static int A,B,C;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		
		System.out.println(pow(A,B,C));
	}
	
	static long pow(int a, int b, int c) {
		if(b ==0)
			return 1;
		
		long n = pow(a, b/2, c);
		
		if(b % 2 ==0)
			return n*n % c;
		else
			return (n*n % c) * a % c;
	}
}