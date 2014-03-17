package codeforces.AC;
import java.util.Scanner;


public class A112 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String strA = s.next().toUpperCase();
		String strB = s.next().toUpperCase();
		System.out.println(strA.compareTo(strB) == 0 ? 0 : (strA.compareTo(strB) > 0 ? 1 : -1));
	}
}
