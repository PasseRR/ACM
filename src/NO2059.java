import java.util.Scanner;


public class NO2059 {
	public static void main(String[] args) {
		int L;//赛道长度
		int N;//充电站个数
		int C;//充满电能行驶的距离
		int T;//充电所需要的时间
		int VR;//兔子跑步速度
		int VT1;//乌龟开车速度
		int VT2;//乌龟骑车速度
		int []P;//充电站距离起点距离
		Scanner s = new Scanner(System.in);
		L = s.nextInt();
		N = s.nextInt();
		C = s.nextInt();
		T = s.nextInt();
		VR = s.nextInt();
		VT1 = s.nextInt();
		VT2 = s.nextInt();
		P = new int[N];
		for(int i = 0; i < N; ++i){
			P[i] = s.nextInt();
		}
		double RT = L/(VR*1.0);//兔子跑完所需要的时间
		Node []dis = new Node[N+1];//分为充电站个数+1段路程
		double TT = 0;//乌龟所用时间
		for(int i = 0; i <= N; ++i){
			dis[i] = new Node();
			if(i == 0){
				dis[i].start = 0;
				dis[i].end = P[i];
			}else if(i == N){
				dis[i].start = P[N-1];
				dis[i].end = L;
			}else{
				dis[i].start = P[i-1];
				dis[i].end = P[i];
			}
			int distance = dis[i].end - dis[i].start;//每段的距离
			double min;//最少花费时间
			double t1 = 0;//充电花费时间
			double t2 = 0;//不充电花费时间
			if(i != 0){
				//充电
				t1 += T;
				if(distance > C){
					t1 += C/(VT1*1.0);
					t1 += (distance-C)/(VT2*1.0);
					dis[i].left = 0;
				}else{
					t1 += distance/(VT1*1.0);
					dis[i].left = C - distance;
				}
				
				//不充电
				if(dis[i-1].left >= distance){
					t2 += distance/(VT1*1.0);
					dis[i].left = dis[i-1].left - distance;
				}else{
					t2 += dis[i-1].left/(VT1*1.0);
					t2 += (distance-dis[i-1].left)/(VT2*1.0);
					dis[i].left = 0;
				}
				
				min = t1 > t2 ? t2 : t1;
			}else{
				if(distance > C){
					min = 0;
					min += C/(VT1*1.0);
					min += (distance-C)/(VT2*1.0);
					dis[i].left = 0;
				}else{
					min = distance/(VT1*1.0);
					dis[i].left = C - distance;
				}
			}
			TT += min;
		}
		if(RT > TT){
			System.out.println("What a pity rabbit!");
		}else{
			System.out.println("Good job,rabbit!");
		}
	}
	
	private static class Node{
		int start;//开始距离
		int end;//结束距离
		int left;//电动车还可以开的距离
	}
}
