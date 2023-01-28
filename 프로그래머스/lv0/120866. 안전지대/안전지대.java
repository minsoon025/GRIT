class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[] dx = {-1,-1,0,1,1,1,0,-1};
        int[] dy = {0,1,1,1,0,-1,-1,-1};
        // 8방을 알아가기 위한 델타값

        for (int i = 0; i< board.length; i++){ //모든 배열에서 탐색
            for (int j = 0; j < board[0].length; j++) { 
                if (board[i][j] == 1){  // 값이 1인 경우
                    for (int k = 0; k < dx.length; k++) { 
                        int nx = i + dx[k]; // 임시 값들을 통해 8방 들리기
                        int ny = j + dy[k];

                        if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length && board[nx][ny] == 0){ // 범위를 정해 그 부분만 탐색
                            board[nx][ny] = -1; // 1인 부
                        }
                    }
                }
            }
        }
        //바뀐 값들을 보고 0 이면 한칸씩 카운트
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) { 
                if (board[i][j] == 0){
                    answer++;
                }
            }
        }
        return answer;
    }
}