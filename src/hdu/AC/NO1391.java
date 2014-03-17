package hdu.AC;
import java.util.Scanner;


public class NO1391 {
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		while(count > 0){
			int x = s.nextInt();
			int y = s.nextInt();
			int num = result(x, y);
			if(-1 == num){
				System.out.println("No Number");
			}else{
				System.out.println(num);
			}
			count --;
		}
	}
	public static int result(int x, int y){
		int i = x/2;
		int j = x%2;
		if(x == y){
			if(j == 0){
				return i*3 + i;
			}else{
				return i*3 + i + 1;
			}
		}else if(x == (y+2)){
			if(j == 0){
				return (i-1)*3 + i + 1;
			}else{
				return (i-1)*3 + i + 2;
			}
		}
		
		return -1;
	}
}
