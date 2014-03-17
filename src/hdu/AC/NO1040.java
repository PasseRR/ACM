package hdu.AC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class NO1040 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(n > 0){
			int count = s.nextInt();
			List list = new ArrayList();
			for(int i = 0; i < count; ++i){
				list.add(s.nextInt());
			}
			Collections.sort(list);
			for(int i = 0; i < list.size()-1; ++i){
				System.out.print(list.get(i) + " ");
			}
			System.out.println(list.get(list.size()-1));
			n--;
		}
	}
}
