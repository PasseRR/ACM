import java.util.Scanner;


public class NO1097 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			int a = s.nextInt();
			int b = s.nextInt();
			int aNum = a%10;//取尾数
			if(b%4 == 0){
				System.out.println(aNum*aNum*aNum*aNum%10);
			}else if(b%4 == 1){
				System.out.println(aNum%10);
			}else if(b%4 == 2){
				System.out.println(aNum*aNum%10);
			}else{
				System.out.println(aNum*aNum*aNum%10);
			}
		}
	}
	public static void otherMethod(int a, int b){
		int aNum = a%10;//取尾数
		if(0 == aNum
		  || 1 == aNum
		  || 5 == aNum
		  || 6 == aNum){
			System.out.println(aNum%10);
		}else if(4 == aNum || 9 == aNum){
			if(b%2 == 0){
				System.out.println(aNum*aNum%10);
			}else{
				System.out.println(aNum%10);
			}
		}else{//2,3,7,8
			if(b%4 == 0){
				System.out.println(aNum*aNum*aNum*aNum%10);
			}else if(b%4 == 1){
				System.out.println(aNum%10);
			}else if(b%4 == 2){
				System.out.println(aNum*aNum%10);
			}else{
				System.out.println(aNum*aNum*aNum%10);
			}
		}
	}
}
