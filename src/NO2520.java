import java.math.BigInteger;
import java.util.Scanner;


public class NO2520 {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in); 
		n = s.nextInt();
		int num[] = new int[n];
		for(int i = 0; i < n; ++i){
			num[i] = s.nextInt();
			BigInteger re = new BigInteger("1");
			for(int j = 1; j < num[i]; ++j){
				re = re.add(re.add(new BigInteger("2")));
			}
			System.out.println(re.mod(new BigInteger("10000")));
		}
	}
}
