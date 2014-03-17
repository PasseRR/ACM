import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NO1251 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> letter = new LinkedList<String>();
		//Ç°×ºprefix ºó×ºpostfix
		List<String> prefix = new LinkedList<String>();
		while(s.hasNext() && !s.nextLine().trim().equals("")){
			letter.add(s.nextLine());
		}
		while(s.hasNext()){
			prefix.add(s.nextLine());
		}
		for(String pre:prefix){
			int count = 0;
			for(String lett:letter){
				if(lett.startsWith(pre)){
					count ++;
				}
			}
			System.out.println(count);
		}
	}
}
