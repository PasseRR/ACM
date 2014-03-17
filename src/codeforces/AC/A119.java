package codeforces.AC;
import java.util.Scanner;


public class A119 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int n = s.nextInt();
		while(true){
			n -= gcd(a, n);//Simon 
			if(n < 0){//石头拿完后小于0,则输
				System.out.println("1");
				break;
			}
			n -= gcd(b, n);//Antisimon 
			if(n < 0){
				System.out.println("0");
				break;
			}
		}
	}
	
	public static int gcd(int a, int b){
		if(a == 0){
			return b;
		}else if(b == 0){
			return a;
		}
		return a%b == 0 ? b : gcd(b, a%b);
	}
}
