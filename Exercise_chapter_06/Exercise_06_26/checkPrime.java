package Exercise_chapter_06.Exercise_06_26;

public class checkPrime {
    //Check the number is prime number or not
    public static boolean isPrime(int i){
        for(int j = 2; j <= i/2; ++j){
            if(i % j == 0){
                return false;
            }
        }
        
        return true;
    }
}
