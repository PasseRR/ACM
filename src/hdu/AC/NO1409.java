package hdu.AC;
import java.util.Scanner;

public class NO1409 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String temp = sc.nextLine();
		num = Integer.parseInt(temp);
		String []str = new String[num];
		for(int i = 0; i < str.length; ++i){
			str[i] = sc.nextLine();				
		}
		for(int i = 0; i < str.length; ++i){
			tellIsNum(str[i]);				
		}
	}
	
	public static void tellIsNum(String str){
		int flg = 3;
		try{
			Integer.parseInt(str);
		}catch(NumberFormatException e){
			flg--;
		}
		try{
			Double.parseDouble(str);
		}catch(NumberFormatException e){
			flg--;
		}
		try{
			Float.parseFloat(str);
		}catch(NumberFormatException e){
			flg--;
		}
		
		if(flg > 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
