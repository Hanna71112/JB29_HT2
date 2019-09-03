package by.htp.les03.main;
//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.  

import java.util.Scanner;

public class Task29 {
	
public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
     System.out.print("Введите точку А: ");
     int x1 = in.nextInt();
     int y1 = in.nextInt();
     System.out.print("Введите точку B: ");
     int x2 = in.nextInt();
     int y2 = in.nextInt();
     System.out.print("Введите точку C: ");
     int x3 = in.nextInt();
     int y3 = in.nextInt();
   
     if ((y3-y1)/(y2-y1) == (x3-x1)/(x2-x1) ) 
    	  {  System.out.print(" А B C расположены на одной прямой ");
     }
     else
    	 System.out.print(" А B C НЕ расположены на одной прямой ");}}
    