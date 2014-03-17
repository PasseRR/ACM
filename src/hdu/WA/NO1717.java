package hdu.WA;
import java.util.Scanner;
//WA
public class NO1717 {
	public static void main(String[] args) {
		int m;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			m = Integer.parseInt(sc.nextLine());
			String []data = new String[m];
			for(int i = 0; i < m; ++i){
				data[i] = sc.nextLine();
			}
			for(int i = 0; i < m; ++i){
				if(isNoLoopNum(data[i])){
					noLoopNum(data[i]);	
				}else if(isLimitlessLoopNum(data[i])){
					limitlessLoopNum(data[i]);
				}else if(isLimitlessMixLoopNum(data[i])){
					limitlessMixLoopNum(data[i]);
				}
			}
		}
	}
	
	//最大公约数(greatest common divisor,简写为gcd)
	//最小公倍数(Least Common Multiple,简写为lcm)
	public static int getGCD(int m, int n){
		if(m%n == 0){
			return n;
		}
		return getGCD(n, m%n);
	}
	
	//没有循环部分的
	public static void noLoopNum(String str){
		double num = Double.parseDouble(str);

		int length = str.length()-2;
		int sup = (int) (num*Math.pow(10, length));
		int sub = (int) Math.pow(10, length);
		int gcd = getGCD(sup, sub);
		
		System.out.println(sup/gcd + "/" + sub/gcd);
	}
	
	//是否是没有循环的小数
	public static boolean isNoLoopNum(String str){
		if(str.indexOf('(') == -1){
			return true;
		}
		
		return false;
	}
	
	//无限循环小数,只有循环部分的
	public static void limitlessLoopNum(String str){
		int beginLoop = str.indexOf('(');
		int endLoop	 = str.indexOf(')');
		int length = endLoop - 1 - beginLoop;
		String numStr = str.substring(beginLoop+1, endLoop);
		int num = Integer.parseInt(numStr);
		int sup = num;
		int sub = (int) (Math.pow(10, length))-1;
		int gcd = getGCD(sup, sub);
		
		System.out.println(sup/gcd + "/" + sub/gcd);
	}
	
	//是否是无限循环小数,只有循环部分
	public static boolean isLimitlessLoopNum(String str){
		if(str.charAt(str.indexOf('(')-1) == '.'){
			return true;
		}
		
		return false;
	}
	
	//无限混合循环小数,即既有小数部分也有循环部分
	public static void limitlessMixLoopNum(String str){
		StringBuffer sb = new StringBuffer();
		//不循环部分
		String xStr1 = str.substring(str.indexOf('.')+1, str.indexOf('('));
		//循环部分
		String xStr2 = str.substring(str.indexOf('(')+1, str.indexOf(')'));
		sb.append(xStr1);
		sb.append(xStr2);
		int sup = Integer.parseInt(sb.toString()) - Integer.parseInt(xStr1);
		int sub = (int) ((Math.pow(10, xStr2.length())-1)*Math.pow(10, xStr1.length()));
		//System.out.println("sup=" + sup + ",sub="+sub);
		int gcd = getGCD(sup, sub);
		
		System.out.println(sup/gcd + "/" + sub/gcd);
	}
	
	//判断是否是无限混合循环小数
	public static boolean isLimitlessMixLoopNum(String str){
		if(str.indexOf('(') != -1){
			if(str.charAt(str.indexOf('(')-1) != '.'){
				return true;
			}
		}
		
		return false;
	}
}
/**
⑴    把0.4747……和0.33……化成分数。

想1：        0.4747……×100=47.4747……   

0.4747……×100－0.4747……=47.4747……－0.4747……

(100－1)×0.4747……=47

即99×0.4747…… =47 

那么  0.4747……=47/99



想2： 0.33……×10＝3.33……

0.33……×10－0.33……=3.33…－0.33……

(10-1) ×0.33……=3

即9×0.33……=3

那么0.33……=3/9=1/3

由此可见, 纯循环小数化分数,它的小数部分可以写成这样的分数：纯循环小数的循环节最少位数是几，分母就是由几个9组成的数；分子是纯循环小数中一个循环节组成的数。

⑵把0.4777……和0.325656……化成分数。

想1：0.4777……×10=4.777……①

0.4777……×100=47.77……②

用②－①即得: 

0.4777……×90=47－4

所以, 0.4777……=43/90



想2：0.325656……×100=32.5656……①

0.325656……×10000=3256.56……②

用②－①即得: 

0.325656……×9900=3256.5656……－32.5656……

0.325656……×9900=3256－32

所以, 0.325656……=3224/9900
 */