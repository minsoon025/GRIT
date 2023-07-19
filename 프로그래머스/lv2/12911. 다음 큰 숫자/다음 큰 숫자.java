public class Solution {
    public int solution(int n) {
        // n의 이진수에서 1의 개수를 카운트
        int count = Integer.bitCount(n);
        
        // n을 1씩 증가시키며 다음 큰 숫자 찾기
        int nextNum = n + 1;
        while (Integer.bitCount(nextNum) != count) {
            nextNum++;
        }
        
        return nextNum;
    }
}
