package hdu.AC;
import java.util.Scanner;

public class NO1408 {
	public static void main(String[] args) {
		/**
		 * 水滴容量（小于5000 ml）
		 */
		double Val;
		/**
		 * 每一滴的容量
		 */
		double D;
		/**
		 * 总时间
		 */
		int sumTime = 0;
		/**
		 * 当前将要滴的滴数
		 */
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			sumTime = 0;
			Val = Double.parseDouble(sc.next());
			D = Double.parseDouble(sc.next());
			//总滴数
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
