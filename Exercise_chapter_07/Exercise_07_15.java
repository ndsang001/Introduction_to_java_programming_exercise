/**
********************************************************************************
* (Eliminate duplicates) Write a method that returns a new array by eliminating  *
* the duplicate values in the array using the following method header:           *
* public static int[] eliminateDuplicates(int[] list)                            *
* Write a test program that reads in ten integers, invokes the method, and       *
* displays the result.                                                           *
********************************************************************************
*/

import java.util.Scanner;

public class Exercise_07_15{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];
        
        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < 10; ++i){
            list[i] = input.nextInt();
        }
        //Assign new array being eliminated array
        int[] result = eliminateDuplicates(list);

        for(int i = 0; i < 10; ++i){
            if(result[i] > 0){
                System.out.print(result[i] + " ");
            }
        }
        input.close();
    }
    //Method to emilinate the duplicate number
    public static int[] eliminateDuplicates(int[] list){
        int[] result = new int[10];
        for(int i = 0; i < 10; ++i){
            if(isDistinct(list, list[i], i)){
               result[i] = list[i]; 
            }
        }
        return result;
    }
    //Method to check a number is distinct?
    public static boolean isDistinct(int[] list, int number, int index){
        for(int i = index + 1; i < list.length; i++){
            if(number == list[i]){
                return false;
            }
        }
        return true;
    }
}
