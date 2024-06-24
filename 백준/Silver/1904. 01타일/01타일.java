import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

		if (a == 1) {
            System.out.println(1);
		} 
 
		else if (a == 2) {
			System.out.println(2);
		}else{
         
		// 초기 값 
		int val1 = 1;
		int val2 = 2;
		int sum = 0;
         
		for (int i = 2; i < a; i++) {
			sum = (val2 + val1) % 15746;	// 이전 값과 이전의 이전 값의 합 
			val1 = val2;	// 이전의 이전 값은 이전 값으로 변경 
			val2 = sum;		// 이전 값은 현재 합 값으로 변경 
		}
 
            System.out.println(sum); 
	}}
  
    
}