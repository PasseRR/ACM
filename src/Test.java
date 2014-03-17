import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int []arrays = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		System.out.println(Arrays.toString(arrays));
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int []temp = new int[arrays.length+1];
		System.arraycopy(arrays, 0, temp, 0, arrays.length);
		System.out.println(Arrays.toString(temp));
		for(int i = arrays.length-1; i >= 0; --i){
			if(num <= temp[i]){
				temp[i] = num;
				break;
			}else{
				temp[i+1] = temp[i];
				temp[i] = num;
			}
		}
		arrays = temp;
		System.out.println(Arrays.toString(arrays));
	}
}
