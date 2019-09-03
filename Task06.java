package by.htp.les03.main;
// Составить программу: определения наибольшего из двух чисел а и b. 
import java.util.Scanner;
public class Task06 {
	
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
     System.out.print("Input a: ");
     int a = in.nextInt();
     System.out.print("Input b: ");
     int b = in.nextInt();
 if (a>b)
 { 
	 System.out.println(a +" more then " +b); 
 }
 else if (b>a) {

 System.out.println(b +" more then " +a); 
 	}
 else if (a==b)
	 System.out.println(a +" equal " +b); 
}}