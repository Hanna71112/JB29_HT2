package by.htp.les03.main;
// Вычислить число и месяц в невисокосном году по номеру дня

import java.util.Random;
import java.util.Scanner;

public class Task35 {
	
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
     System.out.print("Введите номер дня: ");
     int n = in.nextInt();
  	  if (n<0 || n>365)     {
	  	 System.out.println("не существует");}
  if (n >0 && n<=31   ) {
         	 System.out.println(n+" января");}
  n = n-31;
  if (n >0 && n<=28   ) {
		 System.out.println(n+" февраля");}
  n = n-28;
  if (n >0 && n<=31   ) {
	  	 System.out.println(n+" марта");}
  n = n-31;
   if (n >0 && n<=30   ) {
	  	 System.out.println(n+" апреля");}
   n = n-30;
   if (n >0 && n<=31   ) {
	  	 System.out.println(n+" мая");}
   n = n-31;
   if (n >0 && n<=30   ) {
	  	 System.out.println(n+" июня");}
   n = n-30;
   if (n >0 && n<=31   ) {
	  	 System.out.println(n+" июля");}
   n = n-31;
   if (n >0 && n<=30   ) {
	  	 System.out.println(n+" августа");}
   n = n-30;
   if (n >=0 && n<=31   ) {
	  	 System.out.println(n+" сентября");}
   n = n-31;
   if (n >0 && n<=31   ) {
	  	 System.out.println(n+" октября");}
   n = n-31;
   if (n >0 && n<=30   ) {
	  	 System.out.println(n+" ноября");}
   n = n-30;
   if (n >0 && n<=31  ) {
	   	  	 System.out.println(n+" декабря");}
 
}
}