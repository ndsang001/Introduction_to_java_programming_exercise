package Exercise_chapter_06;

import java.util.Scanner;

public class Exercise_06_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char character;
        String translatedNumber = "";
        //Get the input number as a string
        System.out.print("Enter your number as a string: ");
        String inputString = input.nextLine();

        for(int i = 0; i < inputString.length(); ++i){
            character = inputString.charAt(i);
            if(!Character.isLetterOrDigit(character) || Character.isDigit(character)){
                translatedNumber += character; 
                continue;
            } else{
                translatedNumber += getNumber(Character.toUpperCase(character));
            }
        }

        System.out.println(translatedNumber);
        
        input.close();
    }

    public static int getNumber(char uppercaseLetter){
        switch(uppercaseLetter){
            case 'A':
            case 'B':
            case 'C':
                return 2;
            case 'D':
            case 'E':
            case 'F':
                return 3;
            case 'G':
            case 'H':
            case 'I':
                return 4;
            case 'J':
            case 'K':
            case 'L':
                return 5;
            case 'M':
            case 'N':
            case 'O':
                return 6;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                return 7;
            case 'T':
            case 'U':
            case 'V':
                return 8;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                return 9;
        }
        return 0;
    }

    //An optimal method of author "jsquared21"
    /** Method getNumber returns a number, given an uppercase letter */
	/*public static int getNumber(char uppercaseLetter) {
		// Return the character's number reference in the international 
		// standard letter/number mapping for telephones
		if (uppercaseLetter >= 'W')
			return 9;
		else if (uppercaseLetter >= 'T')
			return 8;
		else if (uppercaseLetter >= 'P')
			return 7;
		else if (uppercaseLetter >= 'M')
			return 6;
		else if (uppercaseLetter >= 'J')
			return 5;
		else if (uppercaseLetter >= 'G')
			return 4;
		else if (uppercaseLetter >= 'D')
			return 3;
		else 
			return 2;
	}*/
}
