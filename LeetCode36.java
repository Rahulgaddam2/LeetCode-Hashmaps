package Hashmaps;

import java.util.*;

public class LeetCode36 {

	public static void main(String[] args) {
		LeetCode36 Object = new LeetCode36();
		
		char[][] board = {
                {'5','3','5','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
		
		System.out.println(Object.ValidSudoku(board));
		

	}
	public boolean ValidSudoku(char[][] board) {
		
		Set<String> sets = new HashSet<>();
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				char c = board[i][j];
				
				if(c != '.') {
					if(!sets.add(c+" at row " + i ) || !sets.add(c + "at col " + j) || !sets.add(c+" at box " + i/3 + "-" + j/3)) {
						return false;
					}
					
				}
			}
		}
		return true;
	}

}
