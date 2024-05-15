package wordguesser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Words{
	static List<String> word = new ArrayList<String>();
	public static void displayWord() throws IOException {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(new File("words.txt"));
		while (s.hasNext()){
		    word.add(s.next());
		}
		s.close();
		 
	}
	
	
}
