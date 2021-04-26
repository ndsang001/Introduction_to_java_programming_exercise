/*
(Check password) Some websites impose certain rules for passwords. Write a
method that checks whether a string is a valid password. Suppose the password
rules are as follows:
■ A password must have at least eight characters.
■ A password consists of only letters and digits.
■ A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid
Password if the rules are followed or Invalid Password otherwise.
*/
package Exercise_chapter_06;

import java.util.Scanner;

public class Exercise_06_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Get the input password
        System.out.print("Enter your password: ");
        String password = input.nextLine();
        //Print the evaluation of password
        
        System.out.println((checkPassword(password)? "Valid" : "Invalid") + " Password");
        
        //Close the input object
        input.close();
    }
    //Method to check the validation of password
    public static boolean checkPassword(String password){
        int countDigits = 0;
        
        //Password must have at least 10 characters
        if(password.length() < 10){
            return false;
        } 

        for(int i = 0; i < password.length(); ++i){
            //Save each charater of string to check
            char character =  password.charAt(i);
            //Check character at index "i" is a digit?
            if(Character.isDigit(character)){
                ++countDigits;
            }
            //Password must only contain letters and digits
            if(!Character.isLetterOrDigit(character)){
                return false;
            }
        }
        //Password must have at least 3 digits
        if(countDigits < 3){
            return false;
        }

        return true;
    }

}
