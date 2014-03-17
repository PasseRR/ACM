package codeforces.AC;
import java.util.Scanner;


public class A281 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String data = s.next();
		StringBuilder sb = new StringBuilder();
		sb.append(data.substring(0, 1).toUpperCase());
		sb.append(data.substring(1, data.length()));
		System.out.println(sb.toString());
	}
}
