package codeforces.AC;
import java.util.Scanner;


public class A110 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String num = s.next();
		int count = 0;
		for(int i = 0, len = num.length(); i < len; ++i){
			if('4' == num.charAt(i) || '7' == num.charAt(i)){
				count ++;
			}
		}
		System.out.println(4 == count || 7 == count ? "YES" : "NO");
	}
}
