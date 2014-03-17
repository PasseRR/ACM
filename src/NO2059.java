import java.util.Scanner;


public class NO2059 {
	public static void main(String[] args) {
		int L;//��������
		int N;//���վ����
		int C;//����������ʻ�ľ���
		int T;//�������Ҫ��ʱ��
		int VR;//�����ܲ��ٶ�
		int VT1;//�ڹ꿪���ٶ�
		int VT2;//�ڹ��ﳵ�ٶ�
		int []P;//���վ����������
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
		double RT = L/(VR*1.0);//������������Ҫ��ʱ��
		Node []dis = new Node[N+1];//��Ϊ���վ����+1��·��
		double TT = 0;//�ڹ�����ʱ��
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
			int distance = dis[i].end - dis[i].start;//ÿ�εľ���
			double min;//���ٻ���ʱ��
			double t1 = 0;//��绨��ʱ��
			double t2 = 0;//����绨��ʱ��
			if(i != 0){
				//���
				t1 += T;
				if(distance > C){
					t1 += C/(VT1*1.0);
					t1 += (distance-C)/(VT2*1.0);
					dis[i].left = 0;
				}else{
					t1 += distance/(VT1*1.0);
					dis[i].left = C - distance;
				}
				
				//�����
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
		int start;//��ʼ����
		int end;//��������
		int left;//�綯�������Կ��ľ���
	}
}
