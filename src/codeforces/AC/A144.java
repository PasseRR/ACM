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
			if(temp > max){//记录最大值,只需记录第一个出现的最大值
				max = temp;
				maxIndex = i;
			}
			if(temp <= min){//记录最后一个出现的最小值
				min = temp;
				minIndex = i;
			}
		}
		if(maxIndex > minIndex){//如果最大值在最小值右边,最大值和最小值向两头移动,直到相邻
			boolean flg = true;
			while(true){
				if(maxIndex-1 == minIndex){//如果最大值和最小值相邻,交换两个的位置用1s
					second ++;
					maxIndex --;
					minIndex ++;
					break;
				}
				if(flg){//最大值和最小值分别向两头移动,每次1s,只能最大值移动或最小值移动
					maxIndex --;
					flg = false;
				}else{
					minIndex ++;
					flg = true;
				}
				second ++;
			}
		}
		if(maxIndex < minIndex){//如果最大值在最小值左边,分别移动最大值和最小值
			second += maxIndex;
			second += (num-1-minIndex);
		}
		System.out.println(second);
	}
}
