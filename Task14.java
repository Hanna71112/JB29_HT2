package by.htp.les03.main;
// Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным

public class Task14 {
	
public static void main(String[] args) {
	int a = 170;
	int b = 45;
     int c = 180 - a - b;
    if (a+b < 180) 
    	{
    	System.out.println("треугольник существует"); 
    	
    if (a == 90 || b == 90 || c ==90)
       	System.out.println("треугольник прямоугольный"); 

    else 
    	System.out.println("треугольник НЕ прямоугольный"); }
  
    else 	
    	System.out.println("треугольник не существует");
} } 

