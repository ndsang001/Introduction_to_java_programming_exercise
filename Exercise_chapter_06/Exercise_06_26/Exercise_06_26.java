/*
(Palindromic prime) A palindromic prime is a prime number and also palindromic.
For example, 131 is a prime and also a palindromic prime, as are 313 and
757. Write a program that displays the first 100 palindromic prime numbers. Display
10 numbers per line, separated by exactly one space, as follows:
2 3 5 7 11 101 131 151 181 191
313 353 373 383 727 757 787 797 919 929
...
*/
package Exercise_chapter_06.Exercise_06_26;

public class Exercise_06_26 {
    public static void main(String[] args){
        //Assign a constant value for the first 120 palindromic prime number
        final int PALINDROMIC_PRIME_NUMBER = 121;
        int count = 1;
        int i = 2;
        //Use while loop to print 12 rows of number
        while(count < PALINDROMIC_PRIME_NUMBER){
            if(checkPalindromicPrime(i)){
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
    //Method to invoke isPrime and isPalindromic methods from check classes
    public static boolean checkPalindromicPrime(int i){
        return checkPrime.isPrime(i) && checkPalindromic.isPalindromic(i);
    }
}
