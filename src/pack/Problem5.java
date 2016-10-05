
package pack;

/**
 * Title :Smallest multiple
 * URL : https://projecteuler.net/problem=5
 * Time : Wed, 5 Oct 2016, 20:10
 * Problem Statement : 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.<br>
 * Goal : What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * @author Shriram Prajapat & Shirish Padalkar
 */

public class Problem5 {
    
    public static void main(String[] args) {
        boolean status = true;
        int num = 0;
        for (int i = 20; ; i++) {
            status = true;
            for (int j = 1; j < 21; j++) {
                if(i%j!=0){ status = false; break; }
            }
            if(status){num = i; break;}
        }
        System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 : "+num);
    }
    
}
