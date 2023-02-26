

import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스를 입력한다.
		int T = sc.nextInt();
		for(int tc =0; tc<T; tc++) {
			String str = sc.next();
			
			for(int i =1; i <= str.length(); i++) {
				String a =str.substring(0,i); // i까지 자른 것고ㅓ
				String b =str.substring(i,i+i); // 그 다음까지 자른 것이 같은 경우
				if(a.equals(b)) {
					System.out.println("#"+ (tc+1) + " " + i);
					break;
				}
			}
			
		}
		
		
	}

}
