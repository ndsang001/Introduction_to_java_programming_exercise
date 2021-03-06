/*
(Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
isPrime(int number) method for testing whether a number is prime. Use this
method to find the number of prime numbers less than 10000.
*/
package Exercise_chapter_06;

public class Exercise_06_10{ 
    public static void main(String[] args){
        double kilogramList[] = new double[]{
            1.0, 3.0, 197.0, 199.0};
        double poundList[] = new double[]{
            20.0, 25.0, 510.0, 515.0};
            
        //Print the table objects
        System.out.printf("%-15s%-15s%-10s%-15s%-15s%n", "Kilograms", "Pounds", "|", "Pounds", "Kilograms");
        //Print the convert number between kilogram and pound
        for(int i = 0; i < 4; ++i){
            System.out.printf("%-15.0f%-15.3f%-10s%-15.0f%-15.3f%n", 
            kilogramList[i], convertToPound(kilogramList[i]),
            "", poundList[i], convertToKilogram(poundList[i]));
        }
    }
    //Method to convert kilogram to pound
    public static double convertToPound(double kilogram){
        return kilogram * 0.453;
    }
    //Method to convert pound to kilogram
    public static double convertToKilogram(double pound){
        return pound * 2.204;
    }
}