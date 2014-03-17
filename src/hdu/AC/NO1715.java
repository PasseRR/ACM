package hdu.AC;
import java.math.BigInteger;
import java.util.Scanner;
public class NO1715 {
	public static void main(String[] args) {
		int n;
		Scanner sc =  new Scanner(System.in);
		while(sc.hasNext()){
			n = sc.nextInt();
			int []Pi = new int[n];
			for(int i = 0; i < n; ++i){
				Pi[i] = sc.nextInt();
			}
			for(int num:Pi){
				System.out.println(getFibonacciNum(num).toString());
			}
		}
	}
	
	//获得大数的Fibonacci数
	public static BigInteger getFibonacciNum(int n){
		if(n == 1 || n == 2){
			return new BigInteger("1");
		}
		BigInteger begin = new BigInteger("1");
		BigInteger afterBegin = new BigInteger("1");
		BigInteger sum = new BigInteger("1");
		for(int i = 3; i <= n; ++i){
			sum = begin.add(afterBegin);
			begin = afterBegin;
			afterBegin = sum;			
		}
		
		return sum;
	}
}
