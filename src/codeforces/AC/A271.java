package codeforces.AC;
import java.util.Scanner;


public class A271 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int y = s.nextInt();
		for(int i = y+1; i <= 9012; ++i){
			String year = String.valueOf(i);
			boolean flg = true;
			for(int j = 0, len = year.length(); j < len && flg; ++j){
				for(int k = j+1; k < len && flg; ++k){
					if(year.charAt(j) == year.charAt(k)){
						flg = false;
					}
				}
			}
			if(flg){
				System.out.println(i);
				break;
			}
		}
	}
}
