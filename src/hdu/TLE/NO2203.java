package hdu.TLE;
import java.util.Scanner;
//TLE
public class NO2203 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strA;
		String strB;
		while(sc.hasNext()){
			strA = sc.next();
			strB = sc.next();
			if(strB.length() > strA.length()){
				System.out.println("no");
			}else{
				int i;
				for(i = 0; i < strA.length(); ++i){
					if(strA.indexOf(strB) != -1){
						System.out.println("yes");
						break;
					}
					strA = getString(strA);
				}
				if(i == strA.length()){
					System.out.println("no");
				}
			}
		}
	}
	
	//将字符串第一个字符移到最后
	public static String getString(String str){
		String temp = str.substring(1, str.length());
		temp += str.charAt(0);
		
		return temp;
	}
}
