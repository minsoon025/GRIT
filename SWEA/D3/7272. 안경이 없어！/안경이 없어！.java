import java.util.Scanner;

public class Solution {
	static String Answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc =1; tc<=T; tc++) {
			//테스트 케이스  돌리기
			
			
			String str1 = sc.next();
			String str2 = sc.next();
			
			//각 문자를 나눠서 카운트 하면서 
			// 카운트의 값이 같으면 같은 것이다.
			int left = 0;
            int right = 0;
            Answer = "SAME";
            
            for(int i = 0; i < str1.length(); i++) 
            {
                if(str1.length() != str2.length()) {
                    Answer = "DIFF";
                    break;
                }
                
                // 왼쪽 문자열 숫자 변환
                if(str1.charAt(i) == 'B') {
                    left = 2;
                }else if(str1.charAt(i) == 'A' || str1.charAt(i) == 'D' || str1.charAt(i) == 'P' || str1.charAt(i) == 'Q' 
                        			|| str1.charAt(i) == 'O' || str1.charAt(i) == 'R') {
                    left = 1;
                }else {
                    left = 0;
                }
                
                // 오른쪽 문자열 숫자 변환
                if(str2.charAt(i) == 'B') {
                    right = 2;
                }else if(str2.charAt(i) == 'A' || str2.charAt(i) == 'D' || str2.charAt(i) == 'P' || str2.charAt(i) == 'Q' 
                        			|| str2.charAt(i) == 'O' || str2.charAt(i) == 'R') {
                    right = 1;
                }else {
                    right = 0;
                }
                
                if(left != right) {
                    Answer = "DIFF";
                    break;
                }
            }
            
            System.out.println("#" + tc + " " + Answer);
        }
        
    }

}