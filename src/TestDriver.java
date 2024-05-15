package wordguesser;
import java.io.IOException;
import java.util.Scanner;
@SuppressWarnings("unused")
public class TestDriver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		Scanner myObj1 = new Scanner(System.in);
		Leaderboard lb[] = new Leaderboard[11];
		lb[0]= new Leaderboard("Dummy1",1,22);
		lb[1]= new Leaderboard("Dummy2",1,20);
		lb[2]= new Leaderboard("Dummy3",1,26);
		lb[3]= new Leaderboard("Dummy4",2,16);
		lb[4]= new Leaderboard("Dummy5",2,18);
		lb[5]= new Leaderboard("Dummy6",2,20);
		lb[6]= new Leaderboard("Dummy7",3,10);
		lb[7]= new Leaderboard("Dummy8",3,12);
		lb[8]= new Leaderboard("Dummy9",3,8);
		lb[9]= new Leaderboard("Dummy10",1,24);
		System.out.println("\tWELCOME TO WORD GUESSER");
		System.out.println("---->RULES<----");
		System.out.println("1)Select from three difficulty levels(1-3).");
		System.out.println("2)Get upto 2 extra Hints.");
		System.out.println("3)You have three attempts to guess the word.");
		System.out.println("4)Each Correct attempt gives +10 points.");
		System.out.println("5)Each incorrect attempt gives -2 points.");
		System.out.println("6)You have to guess total of 3 words to finish the game.");
		System.out.println("7)Total score is calculated and displayed in leaderboards.");
		System.out.println("\nPlease enter your name: ");
		String name = myObj.nextLine();
		System.out.println("1-Start Game\n"
				+ "2-Show LeaderBoard\n"
				+ "3-Exit\n"
				+ "Enter your choice:");
		int choice = myObj.nextInt();
		switch(choice) {
		  case 1:
			while(true) {
			  System.out.println("Please enter the Difficulty Level(1-3): ");
			  int difficulty = myObj.nextInt();
			  Player player1= new Player(name,difficulty);
			  player1.startGame();
			  lb[10]= new Leaderboard(name,difficulty,Player.Score);
			  System.out.println("=============================");
			  System.out.println("          LEVEL "+ difficulty);
			  System.out.println("=============================");
			  lb[10].displayLeaderboard(difficulty);
			  for(int i=0;i<=9;i++) {
				  lb[i].displayLeaderboard(difficulty);
			  }
			  System.out.println("=============================");
			  System.out.println("Restart Game?(Y/N)");
			  String opt= myObj1.nextLine();
			  if(opt.equals("N")||opt.equals("n")) {
				  System.out.println("Exiting Programme...");
				  break;
			  }
			  }
			  break;
		  case 2:
			  System.out.println("Please enter the Difficulty Level(1-3): ");
			  int difficulty1 = myObj.nextInt();
			  System.out.println("=============================");
			  System.out.println("          LEVEL "+ difficulty1);
			  System.out.println("=============================");
			  for(int i=0;i<=9;i++) {
				  lb[i].displayLeaderboard(difficulty1);
			  }
			  System.out.println("=============================");
			  break;
		  case 3:
			  System.out.println("Exiting Programme...");
			  break;
		  default:
			  System.out.println("Invalid Input!");
			  break;
		}myObj.close();
		myObj1.close();
	}

}
