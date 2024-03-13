import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        while(true){
                int[] arr = new int[3];
                for(int i=0; i<3; i++){
                arr[i] = sc.nextInt();
                }
                Arrays.sort(arr); //작은 수부터 큰 수로 정렬
                // System.out.println(Arrays.toString(arr));
                if(arr[1] == 0 && arr[0] == 0 && arr[2] == 0) break;
                // 삼각형이 아닌경우
                if(arr[2] >= (arr[1] + arr[0])){
                    System.out.println("Invalid");
                }else{
                    if(arr[0] == arr[1] && arr[1] == arr[2]){
                    System.out.println("Equilateral");
                    }else if((arr[0] == arr[1]) || (arr[1] == arr[2]) || (arr[2] == arr[0])){
                    System.out.println("Isosceles");
                    }else if((arr[0] != arr[1]) && (arr[1] != arr[2]) && (arr[2] != arr[0])){
                    System.out.println("Scalene");
            }
        }}
}}