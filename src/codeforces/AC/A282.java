package codeforces.AC;
import java.util.Scanner;


public class A282 {
	static int x = 0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i = 0; i < num; ++i){
			String temp = s.next();
			if(temp.startsWith("x") || temp.startsWith("X")){
				if(temp.contains("+")){//x++
					operatorX(1);
				}else{//x--
					operatorX(2);
				}
			}else{
				if(temp.startsWith("+")){//++x
					operatorX(3);
				}else{//--x
					operatorX(4);
				}
			}
		}
		System.out.println(x);
	}
	
	public static void operatorX(int operator){
		switch (operator) {
		case 1:
			x++;
			break;
		case 2:
			x--;
			break;
		case 3:
			++x;
			break;
		case 4:
			--x;
			break;
		default:
			break;
		}
	}
}
