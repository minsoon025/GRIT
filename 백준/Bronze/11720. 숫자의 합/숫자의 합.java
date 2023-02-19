

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String T =  sc.nextLine();
		String str = sc.nextLine();
		char[] num = str.toCharArray();
		int sum=0;
		for(int i = 0; i<num.length; i++) {
			sum = (num[i] -'0') + sum ;
		}
		
		System.out.println(sum);
		
		
		
		
		
	}

}
