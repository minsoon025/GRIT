import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//문자열을 입력 받음
		String str = sc.nextLine();
		
		//9를 6으로 교체
		str = str.replace('9', '6');
		
		//0~8까지 9개의 int배열을 만듬
		int[] intArr = new int[9];
		
		//최대 갯수를 저장할 int형 변수 선언 및 초기화
		int max = 0;
		
		//숫자에 해당하는 배열 인덱스의 값을 ++함
		for(int i = 0; i < str.length() ; i++) {
			int num = (int)(str.charAt(i)-48);
			intArr[num]++;
		}
		
		//6의 경우 9를 포함하므로 2로 나누고, 반올림을 하여 인덱스 6의 값을 바꿈
		if(intArr[6]!=0)
			intArr[6]=Math.round(intArr[6]/2.0f);
		
		//int배열을 탐색하면서 최대값을 구함
		for(int i = 0; i < intArr.length; i++) {
			max = Math.max(intArr[i], max);
		}

		//최댓값을 출력
		System.out.println(max);
    }
}