import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) throws IOException {
    	//인풋할 수 있는 
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        // n과 m의 인트값을 넣는다
        int n = Integer.parseInt(input[0]);  
        int m = Integer.parseInt(input[1]);
        
        
        //map에 두가지 String 칸을 만들어 나눈다.
        //input 0,1 값을 넣어서 저장한다.
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
        	// input 값에 공백을 기준으로 짤라서 넣는다.
            input = br.readLine().split(" ");
            map.put(input[0], input[1]);
        }
        //m만큼의 줄을 검사
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < m; i++) {
        	// String 값을 넣는다. 한줄넘기기 포함해서 해쉬값에 포함안되게하기
        	// 중복된 키값은 삭제
        	//sb값을 map에 하나씩 넣으면서 value 값만 불러 오기
            sb.append(map.get(br.readLine())).append('\n');
        }
        System.out.println(sb.toString());

    }
}

