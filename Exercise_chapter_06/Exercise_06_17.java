package Exercise_chapter_06;

import java.util.Scanner;

public class Exercise_06_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        int number = input.nextInt();

        generateMatrix(number);

        input.close();
    }

    public static void generateMatrix(int number){
        int randomNum;
        
        for(int i = 0; i < number ; ++i){
            for(int j = 0; j < number; ++j){
                randomNum = (int)(Math.random() * 2);
                if(j == (number - 1)){
                    System.out.println(randomNum);
                } else {
                    System.out.print(randomNum + " ");
                }
            }
        } 
    }

}
