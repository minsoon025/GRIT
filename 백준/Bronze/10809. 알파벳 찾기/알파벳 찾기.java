
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 단어 자르기
		String word = sc.nextLine();

		//출력해야 할 값
		int[] arr1 = new int[26];
		
		
		//char 안에 값을 모두 -1로 바꾼다.
		for(int i =0; i<26; i++) {
			arr1[i] = -1 ;
			}
		
		
		
		// 알파벳과 같으면 그 알파벳 맛큼 값을 추가해준다.
		// 처음 등장하는 위치를 값에 입력해야한다.
		// 먼저 b가 나왓다.
		for(int j =0; j<word.length(); j++) { // 첫번째 알파벳
			// 값을 char 형태로 바꿔준다.
			char ch = word.charAt(j);
			//ch -'a'로 알파벳 값을 자리수의 값으로 바꿈
			if(arr1[ch - 'a'] == -1){
				arr1[ch - 'a'] = j;
				
			}
			
		}
		for(int i =0; i<26; i++ ) {
			System.out.print(arr1[i] + " ");
		}

		
		
		
	}

}
