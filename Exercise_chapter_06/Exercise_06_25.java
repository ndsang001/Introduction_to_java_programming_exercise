/*
(Convert milliseconds to hours, minutes, and seconds) Write a method that converts
milliseconds to hours, minutes, and seconds using the following header:
public static String convertMillis(long millis)
The method returns a string as hours:minutes:seconds. For example,
convertMillis(5500) returns a string 0:0:5, convertMillis(100000) returns
a string 0:1:40, and convertMillis(555550000) returns a string 154:19:10.
*/
package Exercise_chapter_06;

import java.util.Scanner;

public class Exercise_06_25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Obtain millisesonds value
        System.out.print("Enter milliseconds: ");
        long milliseconds = input.nextLong();

        System.out.println(convertMillis(milliseconds));

        input.close();
    }

    //Method to obtain the expected time
    public static String convertMillis(long totalMilliSeconds){
        //Obtain the total seconds
        long totalSeconds = totalMilliSeconds / 1000;
        //Obtain the current second
        long currentSecond = totalSeconds % 60;
        //Obtain the total minutes
        long totalMinutes = totalSeconds / 60;
        //Obtain the current minute
        long currentMinutes = totalMinutes % 60;
        //Obtain the total hours
        long totalHours = totalMinutes / 60;
        
        String currentTime = totalHours + ":" + currentMinutes + ":" + currentSecond;;

        return currentTime;
    }
}
