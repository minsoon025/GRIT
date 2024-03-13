import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int W = sc.nextInt();
        int H = sc.nextInt();
        
        int N = sc.nextInt() +1;
        int M = sc.nextInt() +1;

        int a,b;

        if(W % N > 0){
         a = W/N + 1;
            }
        else{
        a = W/N;
        }


        if(H % M > 0){
        b = H/M + 1;
            }
        else{
        b = H/M;
        }

        System.out.println(a*b);

    }
}