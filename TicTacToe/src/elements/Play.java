package elements;

import stratergy_Package.ConventionalWinning_Stratergy;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board(3, new ConventionalWinning_Stratergy());
		Player p1 = new Human(board, 1); 
		//p1.setName("Tapan");
		Player p2 = new Human(board,10);
		int i =0;
		boolean p1turn = true;
		while(i < 1) {
			System.out.println(i);
			if(p1turn) {
				p1.makeMove(board);
				p1turn = false;
			} else {
				p2.makeMove(board);
				p1turn = true;
			}
			i++;
		}
		System.gc();
		board.getWinner(p1.getSymbol());
		board.getWinner(p2.getSymbol());
		return;
	}

}
