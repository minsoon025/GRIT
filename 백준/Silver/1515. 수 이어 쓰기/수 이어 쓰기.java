import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 숫자의 위치
        int point = 0;
        // 3000까지 오를 숫자
        int num = 0;

        // 이어 붙인 수
        String quiz = sc.nextLine();

        while(point != quiz.length()){
            // if(num >= 3000) break;
            num++;
            String num2 =Integer.toString(num);
            for(int i=0; i<num2.length() && point < quiz.length(); i++){
                if(num2.charAt(i) == quiz.charAt(point))
                        point++;
            }
}
        System.out.println(num);

    }
}