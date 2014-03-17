package codeforces.AC;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class B158 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 0);
		map.put(2, 0);
		map.put(3, 0);
		map.put(4, 0);
		for(int i = 0; i < num; ++i){
			int group = s.nextInt();
			int count = map.get(group);
			map.put(group, count+1);
		}
		int one = map.get(1);
		int two = map.get(2);
		int three = map.get(3);
		int four = map.get(4);
		sum += four;//4个人一组的
		if(one > three){//1个人和3个人拼凑一车,不会存在1个人和3个人同时剩下的情况
			sum += three;
			one -= three;
			three = 0;
		}else if(one < three){
			sum += one;
			three -= one;
			one = 0;
		}else{
			sum += three;
			three = 0;
			one = 0;
		}
		sum += two/2;
		if(two%2 == 0){
			two = 0;
		}else{
			two = 1;
		}
		if(one > 0){
			if(two > 0){
				sum += 1;
				one -= 2;
				two = 0;
			}
			if(one > 0){
				if(one%4 == 0){
					sum += one/4;
					one = 0;
				}else{
					sum += one/4;
					sum += 1;
					one = 0;
				}
			}
		}
		if(three > 0){
			sum += three;
			three = 0;
			if(two > 0){
				sum += two;
				two = 0;
			}
		}
		if(two > 0){
			sum += two;
			two = 0;
		}
		System.out.println(sum);
	}
}
