
package pack;

/**
 * Title : Number letter counts
 * URL : https://projecteuler.net/problem=17
 * Time : Thu, 11 Oct 2016  11:36
 * Goal : If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * @author Shriram Prajapat & Shirish Padalkar
 */

public class Problem17 {
    
    public static void main(String[] args) {
        
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += countLetters(i);
            if((i>100 && i<1000) && i!=200 && i!=300 && i!=400 && i!=500 && i!=600 && i!=700 && i!=800 && i!=900){
                 sum += 3;
            }
            System.out.println();
        }
      
        System.out.println("The sum of the digits is : "+sum);
    }
    
    public static int countLetters(int number){
        
        if(number<21){
            return spellNumber(number).length();
        }else
        if(number<100){
            return spellNumber(number%10).length()+((spellNumber((number/10)*10)).length());
        }else
        if(number <1000){
            return countLetters(number%100)+(spellNumber((number/100)*100).length());
        }else{
            return spellNumber(number).length();
        }
        
    }
    
    public static String spellNumber(int number){
        
        switch(number){
            case 1 : return "One";
            case 2 : return "Two";
            case 3 : return "Three";
            case 4 : return "Four";
            case 5 : return "Five";
            case 6 : return "Six";
            case 7 : return "Seven";
            case 8 : return "Eight";
            case 9 : return "Nine";
            case 10 : return "Ten";
            case 11 : return "Eleven";
            case 12 : return "Twelve";
            case 13 : return "Thirteen";
            case 14 : return "Fourteen";
            case 15 : return "Fifteen";
            case 16 : return "Sixteen";
            case 17 : return "Seventeen";
            case 18 : return "Eighteen";
            case 19 : return "Nineteen";
            case 20 : return "Twenty";
            case 30 : return "Thirty";
            case 40 : return "Foutry";
            case 50 : return "Fifty";
            case 60 : return "Sixty";
            case 70 : return "Seventy";
            case 80 : return "Eighty";
            case 90 : return "Ninty";
            case 100 : return "OneHundred";
            case 200 : return "TwoHundred";
            case 300 : return "ThreeHundred";
            case 400 : return "FourHundred";
            case 500 : return "FiveHundred";
            case 600 : return "SixHundred";
            case 700 : return "SevenHundred";
            case 800 : return "EightHundred";
            case 900 : return "NineHundred";
            case 1000 : return "OneThousand";
            default : return "";
        }
    }
}
