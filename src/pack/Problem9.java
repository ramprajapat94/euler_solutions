
package pack;

/**
 * Title : Special Pythagorean triplet
 * URL : https://projecteuler.net/problem=9
 * Time : Thu, 6 Oct 2016, 04:34
 * Problem Statement : A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
        a2 + b2 = c2
        For example, 32 + 42 = 9 + 16 = 25 = 52.<br>
 * Goal : There exists exactly one Pythagorean triplet for which a + b + c = 1000.
          Find the product abc.
 * @author Shriram Prajapat & Shirish Padalkar
 */

public class Problem9 {
    
    public static void main(String[] args) {
        
        int product = 0;
        for (int i = 0; i < 500; i++) {
            for (int j = 0; j < 500; j++) {
                for (int k = 0; k < 500; k++) {
                    if(i+j+k==1000){
                        if((i*i)+(j*j)==(k*k)){
                            product = i*j*k;
                        }
                    }
                }
            }
        }
        System.out.println("The product of abc : "+product);
    }
    
}
