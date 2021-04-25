/*
(Estimate p) p can be computed using the following series:
m(i) = 4(1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + ... + (((-1)^i + 1) / (2i - 1)))
Write a method that returns m(i) for a given i and write a test program that displays
the following table:
*/
package Exercise_chapter_06;

import static java.lang.Math.pow;
import java.util.Scanner;
/**
 *
 * @author Erick Nick
 */
public class Exercise_06_14 {
    public static void main(String[] args){
        //Declare the object and initialize 
        //with predefined standard input object
        Scanner input =  new Scanner(System.in);
        //Get input from user
        System.out.print("Enter a integer number: ");
        int number = input.nextInt();
        //Print the output
        System.out.println("The value of pi with i = " + number + " is " + pi(number));
        
        System.out.println("\ni           m(i)     ");
	    System.out.println("---------------------");
	    //Iterative loop for printing pi value
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-12d", i);
            System.out.printf("%-6.4f\n", pi(i));
	    }
        //Close the input object to prevent data leak
        input.close();
    }
    //pi method for calculating pi value
    public static double pi(int i){
        double x = 0;
        double piValue = 4;
        //Iterative loop for 
        for(int j = 1; j <= i; ++j){
            //Finding pi value formula
            x += (pow(-1,j+1)/(2*j-1));
        
        }
        return piValue*x;
    }
}
