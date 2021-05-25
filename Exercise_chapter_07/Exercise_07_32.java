import java.util.Scanner;

public class Exercise_07_32 {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        //Obtain the list size
        System.out.print("Enter list size: ");
        int size = input.nextInt();
        //Obtain the list content
        System.out.print("Enter list content: ");
        int[] list = new int[size];
        for(int i = 0; i < size; i++){
            list[i] = input.nextInt();
        }

        partition(list);
        print(list);

        input.close();
    }

    //Method to perform partition
    public static int partition(int[] list){
        int pivot = list[0];
        int[] partitionList = new int[list.length];

        int leftIndex = 0;
        int rightIndex = list.length - 1;
        int currentIndex = 1;

        while(leftIndex <= rightIndex){
            //the loop would be end when the leftIndex = rightIndex
            if(leftIndex == rightIndex){
                partitionList[leftIndex] = pivot;
                ++leftIndex;
                --rightIndex;
                break;
            }
            //Comparing the currentIndex value with the pivot and exchange the values
            if(list[currentIndex] <= pivot){
                partitionList[leftIndex] = list[currentIndex];
                ++leftIndex;
            } else{
                partitionList[rightIndex] = list[currentIndex];
                --rightIndex;
            }

            ++currentIndex;
        }
        
        //Copy partition list into the list array
        for(int i = 0; i < list.length; ++i){
            list[i] = partitionList[i];
        }

        return 0;
    }

    //Method print the list array
    public static void print(int[] list){
        for(int e: list){
            System.out.print(e + " ");
        }
    }
}
