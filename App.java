import java.util.Scanner;
import java.util.Random;

public class App {
	
	public static void main (String []   args) {
		String[] words = {"Banana", "Apple", "Orange", "Mango","Peach","Plum", "Kiwi","Cherry"}; //Guessed Words
		String word = words [(int) (Math.random() * words.length)];
		String random = new string(new char[word.length()]).replace("\0", "*");
		int count = 0;
		
		Scanner sc = new scanner(System.in);
		
		while (count < 7 && random contains ("*")) {
		System.out.println("Welcome, Lets Play Hangman!");
		System.out.println("Guess A Letter! You Have Seven Tries.");
		System.out.println (random);
		String guess = sc.next();
		hang (guess);
		
		}
		sc.close();
		
	}
	
	public static void hang(String guess) {
		String randomtwo = "";
		for (int i=0; i < word.length (); i++) { //User types in a letter
			if (word.charAt(i) == guess.charAt(0) {
				randomtwo += guess.charAt(0);
			} else if (random.charAt (i) != '*' {
					randomtwo += word.charAt (i); //Check if letter exists within the word
			} else {
					randomtwo += "*" //If correct, print letter within the now resolved area
			}
		} 
		
		
		
			
		if (random.equals(randomtwo)) {
			count++;
			hmimage(); //added hangman image
		} else {
				random = randomtwo
		}
		if (random.equals(word)) {
				System.out.println ("You've won! The word was" + word); //finished game (won)
			
			}
		
		}
		
		
		public static void hmimage() {
			if (count == 1) {
				System.out.println ("Wrong! Try Again!"); //If incorrect, print "Wrong! Try Again!"
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(___);
			}
		
			if (count == 2) {
				System.out.println ("Wrong! Try Again!"); //If incorrect, print "Wrong! Try Again!"
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println( "|" )
				System.out.println("___");
			}
		
			if (count == 3) {
				System.out.println ("Wrong! Try Again!"); //If incorrect, print "Wrong! Try Again!"
				System.out.println();
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("___");
			}
		
			if (count == 4) {
				System.out.println ("Wrong! Try Again!"); //If incorrect, print "Wrong! Try Again!"
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("___");
			}
		
			if (count == 5) {
				System.out.println ("Wrong! Try Again!"); //If incorrect, print "Wrong! Try Again!"
				System.out.println("____________")
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("___");
			}
			if (count == 6) {
				System.out.println ("Wrong! Try Again!"); //If incorrect, print "Wrong! Try Again!"
				System.out.println("____________")
				System.out.println("|           _|_");
				System.out.println("|          /   \\");
				System.out.println("|         |     |");
				System.out.println("|         \\_ _/");
				System.out.println("___          |");
			}
			if (count == 7) {
				System.out.println ("Wrong! Try Again!"); //If incorrect, print "Wrong! Try Again!"
				System.out.println("____________")
				System.out.println("|           _|_");
				System.out.println("|          /   \\");
				System.out.println("|         |     |");
				System.out.println("|         \\_ _/");
				System.out.println("___          |");
				System.out.println("            / \\")
			    System.out.println("           /   \\")
			}   //Finished Game (Lost)
			
			
			
    }
		
		
		
}