import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        int N = phone_book.length;
        String[] arr = phone_book;
        
        Arrays.sort(arr);
        
        for(int i = 0; i < N - 1; i++) {
            String num = arr[i];
            String nextNum = arr[i + 1];
            // 현재 번호가 다음 번호의 접두어인지 확인
            if (nextNum.startsWith(num)) {
                return false;
            }
        }
        
        return true;
    }
}
