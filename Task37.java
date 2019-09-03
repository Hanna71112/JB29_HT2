package by.htp.les03.main;
// Вычислить значение функции: 

import java.util.Scanner;

public class Task37 {
	
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
     System.out.print("Введите x: ");
     int x = in.nextInt();
	double F;
	
  	  if (x<3)     {
  		  F = 1/(Math.pow(x, 3)-6);
	  	 System.out.println("F = "+F);}
  if (x>=3 ) {
	  F = (Math.pow(-x, 2)+3*x+9);
         	 System.out.println("F = "+F);}
  
}
}