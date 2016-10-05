
package pack;

/**
 * Title :Sum square difference
 * URL : https://projecteuler.net/problem=6
 * Time : Wed, 5 Oct 2016, 20:25
 * Problem Statement : The sum of the squares of the first ten natural numbers is,
                        12 + 22 + ... + 102 = 385

                        The square of the sum of the first ten natural numbers is,
                        (1 + 2 + ... + 10)2 = 552 = 3025

        Hence the difference between the sum of the squares of the first ten natural numbers 
        * and the square of the sum is 3025 − 385 = 2640.<br>
 * Goal : Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * @author Shriram Prajapat & Shirish Padalkar
 */

public class Problem6 {
    
    public static void main(String[] args) {
     int difference = 0, squaredSeriesSum = 0, seriesSumSquared = 0;
     
     int limit = 100;
     
     //square of sum of the first 'n' natural numbers
     int result = ( (limit*limit)/2 ) + ( limit/2 );
     seriesSumSquared = result*result;
     
     //sum of the square of the first 'n' natural numbers
     for (int i = 0; i <= limit; i++) {
        squaredSeriesSum += i*i;
     }
     
     //calculating difference
     difference = seriesSumSquared - squaredSeriesSum;
     
     System.out.println("The difference is : "+difference);
     
    }
    
}
