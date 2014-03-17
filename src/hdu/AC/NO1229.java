package hdu.AC;
import java.util.Scanner;

//AC
public class NO1229 
{
	public static void main(String []agrs)
	{
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		int k;
		while(scanner.hasNext())
		{
			a = scanner.nextInt();
			b = scanner.nextInt();
			k = scanner.nextInt();
			if(a == 0 && b == 0)
			{
				break;
			}
			int temp = (int) Math.pow(10*1.0, k*1.0);
			if(a%temp == b%temp)
			{
				System.out.println("-1");
			}
			else
			{
				System.out.println(a+b);
			}
		}
	}
}
