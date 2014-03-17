import java.util.Arrays;
import java.util.Scanner;

public class NO1671 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//输入的数组的组数
		int n;
		//一组数据的个数
		int t;
		String data[];
		n = sc.nextInt();
		while(n > 0){
			data = null;
			t = sc.nextInt();
			data = new String[t];
			for(int i = 0; i < t; ++i){
				data[i] = sc.next();
			}
			Arrays.sort(data);
			for(int i = 0; i < t; ++i){
				for(int j = i+1; j < t; ++j){
					if(data[j].startsWith(data[i])){
						System.out.println("NO");
						n--;
						continue;
					}
				}
			}
			System.out.println("YES");
			n--;
		}
	}
}
