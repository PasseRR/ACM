package hdu.AC;
import java.util.Scanner;
//AC
public class NO1283 {
	public static void main(String[] args) {
		int M1;
		int M2;
		String command;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int R1 = 0;
			int R2 = 0;
			int R3 = 0;
			M1 = sc.nextInt();
			M2 = sc.nextInt();
			command = sc.next();
			for(int i = 0; i < command.length(); ++i)
			{
				switch(command.charAt(i))
				{
					case 'A':R1 = M1;
							break;
					case 'B':R2 = M2;
							break;
					case 'C':M1 = R3;
							break;
					case 'D':M2 = R3;
							break;
					case 'E':R3 = R1 + R2;
							break;
					case 'F':R3 = R1 - R2;
							break;
					default:break;
				}
			}
			System.out.println(M1 + "," + M2);
		}
	}
}
