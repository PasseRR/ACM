import java.util.Scanner;


public class NO1058 {
	static int result[] = new int[5842];
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		init();
		while(s.hasNext()){
			int n = s.nextInt();
			if(0 == n){
				break;
			}
			printResult(n);
		}
	}
	
	public static void init(){
		result[0] = 1;
		int j = 1;
		for(int i = 2; ; i++){
			if(isResult(i)){
				result[j] = i;
				if(j == 5841){
					return;
				}else{
					j ++;
				}
			}
		}
	}
	
	public static boolean isResult(int n){
		for(int i = 2; i <= 7; ++i){
			if(n%i == 0){
				if((2 == i)
				  || (3 == i)
				  || (5 == i)
				  || (7 == i)){
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void printResult(int n){
		String num = String.valueOf(n);
		if(num.endsWith("1")){
			System.out.println("The "+ num +"st humble number is "+ result[n-1] +".");
		}else if(num.endsWith("2")){
			System.out.println("The "+ num +"nd humble number is "+ result[n-1] +".");
		}else if(num.endsWith("3")){
			System.out.println("The "+ num +"rd humble number is "+ result[n-1] +".");
		}else{
			System.out.println("The "+ num +"th humble number is "+ result[n-1] +".");
		}
	}
}
