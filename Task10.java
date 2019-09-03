package by.htp.les03.main;
//Составить программу, которая определит площадь какого круга меньше. 
import java.util.Scanner;
public class Task10 {
	
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
     System.out.print("Input the first circle radius: ");
     int r = in.nextInt();
     System.out.print("Input the second circle radius: ");
     int R = in.nextInt();
        double s1 = Math.pow(r, 2) * Math.PI;
        double s2 = Math.pow(R, 2) * Math.PI;
 	if (s1 < s2)
 	{
 		System.out.println("S first circle is less");}
 	else if (s1 > s2)
 	{
 		System.out.println("S second circle is less");}
 	else
  System.out.println("S first circle = S second circle");}
}