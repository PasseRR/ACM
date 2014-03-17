package codeforces.AC;
import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long m = s.nextLong();
		long a = s.nextLong();
		long sum = (n%a == 0 ? n/a : (n/a)+1)*(m%a == 0 ? m/a : (m/a)+1);
		System.out.println(sum);
	}
}
