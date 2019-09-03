package by.htp.les03.main;
// Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат. 

public class Task13 {
	
public static void main(String[] args) {
	int x1 = 2;
	int y1 = 7;
	int x2 = 2;
	int y2 = 2;
    double A = Math.sqrt((Math.pow(x1, 2))+(Math.pow(y1, 2)));
    double B = Math.sqrt((Math.pow(x2, 2))+(Math.pow(y2, 2)));
    
    if (A < B) 
    	{
    	System.out.println("A ближе");
    	}
    
    else if (A > B) 
    	System.out.println("B ближе");
  
    else 	
    	System.out.println("A и B одинаковы");
}}