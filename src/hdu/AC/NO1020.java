package hdu.AC;
import java.util.Scanner;


public class NO1020 {
	public static void main(String[] args) {
		int count;
		Scanner s = new Scanner(System.in);
		count = s.nextInt();
		String data;
		while(count-- > 0){
			data = s.next();
			int num = 1;
			char current = data.charAt(0);
			for(int i = 1; i < data.length(); ++i){
				if(data.charAt(i) == data.charAt(i-1)){
					num ++;
					if(i == data.length()-1){//���һ���ַ���ǰһ����ͬ
						System.out.print(num + "" + current);
					}
				}else{
					if(1 == num){
						System.out.print(current);
					}else{
						System.out.print(num + "" + current);
					}
					if((i == data.length()-1)){//���һ����ǰһ������ͬ,ֱ�Ӵ�ӡ���һ���ַ� ����
						System.out.print(data.charAt(i));
					}
					current = data.charAt(i);
					num = 1;
				}
			}
			System.out.println();
		}
	}
}
