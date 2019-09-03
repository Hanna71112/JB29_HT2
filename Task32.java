package by.htp.les03.main;
// Написать программу, которая по заданным трем числам определяет,
//является ли сумма каких-либо двух из них положительной.  


import java.util.Scanner;

public class Task32 {
	
public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
     System.out.print("Введите 1 число: ");
     int a = in.nextInt();
     System.out.print("Введите 2 число: ");
     int b = in.nextInt();
     System.out.print("Введите 3 число: ");
     int c = in.nextInt();
  
       if  (a+b<0 && a+c<0 && c+b<0) {
     
    	 System.out.println("все суммы отрицательны");}
     else  System.out.println("сумма каких-либо двух цифр положительна");
}}
    