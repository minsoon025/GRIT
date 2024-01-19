import java.util.*;

public class Main {
        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    int x = sc.nextInt();
    int y = sc.nextInt();

    // x 가 0 보다 큭경우 , 1,4
    if(x > 0 ){
    // y가 0 보다 작은 경우
    if(y>0){
     System.out.println(1);
    }
    if(y<0){
        System.out.println(4);
    }
    }
    // x<0 인 경우2, 3
else{
    if(y>0){
        System.out.println(2);
    }else{
        System.out.println(3);
    }
}	
} 
}