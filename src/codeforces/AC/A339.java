package codeforces.AC;
import java.util.Arrays;
import java.util.Scanner;


public class A339 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String calc = s.next();
		String []num = calc.split("[+]");
		Arrays.sort(num);
		System.out.print(num[0]);
		for(int i = 1; i < num.length; ++i){
			System.out.print("+"+num[i]);
		}
		System.out.println();
	}
}
