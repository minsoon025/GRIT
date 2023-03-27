import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		String str = sc.nextLine();
		if(str.equals("0")) return;
		
		String ans = "";
		String[] arr = str.split("");
		
		if(arr.length == 1) {
			System.out.println("yes");
		}
		else {
		for(int i=0; i<(arr.length/2); i++) {
			if(arr[i].equals(arr[arr.length-1-i])) { 
				ans = "yes";
				
			}else {
				ans = "no";
				break;
			}
		}
		System.out.println(ans);
		}
		}
	}

}