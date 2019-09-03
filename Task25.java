package by.htp.les03.main;
//Написать программу — модель анализа пожарного датчика в помещении, 
//которая выводит сообщение «Пожароопасная ситуация », если температура в комнате превысила 60° С. 


import java.util.Scanner;

public class Task25 {
	
public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);
     System.out.print("Введите кол-во градусов: ");
     int t = in.nextInt();
     
     if (t>60)
     {
    	  System.out.print("Пожароопасная ситуация"); 
     }
     
      	
}
}