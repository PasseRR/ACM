package codeforces.AC;
import java.util.Scanner;


public class A131 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String word = s.next();
		if(word.length() == 1){
			if(word.equals(word.toUpperCase())){
				System.out.println(word.toLowerCase());
			}else{
				System.out.println(word.toUpperCase());
			}
		}else{
			StringBuilder start = new StringBuilder(word.substring(0, 1));
			StringBuilder left = new StringBuilder(word.substring(1));
			if(left.toString().equals(left.toString().toUpperCase())){//���˵�һ����ĸȫ���Ǵ�д
				if(start.toString().equals(start.toString().toUpperCase())){//��һ����ĸ�Ǵ�дXXXXX
					System.out.println(word.toLowerCase());
				}else{//��һ���ַ���СдxXXXX
					System.out.println(start.toString().toUpperCase()+left.toString().toLowerCase());
				}
			}else{
				System.out.println(word);
			}
		}
	}
}
