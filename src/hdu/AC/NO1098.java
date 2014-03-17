package hdu.AC;
import java.util.Scanner;


public class NO1098 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			int k = s.nextInt();
			boolean flg = true;
			for(int i = 0; i <= k; ++i){
				if(((18+k*i)%65) == 0){
					System.out.println(i);
					flg = false;
				}
			}
			if(flg){
				System.out.println("no");
			}
		}
	}
}
