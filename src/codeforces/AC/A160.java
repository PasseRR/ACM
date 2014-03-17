package codeforces.AC;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class A160 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Integer []coins = new Integer[n];
		int sum = 0;
		for(int i = 0; i < n; ++i){
			coins[i] = s.nextInt();
			sum += coins[i];
		}
		Arrays.sort(coins, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int a = o1.intValue();
				int b = o2.intValue();
				return a >= b ? -1 : 1;//a>b·µ»Ø1ÉýÐò,·µ»Ø-1½µÐò
			}
		});
		int pick = 0;
		for(int i = 0; i < n; ++i){
			pick += coins[i];
			if(pick > (sum-pick)){
				System.out.println(i+1);
				break;
			}
		}
	}
}
