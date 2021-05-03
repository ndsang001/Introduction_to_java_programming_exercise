import java.util.Scanner;

public class Exercise_07_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        //Obtain 10 numbers
        System.out.print("Enter 10 number: ");
        for(int i = 0; i < 10; ++i){
            array[i] = input.nextDouble();
        }
        //Execute the bubble sort algorithm
        bubbleSort(array);
        //Print the array after sorting
        for(double e: array){
            System.out.print(e + " ");
        }
        input.close();
    }
    //Method to sort the array by bubblesort method
    public static void bubbleSort(double[] array){
        for(int i = 0; i < array.length - 1; ++i){
            for(int j = 0; j < array.length-i-1; ++j){
                    if(array[j] > array[j+1]){
                        double temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
            }
        }
    }
}
