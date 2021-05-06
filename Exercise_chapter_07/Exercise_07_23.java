/*
  A school has 100 lockers and 100 students. All lockers are closed on the first
  day of school. As the students enter, the first student, denoted S1, opens
  every locker. Then the second student, S2, begins with the second locker,
  denoted L2, and closes every other locker. Student S3 begins with the third
  locker and changes every third locker (closes it if it was open, and opens it
  if it was closed). Student S4 begins with locker L4 and changes every fourth
  locker. Student S5 starts with L5 and changes every fifth locker, and so on,
  until student S100 changes L100.
  After all the students have passed through the building and changed the
  lockers, which lockers are open? Write a program to find your answer and
  display all open locker numbers separated by exactly one space.
*/
public class Exercise_07_23 {
    public static void main(String[] args){
        boolean[] lockers = new boolean[101];
        toggle(lockers);
        print(lockers);
    }
    //Method to perform the toggle lockers
    public static void toggle(boolean[] array){
        for(int i = 1; i < array.length; ++i){
            for(int j = i; j < array.length; j += i){
                array[j] = !array[j];
            }
        }
    }

    //Method to print the array
    public static void print(boolean[] array){
        for(int i = 1; i < array.length; i++){
            if(array[i]){
                System.out.print(i + " ");
            }
        }
    }
}
