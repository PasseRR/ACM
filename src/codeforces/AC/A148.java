package codeforces.AC;
import java.util.Scanner;


public class A148 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int l = s.nextInt();
		int m = s.nextInt();
		int n = s.nextInt();
		int d = s.nextInt();
		int sum = 0;
		for(int i = 1; i <= d; ++i){
			if(0 == i%k
			  || 0 == i%l
			  || 0 == i%m
			  || 0 == i%n){
				sum ++;
			}
		}
		System.out.println(sum);
	}
}
