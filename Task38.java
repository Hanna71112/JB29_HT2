package by.htp.les03.main;
// Вычислить значение функции: 

import java.util.Scanner;

public class Task38 {
	
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
     System.out.print("Введите x: ");
     int x = in.nextInt();
	double F;
	
  	  if (x<=3 && x>=0)     {
  		  F = (Math.pow(x, 2));
	  	 System.out.println("F = "+F);}
  if (x>3 || x<0 ) {
	  F = 4;
         	 System.out.println("F = "+F);}
  
}
}