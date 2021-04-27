/*
(Display current date and time) Listing 2.7, ShowCurrentTime.java, displays the
current time. Improve this example to display the current date and time. The calendar
example in Listing 6.12, PrintCalendar.java, should give you some ideas on
how to find the year, month, and day.
*/
package Exercise_chapter_06;

//Easy way by using Date library
//import java.util.Date;
import java.util.Scanner;

public class Exercise_06_24 {
    public static void main(String[] args){
       
        /*Date currentDate = new Date();
        System.out.println(currentDate);*/

        Scanner input = new Scanner(System.in);
        //Obtain time zone
        System.out.print("Enter your expected time zone: ");
        int timeZone = input.nextInt();
        
        //Print current time
        System.out.println(currentTime(timeZone));

    } 
    
    //Method to obtain the current time
    public static String currentTime(int timeZone){
        //Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliSeconds = System.currentTimeMillis();
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
        //Obtain the current hour
        long currentHours = totalHours % 24;
        //Calculate the current hour according to the time zone
        currentHours += timeZone;
        
        String currentTime = "";
        //Set the AM and PM
        if(currentHours > 24){
            currentHours -= 24;
        }

        if(currentHours > 12){
            currentHours -= 12;
            currentTime += currentHours + "PM:";
        } else{
            currentTime += currentHours + "AM:";
        }
        
        currentTime += currentMinutes + ":" + currentSecond;
        
        return currentTime;
    }
    
    //Methods to get date, month and year according to the book and author "jsquared21"

    /** Method date **************************************************************/
	public static String date() {
		
		return year() + "";
	}

	/** Method year returns the current year *************************************/
	public static int year() {
		// Obtain the current year
		int currentYear = 
			(int)(System.currentTimeMillis() / millisecondPerYear()) + 1970;
		
		return currentYear;
	}

	/** Method month returns the current month ***********************************/
	public static int month() {
		// Obtain the current month
		int currentMonth =
			(int)((System.currentTimeMillis() % millisecondPerYear()) 
			/ millisecondsPerMonth());
		return currentMonth + 1;
	}

	/** Method day returns the current day ***************************************/
	public static int day(){
		// Obtain the current day
		return  getTotalNumberOfDays(year(), month());
	}

	/** Method millisecondPerYear */
	public static double millisecondPerYear() {
		return 3.15569E10;
	}

	/** Method millisecondsPerMonth */
	public static double millisecondsPerMonth() {
		return 2.63E9;
	}

	/** Get the total number of days since January 1, 1800 */
	public static int getTotalNumberOfDays(int year, int month) {
		int total = 0;	
		// Get the total days from 1800 to 1/1/year
		for (int i = 1800; i < year; i++)
		if (isLeapYear(i))
		total = total + 366;
		else
		 total = total + 365;
		
		// Add days from Jan to the month prior to the calendar month
		for (int i = 1; i < month; i++)
		total = total + getNumberOfDaysInMonth(year, i);
		
		return total;
	}

	/** Method isLeapyear */
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 400 != 0);
	}

	/** Get the number of days in a month */
	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 ||
		month == 8 || month == 10 || month == 12)
		return 31;
	
		if (month == 4 || month == 6 || month == 9 || month == 11)
		return 30;
	
		if (month == 2) return isLeapYear(year) ? 29 : 28;
		
		return 0; // If month is incorrect
	}
    
}
