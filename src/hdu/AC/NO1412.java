package hdu.AC;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NO1412 {
	public static void main(String[] args) {
		int m;
		int n;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			m = sc.nextInt();
			n = sc.nextInt();
			Set<Integer> mSet = new TreeSet<Integer>();
			Set<Integer> nSet = new TreeSet<Integer>();
			for(int i = 0; i < m; ++i){
				mSet.add(new Integer(sc.nextInt()));
			}
			for(int i = 0; i < n; ++i){
				nSet.add(new Integer(sc.nextInt()));
			}
			mSet.addAll(nSet);
			Object []data = mSet.toArray();
			for(int i = 0; i < data.length-1; ++i){
				int temp = ((Integer)data[i]).intValue();
				System.out.print(temp + " ");
			} 
			System.out.println(((Integer)data[data.length-1]).intValue());
		}
	}
}
