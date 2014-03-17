package hdu.AC;
import java.util.Scanner;

public class NO1720 {
	public static void main(String[] args) {
		String a;
		String b;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int numA;
			int numB;
			a = sc.next();
			b = sc.next();
			numA = Integer.parseInt(a, 16);
			numB = Integer.parseInt(b, 16);
			System.out.println(numA+numB);
		}
	}
}
