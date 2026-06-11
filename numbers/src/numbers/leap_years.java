package numbers;
import java.util.Scanner;
public class leap_years {
	public static void main(String[]args) {
		int year;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year:");
        year = sc.nextInt();

        
        if ((year % 4 == 0 && year % 100 != 0)){
        	System.out.println(year + "  Leap Year");
        }

        else {
            
            System.out.println(year + "  Non - Leap Year");
        }
    }
}
        
        	
             

            
            