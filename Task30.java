package by.htp.les03.main;
//Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, 
//и заменить их абсолютными значениями, если это не так. 
 

import java.util.Scanner;

public class Task30 {
	
public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
     System.out.print("Введите a: ");
     double a = in.nextInt();
     System.out.print("Введите b: ");
     double b = in.nextInt();
     System.out.print("Введите c: ");
     double c = in.nextInt();
  
     if (a>b && b>c) 
    	  {  System.out.println((int)Math.pow(a, 2)+"  "+ (int)Math.pow(b, 2)+"  "+ (int)Math.pow(c, 2));
     }
     else {
    	 a = Math.abs(a);
     b = Math.abs(b);
     c = Math.abs(c);
    	 System.out.print((int)a +"  "+(int)b+"  " +(int)c);}}}
    