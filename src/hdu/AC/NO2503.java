package hdu.AC;
import java.util.Scanner;

public class NO2503 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while(sc.hasNext()){
			num = sc.nextInt();
			int []supA = new int[num];
			int []subA = new int[num];
			int []supB = new int[num];
			int []subB = new int[num];
			for(int i = 0; i < num; ++i){
				supA[i] = sc.nextInt();
				subA[i] = sc.nextInt();
				supB[i] = sc.nextInt();
				subB[i] = sc.nextInt();
			}
			for(int i = 0; i < num; ++i){
				getResult(supA[i], subA[i], supB[i], subB[i]);
			}
		}
	}
	
	//gcd
	public static int getGCD(int m, int n){
		if(m%n == 0){
			return n;
		}
		
		return getGCD(n, m%n);
	}
	
	//lcm
	public static int getLCM(int m, int n){
		return m*n/getGCD(m,n);
	}
	
	//result
	public static void getResult(int supA, int subA, int supB, int subB){
		int sub = getLCM(subA, subB);
		int sup = sub/subA*supA + sub/subB*supB;
		
		int temp = getGCD(sub, sup);
		System.out.println(sup/temp + " " + sub/temp);
	}
}
