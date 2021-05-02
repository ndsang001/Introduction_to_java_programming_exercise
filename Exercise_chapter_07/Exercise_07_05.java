/**The number of even numbers and odd numbers 
 * Write a program that reads ten integers, and then display the number of even numbers and odd numbers.
 * Assume that the input ends with 0.
 */
import java.util.Scanner;

public class Exercise_07_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Intialize the MAX_LENGTH of array
        final int MAX_LENGTH = 20;
        int[] numbers = new int[MAX_LENGTH];
        int count = 0;

        System.out.print("Enter numbers: ");
        int number = input.nextInt();
        //Obtain and store input number into array numbers[]
        while(number != 0 && count != MAX_LENGTH){
            numbers[count] = number;
            ++count;
            number = input.nextInt();
        }
        //Get the number of even numbers by passing array and last index of input 
        int numberOfeven = countEvenNumber(numbers, count);
        //Print out the results
        System.out.println("The number of even numbers: " + numberOfeven);
        System.out.println("The number of odd numbers: " + (count - numberOfeven));
        
        input.close();
    }    
    //Obtain the number of even numbers
    public static int countEvenNumber(int[] numbers, int length){
        int count = 0;
        for(int i = 0; i <= length; ++i){
            if(numbers[i] % 2 == 0 && numbers[i] != 0){
                ++count;
            }
        }
        return count;
    }
}
