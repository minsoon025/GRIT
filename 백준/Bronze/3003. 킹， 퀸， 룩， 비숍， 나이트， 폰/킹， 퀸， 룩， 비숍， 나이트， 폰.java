
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc =  new Scanner(System.in);
    	int cnt = sc.nextInt();
    	//1 1 2 2 8
    	int a = 1 - cnt;
    	cnt = sc.nextInt();

    	int b = 1 - cnt;
    	cnt = sc.nextInt();
    	int c = 2 - cnt;
    	cnt = sc.nextInt();
    	int d = 2 - cnt;
    	cnt = sc.nextInt();
    	int f = 2 - cnt;
    	cnt = sc.nextInt();
    	int e = 8 - cnt;
    	
    	System.out.println(  a +" " + b +" " + c+" " + d +" " + f +" "  + e);
    	
 }
    
}