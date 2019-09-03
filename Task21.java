package by.htp.les03.main;
//Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». 
//В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!». 

import java.util.Scanner;

public class Task21 {
	
public static void main(String[] args) {
	//char x;
	System.out.println("«Кто ты: мальчик или девочка? Введи Д или М»");  
	 
	Scanner in = new Scanner(System.in);
	System.out.print("Ответ: ");
	char x = in.next().charAt(0);
	
    
    if (x == 'd' || x == 'D')
    { System.out.println("Мне нравятся девочки!");  
    }	
    if (x == 'M' || x == 'm')
    { System.out.println("Мне нравятся мальчики!");  
    }	}}
	