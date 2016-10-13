package pack;

/**
 * Title : Counting Sundays
 * URL : https://projecteuler.net/problem=19
 * Time : Thu, 13 Oct 2016  10:00
 * Goal : How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 * @author Shriram Prajapat & Shirish Padalkar
 */
public class Problem19 {
 
    public static void main(String[] args){
       
        int day = 7;
        int month = 1;
        int year = 1900;
        int sundayCount = 0;
        int counter=0;
        
        while(year<2001){
            day++;
            counter++;
            if(counter==7){
                counter=0;
                if(year>1900){
                     if(day==1)sundayCount++; 
                  }
            }
            System.out.println(day+"-"+month+"-"+year);
            if(day==getNoOfDays(month, year)){
                day=0;
                month++;
            }
            if(month>12){
                month=1;
                year++;
            }
        }
        System.out.println("Total number of Sundays are : "+sundayCount);
    }
    
    static int getNoOfDays(int month, int year){
        switch(month){
            case 1: return 31;
            case 2: return (year%4==0)?29:28;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
            default: return 0;
        }
    }
}