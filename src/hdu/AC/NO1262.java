package hdu.AC;
import java.util.Scanner;
//AC
public class NO1262 
{
	public static void main(String []agrs)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		//sc.hasNext()≈–∂œ «∑Ò”– ‰»Î
		while(sc.hasNext())
		{
			num = sc.nextInt();
			int result = 0;
			int reduce = Integer.MAX_VALUE;
			for(int i = 3; i <= num; ++i)
			{
				if(tellPrime(i) && tellPrime(num-i))
				{
					int temp = Math.abs(i-num+i);
					if(temp < reduce)
					{
						result = i;
						reduce = temp;
					}
				}
			}
			
			System.out.println(result +" " + (num-result));
		}
	}
	
	public static boolean tellPrime(int a)
	{
		double max = Math.sqrt(a);
		for(int i = 2; i <= max; ++i)
		{
			if(a % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
}
