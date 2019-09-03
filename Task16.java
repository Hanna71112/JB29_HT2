package by.htp.les03.main;
//На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком координатном угле).

public class Task16 {
	
public static void main(String[] args) {
	double x = -1;
	double y = -1;

    if (x == 0 & y == 0) 
    {
    	System.out.println("A в начале координат"); }
    	
    	if (x ==0 & y !=0) 
    	
    		System.out.println("A на y оси");
    	
    	 if (y ==0 & x !=0) 
    	
    		System.out.println("A на x оси");
    	 
    	 if (y > 0 & x > 0) 
    			System.out.println("A в I угле");
    	 
    	 if (x > 0 & y < 0) 
    	
    		System.out.println("A в IV угле");
    	 
    	 if (x < 0 & y > 0) 
    	
    		System.out.println("A вo II угле");
    	 
    	 if (x < 0 & y < 0) 
    	
    		System.out.println("A в III угле");
} }

