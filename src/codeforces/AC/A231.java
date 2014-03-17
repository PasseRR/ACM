package codeforces.AC;
import java.util.Scanner;


public class A231 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		int num = s.nextInt();
		for(int i = 0; i < num; ++i){
			int sum = 0;
			int Petya = s.nextInt();
			int Vasya = s.nextInt();
			int Tonya = s.nextInt();
			if(1 == Petya){
				sum ++;
			}
			if(1 == Vasya){
				sum ++;
			}
			if(1 == Tonya){
				sum ++;
			}
			if(sum > 1){
				count ++;
			}
		}
		System.out.println(count);
	}
}
