package codeforces.AC;
import java.util.Scanner;


public class A82 {
	private static String []people = {
		"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"
		};
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		int current = 0;//当前没人喝可乐的瓶数(2^current)
		int position = 0;//当前位置
		boolean flg = true;
		while(flg){
			for(i = 0; i < 5; ++i){
				position += ((int) Math.pow(2, current));
				if(position >= n){
					flg = false;
					break;
				}
			}
			current ++;
		}
		System.out.println(people[i]);
	}
}
