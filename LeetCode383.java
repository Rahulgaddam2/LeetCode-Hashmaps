package Hashmaps;

import java.util.*;

public class LeetCode383 {

	public static void main(String[] args) {
		LeetCode383 object = new LeetCode383();
		
		String ransomNote = "a";
		String magazine = "ab";
		
		System.out.println(object.method(ransomNote, magazine));
		

	}
	public boolean method(String ransomNote , String magazine) {
		
		HashMap<Character, Integer> mapping = new HashMap<>();
		
		for(int i=0; i<magazine.length(); i++) {
			char c = magazine.charAt(i);
			if(mapping.containsKey(c)) {
				mapping.put(c, mapping.get(c)+1);
			}else {
				mapping.put(c, 1);
			}
			
		}
		for(int i=0; i<ransomNote.length(); i++) {
			char r = ransomNote.charAt(i);
			if(!mapping.containsKey(r) || mapping.get(r)==0) {
				return false;
			}else {
				mapping.put(r,mapping.get(r)-1);
			}
		}
		return true;
	}

}
