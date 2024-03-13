import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int cnt  =0;
            System.out.print(sc.nextInt() + " ");
            int[] arr = new int[20];
            for(int l=0; l<20; l++){
                arr[l] = sc.nextInt();  
            }
                // System.out.println(Arrays.toString(arr));  
            for(int j=0; j<19; j++){
                for(int k = j+1; k<20; k++){
            // System.out.println(i + " " + j);

                        
                    if(arr[j] >  arr[k]) cnt++;
                }
            }
            System.out.println(cnt);
       }
        
}}