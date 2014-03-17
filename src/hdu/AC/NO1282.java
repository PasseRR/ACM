package hdu.AC;
import java.util.Scanner;
//AC
public class NO1282 
{
	static int i;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while(sc.hasNext())
		{
			num = sc.nextInt();
			i = 0;
			if(isLoopNumber(num))
			{
				System.out.println(i);
				System.out.println(num);
			}
			else
			{
				String str = num+"";
				str += loopNumber(num);
				System.out.println(i);
				System.out.println(str);
			}
		}
	}
	
	public static String loopNumber(int num)
	{
		i++;
		StringBuilder sb = new StringBuilder(new Integer(num).toString());
		int sum = Integer.parseInt(sb.reverse().toString());
		sum += num;
		if(!isLoopNumber(sum))
		{			
			return "--->"+sum+loopNumber(sum);
		}
		
		return "--->"+sum;
	}
	
	public static boolean isLoopNumber(int num)
	{
		String subsequenceStr = new Integer(num).toString();
		String reverseStr;
		StringBuilder sb = new StringBuilder(subsequenceStr);
		reverseStr = sb.reverse().toString();
		
		if(subsequenceStr.equals(reverseStr))
		{
			return true;
		}
		
		return false;
	}
}
