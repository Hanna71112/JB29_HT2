package by.htp.les03.main;
//Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему из исходных, а если равны, то заменить числа нулями. 

public class Task17 {
	
public static void main(String[] args) {
	double x = -1;
	double y = 1;

    if (x == 0 && y == 0) 
    {
    	System.out.println("A в начале координат"); }
    	
    	if (x ==0 && y !=0) {
    	
    		System.out.println("A на y оси");}
    	
    	 if (y ==0 && x !=0) {
    	
    		System.out.println("A на x оси");}
    	 
    	 if (y > 0 && x > 0) {
    			System.out.println("A в I угле");}
    	 
    	 if (x > 0 && y < 0) {
    	
    		System.out.println("A в IV угле");}
    	 
    	 if (x < 0 && y > 0) 
    	 {
    		System.out.println("A вo II угле"); }
    	 
    	 else {
    	
    		System.out.println("A в III угле");}
} }

