public class Exercise_08_04 {
    public static void main(String[] args){
        int[][] workingHours = {
            {2,4,3,4,5,8,8},
            {7,3,4,3,3,4,4},
            {3,3,4,3,3,2,2},
            {9,3,4,7,3,4,1},
            {3,5,4,3,6,3,8},
            {3,4,4,6,3,4,4},
            {3,7,4,8,3,8,4},
            {6,3,5,9,2,7,9}
        };

        print(workingHours);
    }

    //method to display employees and their total hours in increasing order
    public static void print(int[][] workingHours){
        //Print the week days
        System.out.printf("%17s%3s%4s%4s%4s%4s%5s%n%n", "Su", "M", "T",
         "W", "Th", "F", "Sa");
        for(int i = 0; i < workingHours.length; ++i){
            System.out.printf("%-10s%-5d", "Employee", i);
            for(int j = 0; j < workingHours[i].length; ++j){
                System.out.printf("%-4d", workingHours[i][j]);
            }
            System.out.println();
        }
    }
}