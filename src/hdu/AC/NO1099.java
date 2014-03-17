package hdu.AC;
import java.util.Scanner;


public class NO1099 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			int num;
			num = s.nextInt();
			long sup = 0;//分子
			long sub = 0;//分母
			for(int i = 1; i <= num; ++i){
				if(sub == 0){
					sub = 1;
					sup = num;
				}else{
					long temp = sub;
					sub *= i;
					sup = sup*i + num*temp;//两个分数相加
				}
				long g = gcd(sub, sup);//如果分子和分母可以相约
				if(g != 1){
					sub /= g;
					sup /= g;
				}
			}
			if(sup%sub == 0){//结果为整数
				System.out.println(sup/sub);
			}else{
				long zheng = (long) sup/sub;//整数部分
				long supLeft = sup-zheng*sub;//减去整数部分的分子
				long g = gcd(sub, supLeft);//分子分母的最大公约数
				int zhengLong = String.valueOf(zheng).length();//整数长度
				if(g != 1){
					sub /= g;
					supLeft /= g;
				}
				int fenLong = String.valueOf(sub).length();//分母长度
				for(int i = 0; i < zhengLong+1; ++i){
					System.out.print(" ");
				}
				System.out.println(supLeft);
				System.out.print(zheng + " ");
				for(int i = 0; i < fenLong; ++i){
					System.out.print("-");
				}
				System.out.println();
				for(int i = 0; i < zhengLong+1; ++i){
					System.out.print(" ");
				}
				System.out.println(sub);
			}
		}
	}
	
	public static long gcd(long a, long b){
		return a%b == 0 ? b : gcd(b, a%b);
	}
	
	public static long lcm(long a, long b){
		return a*b / gcd(a, b);
	}
}
