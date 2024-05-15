package wordguesser;

public class Leaderboard extends Player{
	int sampleScore;
	public Leaderboard(String name2, int difficultyLevel2, int score) {
		super(name2, difficultyLevel2);
		// TODO Auto-generated constructor stub
		this.sampleScore=score;
	}
	Player player;
	public void displayLeaderboard(int difficultyLevel) {
		if (super.difficultyLevel == difficultyLevel) {
		System.out.println(super.name+"\t\t\t"+this.sampleScore);
		}
	}
}
