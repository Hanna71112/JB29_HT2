package by.htp.les03.main;
//Составить программу нахождения наименьшего из квадратов двух чисел а и b. 
import java.util.Scanner;
public class Task08 {
	
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
     System.out.print("Input a: ");
     int a = in.nextInt();
     System.out.print("Input b: ");
     int b = in.nextInt();
     

 	if (a*a < b*b)
 	{
 		System.out.println(a*a + " less then " + b*b);}
 	else if (a*a > b*b) {
 		
  System.out.println(b*b + " less then " + a*a);}
 	else if (a*a == b*b)
 	{
 	
 		 System.out.println(b*b + " equal " + a*a);}
}}