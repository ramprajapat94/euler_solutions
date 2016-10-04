
package pack;

/**
 * Title : Multiples of 3 and 5
 * URL : https://projecteuler.net/problem=1
 * Time : Tue, 4 Oct 2016, 18:28
 * Problem Statement : If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.<br>
 * Goal : Find the sum of all the multiples of 3 or 5 below 1000.
 * @author Shriram Prajapat & Shirish Padalkar
 */

public class Problem1 {
    
    public static void main(String[] args) {
        int limit = 1000;
        int sum=0;
        for(int i=0; i<limit; i++){
            if(i%3==0 || i%5==0){ sum += i;}
        }
        System.out.println("The sum of all the multiples of 3 or 5 below "+limit+" is : "+sum);
    }
    
}
