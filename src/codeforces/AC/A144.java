package codeforces.AC;
import java.util.Scanner;


public class A144 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int []a = new int[num];
		int min = 101;
		int minIndex = -1;
		int max = -1;
		int maxIndex = -1;
		int second = 0;
		for(int i = 0; i < num; ++i){
			int temp = s.nextInt();
			a[i] = temp;
			if(temp > max){//��¼���ֵ,ֻ���¼��һ�����ֵ����ֵ
				max = temp;
				maxIndex = i;
			}
			if(temp <= min){//��¼���һ�����ֵ���Сֵ
				min = temp;
				minIndex = i;
			}
		}
		if(maxIndex > minIndex){//������ֵ����Сֵ�ұ�,���ֵ����Сֵ����ͷ�ƶ�,ֱ������
			boolean flg = true;
			while(true){
				if(maxIndex-1 == minIndex){//������ֵ����Сֵ����,����������λ����1s
					second ++;
					maxIndex --;
					minIndex ++;
					break;
				}
				if(flg){//���ֵ����Сֵ�ֱ�����ͷ�ƶ�,ÿ��1s,ֻ�����ֵ�ƶ�����Сֵ�ƶ�
					maxIndex --;
					flg = false;
				}else{
					minIndex ++;
					flg = true;
				}
				second ++;
			}
		}
		if(maxIndex < minIndex){//������ֵ����Сֵ���,�ֱ��ƶ����ֵ����Сֵ
			second += maxIndex;
			second += (num-1-minIndex);
		}
		System.out.println(second);
	}
}
