package hdu.MLE;
import java.util.*;
//MLE
public class NO1280 {
	public static void main(String[] args) {
		int n;
		int m;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{			
			n = sc.nextInt();
			m = sc.nextInt();
			int []num = new int[n];
			List<Integer> sumList = new LinkedList<Integer>();
			for(int i = 0; i < n; ++i)
			{
				num[i] = sc.nextInt();
			}
			for(int i = 0; i < num.length; ++i)
			{
				for(int j = i+1; j < num.length; ++j)
				{
					int temp = num[i] + num[j];
					sumList.add(new Integer(temp));
				}
			}
			Collections.sort(sumList);
			sumList.subList(sumList.size()-m, sumList.size());
			for(int i = sumList.size()-1; i > sumList.size()-m; --i)
			{
				System.out.print(sumList.get(i).intValue() + " ");
			}
			System.out.println(sumList.get(sumList.size()-m).intValue());
		}
	}
}
