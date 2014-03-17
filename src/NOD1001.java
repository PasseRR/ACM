import java.util.Arrays;
import java.util.Scanner;


public class NOD1001 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int K;
		int N;
		K = s.nextInt();
		N = s.nextInt();
		int []num = new int[N];
		for(int i = 0; i < N; ++i){
			num[i] = s.nextInt();
		}
		Arrays.sort(num);
		boolean flg = false;
		for(int i = 0; i < N; ++i){
			for(int j = i+1; j < N; ++j){
				if(num[i] + num[j] == K){
					flg = true;
					System.out.println(num[i] + " " + num[j]);
				}
			}
		}
		if(!flg){
			System.out.println("No Solution");
		}
	}
}
