package elements;

import stratergy_Package.Human_PS;

public class Human extends Player{
	
	Human(Board b, int symbol){
		this.setPlaying_St(new Human_PS());
		this.symbol = symbol;
		playing_St.setBoard(b);
		return;
	}
	
	@Override
	public void makeMove(Board b) {
		// TODO Auto-generated method stub
		System.out.println("Human player playing");
		int[] curr_move = playing_St.getCoordinates();
		int x = curr_move[0];
		int y = curr_move[1];
		b.move(x,y,symbol);
		System.out.println("Human Player made a move successfully");
		
		// read Input here
	}

}
