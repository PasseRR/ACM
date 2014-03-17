package hdu.AC;
import java.util.Scanner;


public class NO1039 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			String data = s.next();
			if("end".equals(data)){
				break;
			}
			if(tell(data)){
				System.out.println("<" + data + ">" + " is acceptable.");
			}else{
				System.out.println("<" + data + ">" + " is not acceptable.");
			}
		}
	}
	
	public static boolean tell(String str){
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for(int i = 0, len = str.length(); i < len; ++i){
			if(isVowel(str.charAt(i))){
				count1 ++;
				count3 = 0;
				count2 ++;
				if(count2 > 2){//连续3个元音
					return false;
				}
			}else{
				count2 = 0;
				count3 ++;
				if(count3 > 2){//连续3个辅音
					return false;
				}
			}
			if(i > 0){
				if((str.charAt(i) == str.charAt(i-1))
					&& (str.charAt(i) != 'o') && (str.charAt(i) != 'e')){//连续字符是否是元音
					return false;
				}
			}
		}
		if(count1 > 0){
			return true;
		}
		
		return false;
	}
	
	public static boolean isVowel(char ch){
		boolean flg = false;
		if(ch == 'a' || ch == 'e'
			|| ch == 'i' || ch == 'o' || ch == 'u'){
			flg = true;
		}
		
		return flg;
	}
}
