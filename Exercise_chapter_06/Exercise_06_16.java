package Exercise_chapter_06;

import java.util.Scanner;

public class Exercise_06_16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year your want to know the number of days: ");
        int year = input.nextInt();
        //Print number of days in the input year
        System.out.print("The number of days in " + year 
        + " is " + numberOfDaysInAYear(year));

        input.close();
    }
    //Method to return the number of days in the input year
    public static int numberOfDaysInAYear(int year){
        //Check whether the input year is a leap or not
        if(year%4 == 0 && year%100 != 0){
            return 366;
        } 
        //Check whether the input year is a leap or not
        if(year%100 == 0 && year%400 == 0){
            return 366;
        } 

        return 365;
    }
}
