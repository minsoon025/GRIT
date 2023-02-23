

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	//45분 알람 일찍 선택하기
	Scanner sc = new Scanner(System.in);
	int H = sc.nextInt();
	int M = sc.nextInt();
	
	//M이 45보다 낮으면 60 - 45 + N  = 
	if(M < 45) {
		// h가 0보다 작으면
		if(H == 0) {
			System.out.println(23 + " " + (60-45+M));
		}else {
			System.out.println((H-1) + " "+ (60-45+M));
		}
		//Mdl 45보다 큰 경우
	}else {
		System.out.println(H + " " + (M-45));
	
	}
	
	
	
	
}}
