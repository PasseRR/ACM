import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class NO1663 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			int a = s.nextInt();
			int b = s.nextInt();
			if(a == 0 && b == 0){
				break;
			}else{
				if(a > b){
					a ^= b;
					b ^= a;
					a ^= b;
				}
			}
			Map map = new HashMap();
			for(int i = 0; i < 10; ++i){
				map.put(String.valueOf(i), 0);
			}
			for(int i = a; i <= b; ++i){
				count(map, String.valueOf(i));
			}
			for(int i = 0; i < 9; ++i){
				System.out.print(map.get(String.valueOf(i)) + " ");
			}
			System.out.println(map.get(String.valueOf(9)));
		}
	}
	@SuppressWarnings("unchecked")
	public static void count(Map map, String s){
		for(int i = 0; i < s.length(); ++i){
			String key = s.substring(i, i+1);
			int count = ((Integer) map.get(key)).intValue();
			count += 1;
			map.put(key, count);
		}
	}
}
