package codeforces.AC;
import java.util.Scanner;


public class A116 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int current = 0;
		int max = 0;
		for(int i = 0; i < n; ++i){
			int out = s.nextInt();
			int in = s.nextInt();
			current += in - out;
			if(current > max){
				max = current;
			}
		}
		System.out.println(max);
	}
}
