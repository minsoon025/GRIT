import java.util.Scanner;

public class Main {
	//입력배열을 오름 차순으로 만들기 위해서
	// arr[i-1] < arr[i] 오른쪽에서 왼쪽으로 탐색하면서 나온 값들을 본다
	// 이제 i-1을 비교하면서 arr[i-1] < arr[j] 를 만족하는 값을 찾고
	// swap 응 해주고
	// 지금까지 스왑한 값들을  reverse 해준다.
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int N = sc.nextInt();
		  int[] arr = new int[N];
		  // 어레이의 갯수와, 어레리의 값을 받아온다,
		  for(int i =0; i<N; i++) {
			  arr[i] = sc.nextInt();
		  }
		  // 값을 처름 받아온다.
		  if(nextPermuttion(arr)) {
		  for(int i =0; i< N; i++) {
			  System.out.print(arr[i] + " ");
		  }}else System.out.println(-1);
		
		
		
	}
	// permutation을 해줄 값들을 본다.
	private static boolean nextPermuttion(int[] arr) {
		// 뒤에서 즉 오른쪽에서 왼쪽으로 값을 이동하면서 값들을 찾아준다,
		int N  = arr.length;
		
		// 오른쪽에서 부터 내려오는 값들을 확인, 마지막 줄여주기
		int originIdx = N-2;
		
		// 뒤에 숫자가 큰 경우 기준이된다
		while(originIdx >= 0 && arr[originIdx] >= arr[originIdx+1]) --originIdx;
		
		// 특정 값까지 왔는데 기준이 없다.
		// 내림차순으로 순열이 정리된 경우
		// 기존 인덱스가 -1 이면 다음 순열도 없는 경우 종료 끝
		if(originIdx  == -1) return false;
		
		// 타겟 값들 을 찾는다
		int target = N -1;
		
		//타겟이 측정 값을 지나지 않고 가능한 값을 확인해야한다.
		while(arr[target] <= arr[originIdx]) target--;
		
		//값을 찾으면 교환을 해준다.
		swap(arr, originIdx, target);
		
		// 맨 뒤랑 그 전까지 값들을 오륾 차순으로 바꿔준다.
		int  k = N -1;
		int i = originIdx + 1;
		
		// 올바른 기준과 올바른 타켓을 교환 
		while(i<k) { 
			swap(arr, i++, k--);
		}return true;
		
	}

	// swap를 해줄 값들을 만들어 줘야한다.
	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] =  arr[b];
		arr[b] =  temp;
		
	}
	
	
}