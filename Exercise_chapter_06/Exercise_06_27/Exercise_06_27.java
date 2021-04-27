package Exercise_chapter_06.Exercise_06_27;

import Exercise_chapter_06.Exercise_06_26.checkPrime;

public class Exercise_06_27 {
    public static void main(String[] args){
        //Assign a constant value for the first 120 palindromic prime number
        final int PALINDROMIC_PRIME_NUMBER = 121;
        int count = 1;
        int i = 13;
        //Use while loop to print 12 rows of number
        while(count < PALINDROMIC_PRIME_NUMBER){
            if(checkEmirp(i)){
                if(count % 10 == 0){
                    System.out.println(i);
                } else{
                    System.out.print(i + " ");
                }
                ++count;
            }
            ++i;
        }
    }
    //Method to check a number is Emirp or not
    public static boolean checkEmirp(int i){
        String number = i + "";
        String reverseNumber = "";
        //Obtain the reverse number of itself
        for(int j = number.length() - 1; j >= 0 ; --j){
            reverseNumber += number.charAt(j);
        }
        
        if(!number.equals(reverseNumber)){
            if(checkPrime.isPrime(i) && checkPrime.isPrime(Integer.parseInt(reverseNumber))){
                return true;
            }
        }   

        return false;
    }
}
