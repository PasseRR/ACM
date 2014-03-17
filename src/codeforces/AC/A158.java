package codeforces.AC;
import java.util.Scanner;


public class A158 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int []num = new int[n];
		int sum = 0;
		for(int i = 0; i < n; ++i){
			num[i] = s.nextInt();
		}
		for(int i = 0; i < n; ++i){
			if(num[i] >= num[k-1] && num[i] > 0){
				sum ++;
			}
		}
		System.out.println(sum);
	}
}
