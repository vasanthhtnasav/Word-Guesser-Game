package wordguesser;

import java.io.IOException;

public class Player extends Guesser{
	public String name;
	int difficultyLevel;
	String guess;
	static int Score;
	public Player(String name2, int difficultyLevel2) {
		// TODO Auto-generated constructor stub
		this.name=name2;
		this.difficultyLevel=difficultyLevel2;
		Player.Score=0;
	}
	public void setname(String name2) {
		this.name=name2;
	}
	public void startGame() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Player: "+this.name+
				"\nDifficulty Level: "+this.difficultyLevel);
		super.beginGuess();
		Hints.displayHint(Levels.setLevel(difficultyLevel));
	}
	
	
}
