/*
  Write a program that generates an array of number from 1 to 100,000,000 in ascending order. 
  Estimate the execution time of invoking linearSearch method in
  Listing 7.6. Sort the array and estimate the execution time of invoking the
  binarySearch method in Listing 7.7. You can use the following code template
  to obtain the execution time:
  long startTime = System.currentTimeMillis();
  perform the task;
  long endTime = System.currentTimeMillis();
  long executionTime = endTime - startTime;
*/
import java.util.Scanner;

public class Exercise_07_16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Assign the MAX length
        final int MAX = 100000000;
        int[] array = new int[MAX];
        //Generate an array
        for(int i = 0; i < MAX; ++i){
            array[i] = i + 1;
        }
        //Obtain the key number
        System.out.print("Enter expected number: ");
        int number = input.nextInt();
        //Run the linear search
        long startTime = System.nanoTime();
        int result = linearSearch(array, number);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        //Run the binary search
        long startTime2 = System.nanoTime();
        int result2 = binarySearch(array, number);
        long endTime2 = System.nanoTime();
        long executionTime2 = endTime2 - startTime2;
        //Print the results
        if(result > -1){
            System.out.println("The number is found at index " + result);
        } else {
            System.out.println("The number is not found!");
        }
        System.out.println("The execution time of linear search is: " + executionTime + "ms");

        if(result2 > -1){
            System.out.println("The number is found at index " + result2);
        } else {
            System.out.println("The number is not found!");
        }
        System.out.println("The execution time of binary search is: " + executionTime2 + "ms");

        input.close();
    }
    //Method to search a key number by linear search
    public static int linearSearch(int[] array, int number){
        for(int i = 0; i < array.length; ++i){
            //Compare key number with next values linearly
            if(number == array[i]){
                return i;
            }
        }
        return -1;
    }
    //Method to search a key number by binary search
    public static int binarySearch(int[] array, int number){
        int high = array.length - 1;
        int low = 0;

        while(high >= low){
            //Calculate the midle index
            int mid = (high + low) / 2;
            //The method returns the mid index as index of key number
            if(array[mid] == number){
                return mid;
            } else if(number < array[mid]){
                high = mid - 1;
            } else{
                low = mid + 1;
            }

        }
        //If no, return the index that the key number should be assigned
        return - low - 1; 
    } 
}
