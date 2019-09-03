package by.htp.les03.main;
//Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним. 
import java.util.Scanner;
public class Task09 {
	
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
     System.out.print("Input a: ");
     int a = in.nextInt();
     System.out.print("Input b: ");
     int b = in.nextInt();
     System.out.print("Input c: ");
     int c = in.nextInt();
     
 	if (a ==b & a==c & b==c)
 	{
 		System.out.println("treygolnik ravnostoronniy");}
 	else 
 		
  System.out.println("treygolnik NE ravnostoronniy");}
}