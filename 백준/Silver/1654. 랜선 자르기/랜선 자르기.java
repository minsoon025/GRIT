import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//잘려지는 갯수를 카운트 해줘야한다.
		int K = sc.nextInt();
		int N = sc.nextInt();
		
		int[] arr = new int[K];
		
		long max =0;
		
		// 입력 하면서 랜선의 길이가 최대값인지를 확인하고 max 갱신
		for(int i =0; i<K; i++) {
			arr[i] = sc.nextInt();
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		max++;
		
		long min =0;
		long mid =0;
		
		while(min< max) {
			mid = (max+min)/2;
			
			long cnt = 0;
			//몇개가 만들어지나
			for(int i = 0; i<arr.length; i++) {
				cnt +=(arr[i]/mid);
			}
			
			if(cnt <N) {
				max = mid;
			}else {
				min = mid +1;
			}
			
		}
		System.out.println(min-1);
		
	}

}