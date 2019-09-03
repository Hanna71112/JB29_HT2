package by.htp.les03.main;
// Вычислить значение функции: 

import java.util.Scanner;

public class Task40 {
	
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
     System.out.print("Введите x: ");
     double x = in.nextInt();
	double F;
	
	  if (x>13)     {
  		  F = -1*(3/(x+1));
	  	 System.out.println("F = "+F);}
  if (x<=13 ) {
	  F = (Math.pow(-x, 3)+9);
         	 System.out.println("F = "+F);}
  
}
}