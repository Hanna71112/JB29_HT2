package by.htp.les03.main;
// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
//Определить, пройдет ли кирпич через отверстие. 

import java.util.Scanner;

public class Task31 {
	
public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
     System.out.print("Введите длину отверстия А: ");
     int a = in.nextInt();
     System.out.print("Введите высоту отверстия В: ");
     int b = in.nextInt();
     System.out.print("Введите длину кирпича x: ");
     int x = in.nextInt();
     System.out.print("Введите высоту кирпича y: ");
     int y = in.nextInt();
     System.out.print("Введите ширину кирпича z: ");
     int z= in.nextInt();
  
     if ((x<=a && y<=b) || (y<=a && x<=b) || (z<=a && y<=b) ||(y<=a && z<=b)) 
    	  {  System.out.println("Кирпич пройдет через отверстие");
     }
     else 
    	 System.out.println("Кирпич НЕ пройдет через отверстие");
}}
    