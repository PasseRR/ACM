package codeforces.AC;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class A118 {
	private static List<Character> vowels = new ArrayList<Character>();
	static{
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('y');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		vowels.add('Y');
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String data = s.next();
		StringBuilder sb = new StringBuilder();
		for(int i = 0, len = data.length(); i < len; ++i){
			Character ch = data.charAt(i);
			if(!vowels.contains(ch)){
				sb.append(".");
				if(Character.isUpperCase(ch)){
					sb.append(Character.toLowerCase(ch));
				}else{
					sb.append(ch);
				}
			}
		}
		System.out.println(sb.toString());
	}
}
