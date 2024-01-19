import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int ans = 1;

        if(num == 0){
        System.out.println(1);

        }else{
        
        for(int i=1; i<= num; i++){
            ans = ans * i;
        }
        System.out.println(ans);
        }

        
    }
}