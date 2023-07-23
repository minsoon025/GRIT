class Solution {
    public String solution(String s) {
        String answer = "";
        
        //" "기준으로 나누기
        String[] arr =  s.split(" ");
        // 잘린 문자열을 순서대로 처리
        for(int i=0; i<arr.length; i++){
            String now = arr[i];
            
            // 문자열 길이가 0이면 패스
            // 답에 " "만 추가
            if(arr[i].length() == 0){
                answer += " ";
            }else{
            // 문자가 있으면
    			answer += now.substring(0, 1).toUpperCase();
                answer += now.substring(1, now.length()).toLowerCase();
                answer += " ";

            }
        }
            if(s.substring(s.length()-1, s.length()).equals(" ")){
    		return answer;
    	}
    	
    	// 맨 마지막 " " 제거하고 answer 반환
        return answer.substring(0, answer.length()-1);
    }
}