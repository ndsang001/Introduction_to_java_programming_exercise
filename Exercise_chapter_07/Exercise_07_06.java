/**The Sieve of Eratosthenes is an algorithm that finds all prime numbers up to a given limit, n.
 * It works by creating an array of Booleans, flag, of size n + 1, 
 * initializing the array to true(Assuming every number is a prime number in the beginning),
 * and iteratively traversing the numbers from 2 to n, setting the values of indices that are multiples of other numbers to false.
 * Write a program using the algorithm above, and display all the prime numbers, up to 50.
 */
public class Exercise_07_06 {
    public static void main(String[] args){
        final int MAX = 50;
        boolean[] prime = new boolean[MAX + 1];

        for(int i = 2; i <= MAX; ++i){
            prime[i] = true;
        }
            
        isPrime(prime, MAX);

        for(int i = 2; i <= MAX; ++i){
            if(prime[i] == true)
                System.out.print(i + " ");
        }
        
    }

    public static boolean[] isPrime(boolean[] number, int max){
        for(int i = 2; i*i <= max; ++i){
            if(number[i] == true){
                for(int p = i*i; p <= max; p += i){
                    number[p] = false;
                }
            }
        }
        return number;
    }
}