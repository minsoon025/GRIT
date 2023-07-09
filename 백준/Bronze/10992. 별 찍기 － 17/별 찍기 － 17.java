import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("*");
        } else {
            for (int i = 1; i <= num - 1; i++) {
                for (int k = 1; k <= num - i; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
 
                for (int j = 1; j <= (2 * (i - 1)) - 1; j++) {
 
                    System.out.print(" ");
                }
                if (i >= 2) {
                    System.out.print("*");
                }
 
                System.out.println();
            }
            for (int i = 1; i <= 2 * (num) - 1; i++) {
                System.out.print("*");
            }
 
        }
 
    }
 
}