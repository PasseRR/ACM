package hdu.AC;
import java.util.Scanner;

public class NO1215 {
	public static void main(String[] args) {
		int num;
		int []data = new int[500001];
		for(int i = 1; i <= 500000/2; ++i){
			for(int j = i*2; j <= 500000; j += i){
				data[j] += i;
			}
		}
		data[1] = 0;
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			num = s.nextInt();
			int n;
			for(int i = 0; i < num; ++i){
				n = s.nextInt();			
				System.out.println(data[n]);	
			}
		}
	}
}
