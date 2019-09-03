package by.htp.les03.main;
//Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер запрашивает
//стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране «спасибо»; 
//если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если денег недостаточно, 
//то печатает сообщение об этом и указывает размер недостающей суммы. 


import java.util.Random;
import java.util.Scanner;

public class Task34 {
	
public static void main(String[] args) {
	int x, res;
	 Scanner in = new Scanner(System.in);
	 Random rand = new Random();
	 x = rand.nextInt(100);
	 System.out.println("Стоимость книги: " + x);
	 
     System.out.print("Введите сумму: ");
     int s = in.nextInt();
     
  if (s>x) {
     res = s - x;
    	 System.out.println("возьмите сдачу: " + res);}
  
  else if (x>s) {
     res = x - s;
    	 System.out.println("недостающая сумма: " + res);}
	     
      else  {System.out.println("спасибо!");}
}}