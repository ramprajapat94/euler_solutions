
package pack;

/**
 * Title : Even Fibonacci numbers
 * URL : https://projecteuler.net/problem=2
 * Time : Tue, 4 Oct 2016, 18:43
 * Problem Statement : Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
                              1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...<br>
 * Goal : By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 * @author Shriram Prajapat & Shirish Padalkar
 */

public class Problem2 {
    
    public static void main(String[] args) {
        int seriesLimit = 4000000;  // 4 million
        int seriesTerm = 1;
        int evenSum = 0;
        
        int last = 0;
        while(seriesTerm<seriesLimit) {
            int temp = seriesTerm;
            seriesTerm = seriesTerm + last;
            last = temp;
            
            if(seriesTerm%2==0){ evenSum += seriesTerm;}    
        }
        System.out.println("The sum of the even-valued terms is : "+evenSum);
    }
    
}