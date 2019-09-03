package by.htp.les03.main;
//Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12).
//Если введены некорректные данные, то сообщить об этом. 

import java.util.Scanner;

public class Task23 {
	
public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
     System.out.print("Введите число: ");
     int a = in.nextInt();
     System.out.print("Введите месяц: ");
     int b = in.nextInt();
     
     if ((a >= 1 && a <=31) && (b >= 1 && b <=12))
     {
    	  System.out.print("Дата верная"); 
     }
     
    else 
    	System.out.println("Дата неверная"); 
	
    	
}
}