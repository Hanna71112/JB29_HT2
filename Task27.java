package by.htp.les03.main;
// Найти max{min(a, b), min(c, d)}. 

import java.util.Scanner;

public class Task27 {
	
public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
     System.out.print("Введите число А: ");
     int a = in.nextInt();
     System.out.print("Введите число B: ");
     int b = in.nextInt();
     System.out.print("Введите число C: ");
     int c = in.nextInt();
     System.out.print("Введите число D: ");
     int d = in.nextInt();
     
     int t = 0;
     int t1 = 0;
     if (a == b || a == c || b ==c)
     {  System.out.print("числа не должны быть равны");
     }
     if (a<b)
     {
    	t = a;    }
     
     if (b<a)
     {
    	t = b;      }
     if (c<d)
     {
    	t1 = c;      }
     if (d<c)
     {
    	t1 = d;      }
     if (t>t1)
     {
    	 System.out.print("Большее число: "+t);  }
    	 else {
    		 System.out.print("Большее число: "+t1); }
    
}
}
