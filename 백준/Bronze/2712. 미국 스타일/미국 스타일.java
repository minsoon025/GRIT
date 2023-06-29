import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			StringTokenizer st =new StringTokenizer(br.readLine());
			Double val = Double.parseDouble(st.nextToken());
			String tp = st.nextToken();
			if(tp.equals("kg")) {
				System.out.printf("%.04f lb\n", val*2.2046);
			}else if(tp.equals("g")) {
				System.out.printf("%.04f l\n", val*3.7854);
			}else if(tp.equals("l")) {
				System.out.printf("%.04f g\n", val*0.2642);
			}else if(tp.equals("lb")) {
				System.out.printf("%.04f kg\n", val*0.4536);
			}
		}
	}
}