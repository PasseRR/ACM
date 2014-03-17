package codeforces.AC;
import java.util.Arrays;
import java.util.Scanner;


public class A228 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int []colors = new int[4];
		for(int i = 0; i < 4; ++i){
			colors[i] = s.nextInt();
		}
		Arrays.sort(colors);
		int count = 0;
		for(int i = 0; i < 3; ++i){
			if(colors[i+1] == colors[i]){
				count ++;
			}
		}
		System.out.println(count);
	}
}
