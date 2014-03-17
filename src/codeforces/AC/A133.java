package codeforces.AC;
import java.util.Scanner;


public class A133 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String command = s.nextLine();
		if(command.contains("H")
		   || command.contains("Q")
		   || command.contains("9")){
			   System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
