//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        int wer  = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "flab", JOptionPane.YES_NO_OPTION);
        if (wer == 0) {
        isWeekday = true	;
        }
        else {
        	isWeekday = false;
        }
        
    int werw  = JOptionPane.showConfirmDialog(null, "Is it a vacation??", "flab", JOptionPane.YES_NO_OPTION);
        if (werw == 0) {
        isVacation = true	;
        }
        else {
        	isVacation = false;
        }
    if(isWeekday == true) {
     	System.out.println("get up l a  z   y    b     o      n       e        s");
   if(isVacation == true || isWeekday == false ) { 	
	   System.out.println("sleep in");
   
   }
    }
    if(isVacation == true) {
    System.out.println("sleep in");	
    }
    
    
    
  if(isWeekday == false) {
System.out.println("sleep in");
    	}
}
    	
    }
    
    
    
   
                /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
   */
    



    

