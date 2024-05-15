package wordguesser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class Hints extends System1{
	Levels level;
	static List<String> hint = new ArrayList<String>();
	public static void displayHint(int difficultyLevel) throws IOException {
		Scanner obj = new Scanner(new File("hints.txt"));
		while (obj.hasNextLine()){
		    hint.add(obj.nextLine());
		}
		int score=0;
		obj.close();
		@SuppressWarnings("resource")
		Scanner myObj1 = new Scanner(System.in);
		switch(difficultyLevel) {
		case 1:
			Random random1 = new Random();  
			List<Integer> a = random1.ints(3, 1, 10).boxed().toList();
			System.out.println("=================================================");
			System.out.println("                    WORD 1");
			System.out.println(hint.get(3*a.get(0)));
			System.out.println("=================================================");
			System.out.println("Guess the word(# for hint): ");
			int attempt=1;
			int i=1;
			int h=1;
			while (attempt<4) {
			System.out.println("Attempt("+attempt+"/3):");
			String guess = myObj1.nextLine();
			if (guess.equals("#")) {
				h++;
				if (h>3) {
					System.out.println("No more hints available!");
				}
				else {
					System.out.println(hint.get(3*a.get(0)+i));
					i++;
				}
			}else if(guess.equals(word.get(a.get(0)))) {
				System.out.println("Correct Answer!");
				System.out.println("+10 Points!");
				score+=10;
				break;
			}else {
				System.out.println("Incorrect Answer!");
				attempt++;
				if(attempt==4) {
					System.out.println("Correct Answer is "+word.get(a.get(0)));
				}
				score-=2;
			}
			}
			System.out.println("=================================================");
			System.out.println("                     WORD 2");
			System.out.println(hint.get(3*a.get(1)));
			System.out.println("=================================================");
			System.out.println("Guess the word(# for hint): ");
			int attempt1=1;
			int i1=1;
			h=1;
			while (attempt1<4) {
			System.out.println("Attempt("+attempt1+"/3):");
			String guess = myObj1.nextLine();
			if (guess.equals("#")) {
				h++;
				if (h>3) {
					System.out.println("No more hints available!");
				}
				else {
				System.out.println(hint.get(3*a.get(1)+i1));
				i1++;
				}
			}else if(guess.equals(word.get(a.get(1)))) {
				System.out.println("Correct Answer!");
				System.out.println("+10 Points!");
				score+=10;
				break;
			}else {
				System.out.println("Incorrect Answer!");
				attempt1++;
				if(attempt1==4) {
					System.out.println("Correct Answer is "+word.get(a.get(1)));
				}
				score-=2;
			}
			}
			System.out.println("=================================================");
			System.out.println("                     WORD 3");
			System.out.println(hint.get(3*a.get(2)));
			System.out.println("=================================================");
			System.out.println("Guess the word(# for hint): ");
			int attempt2=1;
			int i2=1;
			h=1;
			while (attempt2<4) {
			System.out.println("Attempt("+attempt2+"/3):");
			String guess = myObj1.nextLine();
			if (guess.equals("#")) {
				h++;
				if (h>3) {
					System.out.println("No more hints available!");
				}
				else {
				System.out.println(hint.get(3*a.get(2)+i2));
				i2++;
				}
			}else if(guess.equals(word.get(a.get(2)))) {
				System.out.println("Correct Answer!");
				System.out.println("+10 Points!");
				score+=10;
				break;
			}else {
				System.out.println("Incorrect Answer!");
				attempt2++;
				if(attempt2==4) {
					System.out.println("Correct Answer is "+word.get(a.get(2)));
				}
				score-=2;
			}
			}
			System.out.println("Score = "+score);
			Player.Score=score;
			break;
		case 2:
			Random random11 = new Random();  
			List<Integer> a1 = random11.ints(3, 11, 20).boxed().toList();
			System.out.println("=================================================");
			System.out.println("                    WORD 1");
			System.out.println(hint.get(3*a1.get(0)));
			System.out.println("=================================================");
			System.out.println("Guess the word(# for hint): ");
			int attempt11=1;
			int i11=1;
			h=1;
			while (attempt11<4) {
			System.out.println("Attempt("+attempt11+"/3):");
			String guess = myObj1.nextLine();
			if (guess.equals("#")) {
				h++;
				if (h>3) {
					System.out.println("No more hints available!");
				}
				else {
				System.out.println(hint.get(3*a1.get(0)+i11));
				i11++;
				}
			}else if(guess.equals(word.get(a1.get(0)))) {
				System.out.println("Correct Answer!");
				System.out.println("+10 Points!");
				score+=10;
				break;
			}else {
				System.out.println("Incorrect Answer!");
				attempt11++;
				if(attempt11==4) {
					System.out.println("Correct Answer is "+word.get(a1.get(0)));
				}
				score-=2;
			}
			}
			System.out.println("=================================================");
			System.out.println("                     WORD 2");
			System.out.println(hint.get(3*a1.get(1)));
			System.out.println("=================================================");
			System.out.println("Guess the word(# for hint): ");
			int attempt111=1;
			int i111=1;
			h=1;
			while (attempt111<4) {
			System.out.println("Attempt("+attempt111+"/3):");
			String guess = myObj1.nextLine();
			if (guess.equals("#")) {
				h++;
				if (h>3) {
					System.out.println("No more hints available!");
				}
				else {
				System.out.println(hint.get(3*a1.get(1)+i111));
				i111++;
				}
			}else if(guess.equals(word.get(a1.get(1)))) {
				System.out.println("Correct Answer!");
				System.out.println("+10 Points!");
				score+=10;
				break;
			}else {
				System.out.println("Incorrect Answer!");
				attempt111++;
				if(attempt111==4) {
					System.out.println("Correct Answer is "+word.get(a1.get(1)));
				}
				score-=2;
			}
			}
			System.out.println("=================================================");
			System.out.println("                     WORD 3");
			System.out.println(hint.get(3*a1.get(2)));
			System.out.println("=================================================");
			System.out.println("Guess the word(# for hint): ");
			int attempt21=1;
			int i21=1;
			h=1;
			while (attempt21<4) {
			System.out.println("Attempt("+attempt21+"/3):");
			String guess = myObj1.nextLine();
			if (guess.equals("#")) {
				h++;
				if (h>3) {
					System.out.println("No more hints available!");
				}
				else {
				System.out.println(hint.get(3*a1.get(2)+i21));
				i21++;
				}
			}else if(guess.equals(word.get(a1.get(2)))) {
				System.out.println("Correct Answer!");
				System.out.println("+10 Points!");
				score+=10;
				break;
			}else {
				System.out.println("Incorrect Answer!");
				attempt21++;
				if(attempt21==4) {
					System.out.println("Correct Answer is "+word.get(a1.get(2)));
				}
				score-=2;
			}
			}
			System.out.println("Score = "+score);
			Player.Score=score;
			break;
		case 3:
			Random random111 = new Random();  
			List<Integer> a11 = random111.ints(3, 21, 30).boxed().toList();
			System.out.println("=================================================");
			System.out.println("                    WORD 1");
			System.out.println(hint.get(3*a11.get(0)));
			System.out.println("=================================================");
			System.out.println("Guess the word(# for hint): ");
			int attempt1111=1;
			int i1111=1;
			h=1;
			while (attempt1111<4) {
			System.out.println("Attempt("+attempt1111+"/3):");
			String guess = myObj1.nextLine();
			if (guess.equals("#")) {
				h++;
				if (h>3) {
					System.out.println("No more hints available!");
				}
				else {
				System.out.println(hint.get(3*a11.get(0)+i1111));
				i1111++;
				}
			}else if(guess.equals(word.get(a11.get(0)))) {
				System.out.println("Correct Answer!");
				System.out.println("+10 Points!");
				score+=10;
				break;
			}else {
				System.out.println("Incorrect Answer!");
				attempt1111++;
				if(attempt1111==4) {
					System.out.println("Correct Answer is "+word.get(a11.get(0)));
				}
				score-=2;
			}
			}
			System.out.println("=================================================");
			System.out.println("                     WORD 2");
			System.out.println(hint.get(3*a11.get(1)));
			System.out.println("=================================================");
			System.out.println("Guess the word(# for hint): ");
			int attempt11111=1;
			int i11111=1;
			h=1;
			while (attempt11111<4) {
			System.out.println("Attempt("+attempt11111+"/3):");
			String guess = myObj1.nextLine();
			if (guess.equals("#")) {
				h++;
				if (h>3) {
					System.out.println("No more hints available!");
				}
				else {
				System.out.println(hint.get(3*a11.get(1)+i11111));
				i11111++;
				}
			}else if(guess.equals(word.get(a11.get(1)))) {
				System.out.println("Correct Answer!");
				System.out.println("+10 Points!");
				score+=10;
				break;
			}else {
				System.out.println("Incorrect Answer!");
				attempt11111++;
				if(attempt11111==4) {
					System.out.println("Correct Answer is "+word.get(a11.get(1)));
				}
				score-=2;
			}
			}
			System.out.println("=================================================");
			System.out.println("                     WORD 3");
			System.out.println(hint.get(3*a11.get(2)));
			System.out.println("=================================================");
			System.out.println("Guess the word(# for hint): ");
			int attempt211=1;
			int i211=1;
			h=1;
			while (attempt211<4) {
			System.out.println("Attempt("+attempt211+"/3):");
			String guess = myObj1.nextLine();
			if (guess.equals("#")) {
				h++;
				if (h>3) {
					System.out.println("No more hints available!");
				}
				else {
				System.out.println(hint.get(3*a11.get(2)+i211));
				i211++;
				}
			}else if(guess.equals(word.get(a11.get(2)))) {
				System.out.println("Correct Answer!");
				System.out.println("+10 Points!");
				score+=10;
				break;
			}else {
				System.out.println("Incorrect Answer!");
				attempt211++;
				if(attempt211==4) {
					System.out.println("Correct Answer is "+word.get(a11.get(0)));
				}
				score-=2;
			}
			}
			System.out.println("Score = "+score);
			Player.Score=score;
		}
	}
	
}
