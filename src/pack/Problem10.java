
package pack;

/**
 * Title : Summation of primes
 * URL : https://projecteuler.net/problem=10
 * Time : Thu, 6 Oct 2016, 16:38
 * Problem Statement : The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.<br>
 * Goal : Find the sum of all the primes below two million.
 * @author Shriram Prajapat & Shirish Padalkar
 */

public class Problem10 {
    
    public static void main(String[] args) {
        long sum = 0L;
        
        for (long i = 2; i<2000000; i++) {
            if(isPrime(i)){
                sum += i;
            }
            System.out.println(i);
        }
        System.out.println("Sum of the prime numbers is : "+sum);
    }
    
    static boolean isPrime(long number){
        boolean prime = true;
        long limit = number/2;
        for(long i=2; i <= limit; i++){
            if(number%i==0){
                prime = false;
                break;
            }
        }
        return prime;
    }
    
}
