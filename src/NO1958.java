import java.util.Scanner;


public class NO1958 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int caseNum = 1;
		while(caseNum <= num){
			int numOfHook = s.nextInt();
			int []valueOfHook = new int[numOfHook];
			int option = s.nextInt();
			for(int i = 0; i < option; ++i){
				int start = s.nextInt();
				int end = s.nextInt();
				int value = s.nextInt();
				for(int j = start; j <= end; ++j){
					valueOfHook[j-1] = value;
				}
			}
			int sum = 0; 
			for(int i = 0; i < valueOfHook.length; ++i){
				if(valueOfHook[i] == 0){
					sum += 1;
				}else{
					sum += valueOfHook[i];
				}
			}
			System.out.println("Case "+caseNum+": The total value of the hook is "+sum+".");
			caseNum ++;
		}
	}
}
