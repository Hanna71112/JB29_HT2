package by.htp.les03.main;
//Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х 
import java.util.Scanner;
public class Task07 {
	
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
     System.out.print("Input a: ");
     int a = in.nextInt();
     System.out.print("Input b: ");
     int b = in.nextInt();
     System.out.print("Input c: ");
     int c = in.nextInt();
     System.out.print("Input x: ");
     int x = in.nextInt();

     double res = a*x*x + b*x + c;
     
 	double D = Math.pow(b, 2) - 4*a*c;
 	if (res < 0)
 	{
 		System.out.println(Math.abs(res));}
 	else if (D < 0) {
 		
  System.out.println("kornei net");}
 	else if (D==0)
 	{
 		x = (-b)/2 * a;
 		 System.out.println("x= "+x);}
 	else if (D > 0){
 		//x = (-b + Math.sqrt(D))/(2 * a);
 	//	x2 = (-b - Math.sqrt(D))/(2 * a);


 	}}}