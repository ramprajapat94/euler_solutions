
package pack;

import java.math.BigInteger;

/**
 * Title : Power digit sum
 * URL : https://projecteuler.net/problem=16
 * Time : Thu, 11 Oct 2016  11:04
 * Goal : What is the sum of the digits of the number 2^1000?
 * @author Shriram Prajapat & Shirish Padalkar
 */

public class Problem16 {
    
    public static void main(String[] args) {
        int num = 2;
        int pow = 1000;
        
        BigInteger prod = BigInteger.valueOf(1);
        
        for (int i = pow; i >= 1; i--) {
            prod = prod.multiply(BigInteger.valueOf(num));
        }
        
        String ans = prod.toString();
        int len = ans.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += Integer.parseInt(ans.charAt(i)+"");
        }
        
        System.out.println("The sum of the digits is : "+sum);
    }
    
}
