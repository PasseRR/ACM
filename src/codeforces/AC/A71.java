package codeforces.AC;
import java.util.Scanner;


public class A71 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i = 0; i < num; ++i){
			String word = s.next();
			if(word.length() > 10){
				StringBuilder sb = new StringBuilder();
				sb.append(word.charAt(0));
				sb.append(word.length()-2);
				sb.append(word.charAt(word.length()-1));
				System.out.println(sb.toString());
			}else{
				System.out.println(word);
			}
		}
	}
}
