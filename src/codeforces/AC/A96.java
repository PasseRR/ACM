package codeforces.AC;
import java.util.Scanner;


public class A96 {
	private static final String ONE = "1111111";
	private static final String ZERO = "0000000";
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String team = s.next();
		if(team.contains(ONE) || team.contains(ZERO)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
