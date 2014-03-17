package hdu.AC;
import java.util.Scanner;


public class NO3787 {
	public static void main(String[] args) {
		String A;
		String B;
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			A = s.next();
			B = s.next();
			int a = Integer.valueOf(A.replaceAll(",", ""));
			int b = Integer.valueOf(B.replaceAll(",", "")); 
			System.out.println(a+b);
		}
	}
}
