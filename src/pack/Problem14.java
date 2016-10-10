
package pack;

/**
 * Title : Longest Collatz sequence
 * URL : https://projecteuler.net/problem=14
 * Time : Thu, 9 Oct 2016  18:13
 * Goal : Which starting number, under one million, produces the longest chain?
 * @author Shriram Prajapat & Shirish Padalkar
 */

public class Problem14 {
    
    public static void main(String[] args) {
        
        long largest = 0;
        long largestTerm = 1;
        
        for(long i = 500000L; i<1000000; i++){
            long term = i, count = 1;
            while(term!=1){
                if(term%2==0){
                    term = term/2;
                }else{
                    term = (term*3)+1;
                }
                count++;
            }
            if(count>largest){
                largest = count;
                largestTerm = i;
            }
         }
         System.out.println("\n\n"+largest+" \nTerm : "+largestTerm);
    }
    
}
