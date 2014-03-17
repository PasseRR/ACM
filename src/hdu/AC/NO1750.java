package hdu.AC;
import java.util.Scanner;
public class NO1750 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);		
		while(sc.hasNext()){
			n = sc.nextInt();
			char []operator = new char[n];
			int []sup = new int[n];
			int []sub = new int[n];
			for(int i = 0; i < n; ++i){
				operator[i] = sc.next().charAt(0);
				sub[i] = sc.nextInt();
				sup[i] = sc.nextInt();				
			}
			for(int i = 0; i < n; ++i){
				if(operator[i] == 'A'){
					System.out.println(getArrangement(sup[i], sub[i]));
				}else{
					System.out.println(getCombination(sup[i], sub[i]));
				}
			}
		}
	}
	
	//获得阶乘的结果
	public static long getFactorial(int n){
		long sum = 1;
		if(n == 1 || n == 0){
			return sum;
		}
		else{
			for(int i = 2; i <= n; ++i){
				sum *= i;
			}
		}
		return sum;
	}
	
	//获得排列的结果
	public static long getArrangement(int sup, int sub){
		return (getFactorial(sub) / getFactorial(sub-sup));
	} 
	
	//获得组合结果
	public static long getCombination(int sup, int sub){
		if(sup > (sub/2)){
			return getCombination(sub-sup, sub);
		}
		long a = getFactorial(sub);
		long b = getFactorial(sup);
		long c = getFactorial(sub-sup);
		return (a/(b*c));
	}
}
