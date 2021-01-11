package stratergy_Package;

import elements.Board;

/*class moveNode{
	int x_cord;
	int y_cord;
	moveNode(int x, int y){
		x_cord = x;
		y_cord = y;
	}
}*/

public abstract class Playing_Stratergy {
	Board board = null;

	public void setBoard(Board board) {
		this.board = board;
	}
	
	public boolean validateMove(int x , int y) {
		return this.board.isAvailable(x, y);
	}	
	
	public abstract int[] getCoordinates();
}
