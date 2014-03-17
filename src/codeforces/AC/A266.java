package codeforces.AC;
import java.util.Scanner;


public class A266 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String color = s.next();
		int sum = 0;
		for(int i = 1; i < num; ++i){
			if(color.substring(i-1, i).equals(color.substring(i, i+1))){
				sum ++;
			}
		}
		System.out.println(sum);
	}
}
