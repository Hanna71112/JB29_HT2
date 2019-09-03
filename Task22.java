package by.htp.les03.main;
// Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.  

import java.util.Scanner;

public class Task22 {
	
public static void main(String[] args) {
	int x = 4;
	int y = 4; 
    int c = x+0; 
    
    if (x < y)
    { 
    	x = y;
    	y = c;
    	System.out.println("x = "+x); 
    	System.out.println("y = "+y); 
  }
    else {
    	System.out.println("x = "+x); 
	    System.out.println("y = "+y); }
    	
}
}