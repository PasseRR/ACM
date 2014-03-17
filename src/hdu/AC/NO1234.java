package hdu.AC;
import java.util.Scanner;
//AC
public class NO1234 
{
	public static void main(String[] args) 
	{
		int N;
		int M;
		String ID;
		String loginIn;
		String loginOut;		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		String []finalInID = new String[N];
		String []finalOutID = new String[N];
		String finalIn="";
		String finalOut="";
		for(int i = 0; i < N; ++i)
		{
			M = sc.nextInt();			
			for(int j = 0; j < M; ++j)
			{
				ID = sc.next();
				loginIn = sc.next();
				loginOut = sc.next();
				if(finalInID[i] == null)
				{
					finalInID[i] = ID;
					finalOutID[i] = ID;
					finalIn = loginIn;
					finalOut = loginOut;
				}
				else
				{
					if(loginIn.compareTo(finalIn) < 0)
					{
						finalIn = loginIn;
						finalInID[i] = ID;
					}
					if(loginOut.compareTo(finalOut) > 0)
					{
						finalOut = loginOut;
						finalOutID[i] = ID;
					}
				}
			}
		}
		for(int i = 0; i < N; ++i)
		{
			System.out.println(finalInID[i] + " " + finalOutID[i]);
		}
	}
}
