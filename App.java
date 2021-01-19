import java.util.Scanner;
import java.util.Random;

public class App {
	
	public static void main (String []   args) {
		String[] words = {"Banana", "Apple", "Orange", "Mango","Peach","Plum", "Strawberries", "Kiwi","Cherry"}; //Guessed Words
		String word = words [(int) (Math.random() * words.length)];
		String random = new string(new char[word.length()]).replace("\0", "*");
		int count = 0;
		
		Scanner sc = new scanner(System.in);
		
		while (count < 7 && random contains ("*")) {
		System.out.println("Welcome, Lets Play Hangman!");
		System.out.println("Guess A Letter!");
		System.out.println (random);
		String guess = sc.next();
		hang (guess);
		
		}
		sc.close();

    Public static void hang(String guess) {
		String randomtwo = "";
		for (int i=0; i < word.length (); i++) {
			if (word.charAt(i) == guess.charAt(0) {
				randomtwo += guess.charAt(0);
			} else if (random.charAt (i) != '*' {
					randomtwo += word.charAt (i);
			} else {
					randomtwo += "*"
			}
		}
			
		//User types in a letter
		
		//Check if letter exists within the word
		
		//If correct, print letter within the now resolved area
		
		//If incorrect, print "Incorrect"
		
		
	

  }
}