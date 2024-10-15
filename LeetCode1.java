package Hashmaps;

import java.util.*;

public class LeetCode1 {

	public static void main(String[] args) {
		LeetCode1 Object = new LeetCode1();
		
		int[] array = {2, 7, 11, 15};
        int target = 9;

        // Call the twosum method and store the result
        int[] finalarray = Object.twosum(array, target);

        // Print the result
        System.out.println("Indices: " + finalarray[0] + ", " + finalarray[1]);

	}
	public int[] twosum(int[] array, int target) {
		
		HashMap<Integer , Integer> map = new HashMap<>();
		
		for(int i=0;i<array.length; i++) {
			
			int number = target - array[i];
			
			if(map.containsKey(number)) {
				return new int[] {map.get(number), i};
			}else {
				map.put(array[i], i);
			}
		}
		return new int[]{};
	}

}
