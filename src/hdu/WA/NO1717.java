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
	
	//���Լ��(greatest common divisor,��дΪgcd)
	//��С������(Least Common Multiple,��дΪlcm)
	public static int getGCD(int m, int n){
		if(m%n == 0){
			return n;
		}
		return getGCD(n, m%n);
	}
	
	//û��ѭ�����ֵ�
	public static void noLoopNum(String str){
		double num = Double.parseDouble(str);

		int length = str.length()-2;
		int sup = (int) (num*Math.pow(10, length));
		int sub = (int) Math.pow(10, length);
		int gcd = getGCD(sup, sub);
		
		System.out.println(sup/gcd + "/" + sub/gcd);
	}
	
	//�Ƿ���û��ѭ����С��
	public static boolean isNoLoopNum(String str){
		if(str.indexOf('(') == -1){
			return true;
		}
		
		return false;
	}
	
	//����ѭ��С��,ֻ��ѭ�����ֵ�
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
	
	//�Ƿ�������ѭ��С��,ֻ��ѭ������
	public static boolean isLimitlessLoopNum(String str){
		if(str.charAt(str.indexOf('(')-1) == '.'){
			return true;
		}
		
		return false;
	}
	
	//���޻��ѭ��С��,������С������Ҳ��ѭ������
	public static void limitlessMixLoopNum(String str){
		StringBuffer sb = new StringBuffer();
		//��ѭ������
		String xStr1 = str.substring(str.indexOf('.')+1, str.indexOf('('));
		//ѭ������
		String xStr2 = str.substring(str.indexOf('(')+1, str.indexOf(')'));
		sb.append(xStr1);
		sb.append(xStr2);
		int sup = Integer.parseInt(sb.toString()) - Integer.parseInt(xStr1);
		int sub = (int) ((Math.pow(10, xStr2.length())-1)*Math.pow(10, xStr1.length()));
		//System.out.println("sup=" + sup + ",sub="+sub);
		int gcd = getGCD(sup, sub);
		
		System.out.println(sup/gcd + "/" + sub/gcd);
	}
	
	//�ж��Ƿ������޻��ѭ��С��
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
��    ��0.4747������0.33�������ɷ�����

��1��        0.4747������100=47.4747����   

0.4747������100��0.4747����=47.4747������0.4747����

(100��1)��0.4747����=47

��99��0.4747���� =47 

��ô  0.4747����=47/99



��2�� 0.33������10��3.33����

0.33������10��0.33����=3.33����0.33����

(10-1) ��0.33����=3

��9��0.33����=3

��ô0.33����=3/9=1/3

�ɴ˿ɼ�, ��ѭ��С��������,����С�����ֿ���д�������ķ�������ѭ��С����ѭ��������λ���Ǽ�����ĸ�����ɼ���9��ɵ����������Ǵ�ѭ��С����һ��ѭ������ɵ�����

�ư�0.4777������0.325656�������ɷ�����

��1��0.4777������10=4.777������

0.4777������100=47.77������

�âڣ��ټ���: 

0.4777������90=47��4

����, 0.4777����=43/90



��2��0.325656������100=32.5656������

0.325656������10000=3256.56������

�âڣ��ټ���: 

0.325656������9900=3256.5656������32.5656����

0.325656������9900=3256��32

����, 0.325656����=3224/9900
 */