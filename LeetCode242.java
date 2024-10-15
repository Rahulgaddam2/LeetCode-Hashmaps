package Hashmaps;

import java.util.*;

public class LeetCode242 {

	public static void main(String[] args) {
		LeetCode242 Object = new LeetCode242();
		
		String a = "rahul";
		String b = "lea";
		
		System.out.println(Object.method(a, b));
		
		

	}
	public boolean method(String a, String b) {
		
		HashMap<Character, Integer> mapping = new HashMap<>();
		
		for(int i=0; i<a.length(); i++) {
			char c = a.charAt(i);
			if(mapping.containsKey(c)) {
				mapping.put(c, mapping.get(c)+1);
			}else {
				mapping.put(c, 1);
			}
		}
		for(int i=0; i<a.length(); i++) {
			char v = b.charAt(i);
			if(!mapping.containsKey(v) || mapping.get(v) == 0) {
				return false;
			}else {
				mapping.put(v, mapping.get(v)-1);
			}
		}
		return true;
	}

}
