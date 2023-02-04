
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main{

	public static int N,M;
	public static HashSet<String> hs=new HashSet<String>();    // 해시리스트 생성
	// tree 셋은 자동정렬까지 해주는데 사용하면 어떨까
	// set은 중복을 자동으로 제거해준다.
	public static ArrayList<String> arr = new ArrayList<String>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," "); // 나누기
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N; i++) {
			//arr1[i]=br.readLine();
			//hs에 하나씩 추가한다.
			hs.add(br.readLine()); 
		}
		//hashset은 중복을 걸러줌으로
		// hs에서 중복이 아닌 것들을 list에 넣음
		for(int i=0; i<M; i++) {
			String s=br.readLine();
			if(hs.contains(s)) {
				arr.add(s);
			}
			
		}
		Collections.sort(arr);  // t순서대로 출력을 위한
		
		System.out.println(arr.size());
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}

	}

}