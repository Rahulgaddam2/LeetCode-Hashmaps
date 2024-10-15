package Hashmaps;

import java.util.*;

public class LeetCode128 {

	public static void main(String[] args) {
		
		LeetCode128 Object = new LeetCode128();
		
		int[] array = {100,4,200,1,3,2};
		
		System.out.println(Object.longestConsecutiveSequence(array));
		

	}
	public int longestConsecutiveSequence(int[] array) {
		
		int longestlength = 0;
		Map<Integer, Boolean> map = new HashMap<>();
		
		for(int i=0;i<array.length;i++) {
			map.put(array[i], false);
		}
		for(int i=0;i<array.length;i++) {
			
			int currentlength = 1;
			int nextnumber = array[i]+1;
			
			while(map.containsKey(nextnumber) && map.get(nextnumber) == false) {
				currentlength++;
				map.put(nextnumber, true);
				
				nextnumber++;
						
				
			}
			int previousnumber = array[i]-1;
			
			while(map.containsKey(previousnumber) && map.get(previousnumber) == false) {
				currentlength++;
				map.put(previousnumber, true);
				
				previousnumber--;
				
			}
			
			longestlength = Math.max(longestlength,currentlength );
		}
		
		return longestlength;
		
	}

}
