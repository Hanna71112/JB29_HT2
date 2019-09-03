package by.htp.les03.main;
// Составить программу, определяющую результат гадания на ромашке — «любит—не любит»,
//взяв за исходное данное количество лепестков п. 


import java.util.Scanner;

public class Task24 {
	
public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
     System.out.print("Введите число: ");
     int n = in.nextInt();
     
     if (n%2 == 0)
     {
    	  System.out.print("Не любит"); 
     }
     
    else 
    	System.out.println("Любит"); 
	
    	
}
}