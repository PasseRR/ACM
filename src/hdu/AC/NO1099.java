package hdu.AC;
import java.util.Scanner;


public class NO1099 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			int num;
			num = s.nextInt();
			long sup = 0;//����
			long sub = 0;//��ĸ
			for(int i = 1; i <= num; ++i){
				if(sub == 0){
					sub = 1;
					sup = num;
				}else{
					long temp = sub;
					sub *= i;
					sup = sup*i + num*temp;//�����������
				}
				long g = gcd(sub, sup);//������Ӻͷ�ĸ������Լ
				if(g != 1){
					sub /= g;
					sup /= g;
				}
			}
			if(sup%sub == 0){//���Ϊ����
				System.out.println(sup/sub);
			}else{
				long zheng = (long) sup/sub;//��������
				long supLeft = sup-zheng*sub;//��ȥ�������ֵķ���
				long g = gcd(sub, supLeft);//���ӷ�ĸ�����Լ��
				int zhengLong = String.valueOf(zheng).length();//��������
				if(g != 1){
					sub /= g;
					supLeft /= g;
				}
				int fenLong = String.valueOf(sub).length();//��ĸ����
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
