
package pack;

/**
 * Title : 10001st prime
 * URL : https://projecteuler.net/problem=7
 * Time : Wed, 5 Oct 2016, 23:35
 * Problem Statement : By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13<br>
 * Goal : What is the 10 001st prime number?
 * @author Shriram Prajapat & Shirish Padalkar
 */


public class Problem7 {
 
    public static void main(String[] args) {
        int counter = 0;
        int primeNumber = 0;
        for (int i = 2; ; i++) {
            if(isPrime(i)){
                counter++;
                if(counter==10001){
                    primeNumber = i;
                    break;
                }
            }
        }
        System.out.println("10001st prime number is : "+primeNumber);
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
