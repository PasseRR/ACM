package hdu.AC;
import java.util.Scanner;

public class NO1408 {
	public static void main(String[] args) {
		/**
		 * ˮ��������С��5000 ml��
		 */
		double Val;
		/**
		 * ÿһ�ε�����
		 */
		double D;
		/**
		 * ��ʱ��
		 */
		int sumTime = 0;
		/**
		 * ��ǰ��Ҫ�εĵ���
		 */
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			sumTime = 0;
			Val = Double.parseDouble(sc.next());
			D = Double.parseDouble(sc.next());
			//�ܵ���
			int sumNum = (int) Math.ceil(Val/D);
			for(int i = 1;;++i){
				int temp = sumNum-i;
				if(temp <= 0){
					sumTime += sumNum;
					break;
				}
				else{
					sumNum = temp;
					sumTime += (i+1);
				}
			}
			System.out.println(sumTime);
		}		
	}
}
