
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 숫자 담기
		Stack<String> stack = new Stack<>();
		// 연산자 스택
		Stack<String> stack2 = new Stack<>();	
		// 후위 표기식 계산
		Stack<Integer> stack3 = new Stack<>();	


		
		//10개의 테스트 케이스
		for(int  i= 0; i<10; i++) {
			
			//문자열 계산식의 길이
			int numlong =sc.nextInt();  
			// 표현식을 그대로 받아와서 리스트 안에 넣어준다.			
			String str = sc.next();
 
			// 값을 그대로 입력받아 중위표기법을 만들고
			String[] firstarr = str.split("");
			String[] endarr = new String[numlong];
		
			int cnt =0;
			// 스택을 사용해 후위표기법을 만든다.
			for(int j=0; j<numlong; j++) {
				//+인경우
				if(firstarr[j].equals("+")) {
					// 스택이 비었으면
					if(stack2.isEmpty()) {
						// 현재 연산자를 push
					 stack2.push(firstarr[j]);
					}
					else{ // 그렇지 않으면 연산자 추가
						endarr[cnt++] = firstarr[j];
									}
					}
				// +가 아닌 숫자인 경우 새로운 어레이에 값을 넣어준다. 
				else {
					endarr[cnt++] = firstarr[j]; 
				}
			}
			//남은 값들 정리
			for(int k= cnt; k<numlong; k++) {
				endarr[k] = stack2.pop();
			}
			
			//후위 표기법까진 잘 나온다.
			// stack 에 후위 표기법이 생성되었고 하나씩 빼가면서 값을 추출
			for(int k=0; k<numlong; k++) {
				// 값을 넣지 못하기에 형 변환
				char c = endarr[k].charAt(0);
				// +값을 만난다면 두개 값을 빼서 더하고 넣는다. 
				if(endarr[k].equals("+")) {
					int a = stack3.pop();
					int b = stack3.pop();
					stack3.push(a+b);
									}
				else {//숫자인 경우 스택에 그냥 넣어준다.
					// 우리가 계산할 숫자로 변형
					stack3.push((int)c-'0');
					}
			//남아있는 값 출력
			}System.out.println("#" +(i+1) +" " +stack3.pop());
		
		
		
		
		
		
		
	}}}

