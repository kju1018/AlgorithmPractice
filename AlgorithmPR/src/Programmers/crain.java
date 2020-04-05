package Programmers;

import java.util.Stack;

public class crain {

	public static void main(String[] args) {
		int [][] board = {
				{0,0,0,0,0},
				{0,0,1,0,3},
				{0,2,5,0,1},
				{4,2,4,4,2},
				{3,5,1,3,1}};

		int [] moves = {1,5,3,5,1,2,1,4};
		int answer = 0;



		Stack bu = new Stack<Integer>();
		bu.add(0);
		int len = moves.length;
		for(int i = 0; i< len ; i++){
			int pick = moves[i]-1;
			for(int j = 0 ;j < board.length;j++) {
				if(board[j][pick] !=0 && (int)bu.peek() == board[j][pick]) {
					bu.pop();
					answer+=2;
					board[j][pick]=0;
					break;
				}
				else if(board[j][pick] !=0) {
					bu.add(board[j][pick]);
					board[j][pick]=0;
					break;

				}

			}

		}

		System.out.print(answer);
	}
}
