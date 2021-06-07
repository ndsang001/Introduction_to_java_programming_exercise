import java.util.HashSet;
import java.util.Scanner;

public class Exercise_07_35 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //words in the array
        String[] words = {"write", "read", "long", "short", "black", "program"};
        //obtain random word from the words list
        String word = getWord(words);
        //Continue or stop the game
        String gameContinue;

        do{
            guess(word, input);
            
            // Ask the user whether to continue to play with another word
			System.out.println("Do you want to guess another word? Enter y or n >");
			gameContinue = input.next();

        }while(gameContinue.equals("y"));

        input.close();
    }

    //method to let user guess the word
    public static void guess(String word, Scanner input){
        HashSet<String> guessLetter = new HashSet<>();
        int missingTime = 0;
        do{
            String s = getLetter(input, guessLetter, word);
            if(!isInWord(word, s, guessLetter)){
                ++missingTime;
            }

        } while(!gameEnd(word, guessLetter));
        System.out.println("The word is " + word + "." + " You missed " + missingTime + " time");
    }

    //method to add the correct guess to the guessLetter list
    public static boolean isInWord(String word, String s, HashSet<String> guessLetter){
        if(guessLetter.contains(s)){
            System.out.println(s + " is already in the word!");
            return true;
        } else if(word.contains(s)){
            guessLetter.add(s);
            return true;
        } else{
            System.out.println(s + " is not in the word!");
            return false;
        }
    }

    //method to get the guess letter 
    public static String getLetter(Scanner input, HashSet<String> guessLetter, String word){
        System.out.print("(Guess) Enter a letter in word " + concatLetter(word, guessLetter) + " > ");
        return input.next();
    }
    
    //method to check game is end?
    public static boolean gameEnd(String word, HashSet<String> guessLetter){
        return word.equals(concatLetter(word, guessLetter));
    }

    //method to concat the guess letter
    public static String concatLetter(String word, HashSet<String> guessLetter){
        //We could use wordSplit to split the word into its separated characters
        //String[] wordSplit = word.split("");
        //We could use String builder to build a String by appending each character and then returning by toString method
        //StringBuilder s = new StringBuilder();
        String concatString = "";
        for(int i = 0; i < word.length(); ++i){
            String letter  = "" + word.charAt(i);
            if(guessLetter.contains(letter)){
                concatString += letter;
            } else{
                concatString += asterisk();
            }
        }
        return concatString;
    }
    
    //method to get the word to play game
    public static String getWord(String[] words){
        String word = words[(int)(Math.random()*words.length)];
        //System.out.println(word);
        return word;
    }

    //method to print an asterisk
    public static String asterisk(){
        return String.format("*");
    }

    //method to check the letter
    public static boolean check(String word, String letter){
        if(word.contains(letter)){
            return true;
        }
        return false;
    }
}
