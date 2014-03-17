package pongo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AB {
	public static void main(String[] args) {
		int a, b;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		Set<Integer> L = new HashSet<Integer>();
		Set<Integer> R = new HashSet<Integer>();
		for(int i = 1; i <= a; i++){
			for(int j = 1; j <= b; j++){
				L.add(i*j);
				R.add(i^j);
			}
		}
		Iterator<Integer> it = L.iterator();
		long sum = 0;
		System.out.println(L);
		System.out.println(R);
		while(it.hasNext()){
			StringBuilder sb = new StringBuilder();
			String La = String.valueOf(it.next());
			sb.append(La);
			Iterator<Integer> it2 = R.iterator();
			while(it2.hasNext()){
				StringBuilder temp = new StringBuilder(sb);
				String Rb = String.valueOf(it2.next());
				int num = String.valueOf(b).length()+1-Rb.length();
				for(int i = 0; i < num; ++i){
					temp.append("0");
				}
				temp.append(Rb);
				System.out.println(num + " " + temp);
				sum += Long.valueOf(temp.toString());
			}
		}
		System.out.println(sum);
	}
}
