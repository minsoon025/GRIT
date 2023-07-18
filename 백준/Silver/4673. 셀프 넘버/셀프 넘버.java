public class Main {
	public static void main(String[] args) {

		boolean[] check = new boolean[10001];
		for (int i = 1; i < 10001; i++) {
			int num = i;
			int sum = i;
			while (num != 0) {
				sum = sum + (num % 10);
				num = num / 10;
			}
			if (sum < 10001) {
				check[sum] = true;
				//System.out.println(sum);
			}

		}
		for (int i = 1; i <= 10000; i++) {
			if (!check[i]) {
				System.out.println(i);
			}
		}
	}
}