package pack;

import java.math.BigInteger;

/**
 * Title : Factorial Digit Sum
 * URL : https://projecteuler.net/problem=20
 * Time : Thu, 13 Oct 2016  11:01
 * Goal : ind the sum of the digits in the number 100!
 * @author Shriram Prajapat & Shirish Padalkar
 */
public class Problem20 {
 
    public static void main(String[] args){
       int number = 100;
       BigInteger factorialResult = getFactorial(number);
       System.out.println("100! = "+factorialResult.toString());
       
       char resultArray[] = factorialResult.toString().toCharArray();
       int sum = 0;
       for (int i = 0; i < resultArray.length; i++) {
            sum += Integer.parseInt(resultArray[i]+"");
       }
       System.out.println("The sum of the digits in the number 100! is : "+sum);
    }
   
    static BigInteger getFactorial(int number){
        BigInteger factorial = BigInteger.ONE;
        for(int i=number; i>0; i--){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}