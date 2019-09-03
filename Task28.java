package by.htp.les03.main;
//Даны три числа a, b, с. Определить, какое из них равно d. 
//Если ни одно не равно d, то найти max(d — a, d — b, d —c). 

import java.util.Scanner;

public class Task28 {
	
public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
     System.out.print("Введите число А: ");
     int a = in.nextInt();
     System.out.print("Введите число B: ");
     int b = in.nextInt();
     System.out.print("Введите число C: ");
     int c = in.nextInt();
     int d = 5;
     
     int t = 0;
     int t1 = 0;
     int t2;
     if (a == d )
    	  {  System.out.print(" a равно d ");
     }
     if (b == d )
	  {  System.out.print(" b равно d ");
}
     if (c == d )
	  {  System.out.print(" c равно d ");
}
     if (a != d && b!=d&&c!=d)
     {
    	t = d-a;
    	t1 = d-b;
    	t2 = d-c; {
    	 if (t>t1 && t>t2)
    	 { System.out.print(t);     	}
    	 if (t1>t && t1>t2)
    	 { System.out.print(t1);     	}
    	 if (t2>t1 && t2>t)
    	 { System.out.print(t2);     	}
}}
}}