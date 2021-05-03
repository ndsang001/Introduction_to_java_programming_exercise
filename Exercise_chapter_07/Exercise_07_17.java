/*********************************************************************************
* (Sort students) Write a program that prompts the user to enter the number of  *
* students, the students’ names, and their scores, and prints student names in  *
* decreasing order of their scores.                                             *
*********************************************************************************/
import java.util.Scanner;

public class Exercise_07_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Obtain number of students
        System.out.print("Enter the number of students: ");
        String[] studentName = new String[input.nextInt()];
        double[] studentScore = new double[studentName.length];
        //Obtain student's names
        System.out.print("Enter student's names: ");
        for(int i = 0; i < studentName.length; ++i){
            studentName[i] = input.next();
        }
        //Obtain student's scores
        System.out.print("Enter students' scores: ");
        for(int i = 0; i < studentScore.length; ++i){
            studentScore[i] = input.nextDouble();
        }
        //Execute the sort method
        sortStudent(studentName, studentScore);
        //Print the result
        for(int i = 0; i <studentName.length; ++i){
            System.out.printf("%s\t%.1f\n", studentName[i], studentScore[i]);
        }
        input.close();
    }
    //Method to sort the list
    public static void sortStudent(String[] studentName, double[] studentScore){
        for(int i = 0; i < studentScore.length; ++i){
            //Assign the highest score and respective name to be the number and name at index i
            double max = studentScore[i];
            String name = null;
            int maxIndex = i; //Max index to store the index of highest score
            
            for(int j = i + 1; j < studentScore.length; ++j){
                //Compare the highest score to the rest scores in list
                if(max < studentScore[j]){
                    //The higher score would be stored as highest score
                    max =  studentScore[j];
                    name = studentName[j]; //The name of student having the higher score also be stored
                    maxIndex = j; //maxIndex now also be changed
                }
            }

            if(maxIndex != i){
                //The student score at maxIndex now would be assigned with the score at index i 
                studentScore[maxIndex] = studentScore[i];
                studentScore[i] = max; //The max score is pushed up to the i position
                studentName[maxIndex] = studentName[i]; //The respective names also be treated with the same method
                studentName[i] = name;
            }
        }
    }
}
