
package pack;

/**
 * Title : Largest palindrome product
 * URL : https://projecteuler.net/problem=4
 * Time : Wed, 5 Oct 2016, 12:05
 * Problem Statement : A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.<br>
 * Goal : Find the largest palindrome made from the product of two 3-digit numbers.
 * @author Shriram Prajapat & Shirish Padalkar
 */

public class Problem4 {
    
    public static void main(String[] args) {
        int largest = 0;
        for (int i = 900; i < 999; i++) {
            for (int j = 900; j < 999; j++) {
                if(isPalindrome(String.valueOf(i*j))) largest = i*j;
            }    
        }
        System.out.println("The largest palindrome made from the product of two 3-digit numbers is : "+largest);
    }
  
    
  static boolean isPalindrome(String number){
      boolean b = true;
      int length = number.length();
      for (int i = 0; i < length/2; i++) {
          if(number.charAt(length-i-1) != number.charAt(i)){ b=false; }
      }
      return b;
  }
}
