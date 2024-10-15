package Hashmaps;

import java.util.*;

public class LeetCode217 {

	public static void main(String[] args) {
		LeetCode217 object = new LeetCode217();
		
		int[] num = {1,2,3,4,7,1,23,5,7,9,5,5,5,7,8,9,3};
		
		System.out.println(object.method(num));

	}
	public boolean method(int[] number) {
		
		HashSet<Integer> numbers = new HashSet<>();
		
		for(int i=0;i<number.length;i++) {
			if(numbers.contains(number[i])) {
				return true;
			}else {
				numbers.add(number[i]);
			}
		}
		return false;
		
	}

}
