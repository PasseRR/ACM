package codeforces.AC;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class A236 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String data = s.next();
		Set<Character> set = new HashSet<Character>();
		for(int i = 0, len = data.length(); i < len; ++i){
			set.add(data.charAt(i));
		}
		System.out.println(set.size()%2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
	}
}
