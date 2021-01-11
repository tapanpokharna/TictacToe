package elements;

import stratergy_Package.Winning_Stratergy;

public class Board {
	int[][] board_array = null;
	Winning_Stratergy win_strat = null;
	public Board(int n, Winning_Stratergy ws) {
		board_array = new int[n][n];
		win_strat = ws;
		System.out.println(" A new Board created of size " + n +" x " + n);
	}
	
	public boolean isAvailable(int x, int y) {
		
		if(x < board_array.length && y < board_array[0].length && board_array[x][y] == 0) {
			return true;
		}
		return false;
	}
	
	public void move(int x, int y, int Player_Symbol) {
		board_array[x][y] = Player_Symbol;
	}
	
	public void getWinner(int x){
		win_strat.getWinner(board_array, x);
		return;
	}
}
