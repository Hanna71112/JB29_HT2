package by.htp.les03.main;
// Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.

public class Task15 {
	
public static void main(String[] args) {
	double x = 20;
	double y = 10;
	double a = x+y;
	double b = x*y;
    if (x != y) 
    {
    	if (x < y) 
    	{
    	x = a/2;
    	y = b*2;
    	System.out.println("x = "+x); 
    	System.out.println("y = "+y);  }
    	else if (x > y) 
	{
    		y = a/2;
        	x = b*2;
        	System.out.println("x = "+x); 
        	System.out.println("y = "+y);}
    else 	
    	System.out.println("x не должен быть равен y");
} }}

