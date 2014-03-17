import java.util.Scanner;



public class NO1088 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(s.hasNext()){
			String string = s.nextLine();
			if(!string.trim().equals("")){
				sb.append(string);
			}
		}
		
		sb.append("Hallo, <hr><hr>dies ist eine ");
		sb.append("ziemlich lange Zeile, die in Html");
		sb.append("aber nicht umgebrochen <br>wird.");
		System.out.println(sb.toString().replaceAll("<hr>", getHr()).replaceAll("<br>", "\n"));
	}
	
	public static String getHr(){
		StringBuilder sb = new StringBuilder();
		sb.append("<br>");
		for(int i = 0; i < 80; ++i){
			sb.append("-");
		}
		sb.append("<br>");
		return sb.toString();
	}
}
