package variables;

public class Methods {
	
	
	    int year;
	    int num;

	    // Leap Year Method
	    static void leapyear(int year) {
	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            System.out.println(year + " is a Leap Year");
	        } else {
	            System.out.println(year + " is Not a Leap Year");
	        }
	    }

	    // Odd/Even Method
	    static void oddeven(int num) {
	        if (num % 2 == 0) {
	            System.out.println(num + " is Even");
	        } else {
	            System.out.println(num + " is Odd");
	        }
	    }

	    // Prime Method
	    static void prime(int a) {
	        

	        if (a <= 1) {
	            
	        } 
	            for (int i = 2; i <= a / 2; i++) {
	                if (a % i == 0) {
	                    
	                }
	            }
	            System.out.println(a + " is Prime Number");
        } 
    

    public static void main(String[] args) {

        Methods obj = new Methods();

        obj.year = 2026;
        obj.num = 7;

        // Calling all methods
        leapyear(obj.year);
        oddeven(obj.num);
        prime(obj.num);
    }
    }
    
	        

	       
	        
	