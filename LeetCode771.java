package Hashmaps;

import java.util.HashSet;

public class LeetCode771 {

	public static void main(String[] args) {
		LeetCode771 object = new LeetCode771();
		
		String jewels = "abABcdEf";
		String stones = "aaabklopEf";
		
		System.out.println(object.method(jewels,stones));

	}
	
	public int method(String jewels , String stones) {
		
		HashSet<Character> jewelset = new HashSet<>();
		for(int i =0; i<jewels.length(); i++) {
			jewelset.add(jewels.charAt(i));
		}
		
		int score = 0;
		for(int i=0; i<stones.length(); i++) {
			if(jewelset.contains(stones.charAt(i))) {
				score++;
			}
		}
		return score;
	}

}
