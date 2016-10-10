
package pack;

/**
 * Title : Highly divisible triangular number
 * URL : https://projecteuler.net/problem=12
 * Time : Thu, 6 Oct 2016, 22:32
 * Problem Statement : The sequence of triangle numbers is generated by adding the natural numbers.<br>
 * Goal : What is the value of the first triangle number to have over five hundred divisors?
 * @author Shriram Prajapat & Shirish Padalkar
 */

public class Problem12 {
    
    public static void main(String[] args) {
        long sum = 0L;
        
        for (long i = 0; countDivisors(sum)<500; i++) {
                sum += i;
        }
        System.out.println("The first triangle number to have over five hundred divisors : "+sum);
    }
    
    static int countDivisors(long number){
        int divisors = 1;
        long limit = Math.round(Math.sqrt(number));
        for(long i=1; i <= limit; i++){
            if(number%i==0){
                divisors +=2;
            }
        }
        return divisors;
    }
    
}