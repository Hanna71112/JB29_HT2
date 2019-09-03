package by.htp.les03.main;
// Написать программу нахождения суммы большего и меньшего из трех чисел. 


import java.util.Scanner;

public class Task26 {
	
public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
     System.out.print("Введите число А: ");
     int a = in.nextInt();
     System.out.print("Введите число B: ");
     int b = in.nextInt();
     System.out.print("Введите число C: ");
     int c = in.nextInt();
     int t = 0;
     int t1 = 0;
     if (a == b || a == c || b ==c)
     {  System.out.print("числа не должны быть равны");
     }
     if (a<b && a<c)
     {
    	t = a;      }
     
     if (b<a && b<c)
     {
    	t = b;      }
     if (c<b && c<a)
     {
    	t = c;      }
     if (a>b && a>c)
     {
    	t1 = a;;      }
     
     if (b>a && b>c)
     {
    	t1 = b;      }
     if (c>b && c>a)
     {
    	t1 = c;  }   
     System.out.print(t+t1); }
     
}
