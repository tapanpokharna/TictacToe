package elements;

import stratergy_Package.Playing_Stratergy;

public abstract class Player {
	Playing_Stratergy playing_St = null;
	int symbol = -1;
	
	public void setSymbol(int symbol) {
		this.symbol = symbol;
	}
	
	public int getSymbol() {
		return this.symbol;
	}


	public void setPlaying_St(Playing_Stratergy playing_St) {
		this.playing_St = playing_St;
	}
	
	public abstract void makeMove(Board b);
	
	public void move(int x, int y) {
		// TODO Auto-generated method stub
	}
	
	
}
