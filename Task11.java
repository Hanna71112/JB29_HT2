package by.htp.les03.main;
//Составить программу, которая определит площадь какого треугольника больше.
import java.util.Scanner;
public class Task11 {
	
public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
     System.out.print("Input a the 1st triangle: ");
     double a = in.nextInt();
     System.out.print("Input h the 1st triangle: ");
     double h = in.nextInt();
     System.out.print("Input a1 the 2nd triangle: ");
     double a1 = in.nextInt();
     System.out.print("Input h1 the 2nd triangle: ");
     double h1 = in.nextInt();
        double S1 = a/2*h;
        double S2 = a1/2*h1;
        System.out.println(S1+ ""+ S2);
        
     	if (S1 > S2)
     	{
     		System.out.println("S 1st is more then 2nd");}
     	else if (S2 > S1)
     	{
     		System.out.println("S 2nd is more then 1st");}
     	else
      System.out.println("S 1st = S  2nd");}
    }