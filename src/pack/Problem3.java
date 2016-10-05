
package pack;


/**
 * Title : Largest prime factor
 * URL : https://projecteuler.net/problem=3
 * Time : Wed, 5 Oct 2016, 11:30
 * Problem Statement : The prime factors of 13195 are 5, 7, 13 and 29.<br>
 * Goal : What is the largest prime factor of the number 600851475143 ?
 * @author Shriram Prajapat & Shirish Padalkar
 */

public class Problem3 {
    
    public static void main(String[] args) {
        long number = 600851475143l;
        long largest = 0;
        
        for(long i = 3; i <= number ; i+=2 ) {
            if ( number % i == 0 ) {
                number /= i;
                largest = i;
            }   
        }
        
        System.out.println("The largest prime factor of the number 600851475143 : "+largest);
    }
    
}
