package by.htp.les03.main;
//Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no». 
import java.util.Scanner;
public class Task03 {
	
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
     System.out.print("Input a number: ");
     int a = in.nextInt();
	 int y = 3;
 if (a<y)
 { 
	 System.out.println("yes"); 
 }
 else 
 System.out.println("no"); 
 
	}
}