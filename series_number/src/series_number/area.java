package series_number;
import java.util.Scanner;
public class area{
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.println("1.Circle  2.Rectangle  3.Square");
	    System.out.print("Choose option: ");
	    int choice = sc.nextInt();

	    switch(choice) {

	        case 1:
	            System.out.print("Enter radius: ");
	            double r = sc.nextDouble();
	            System.out.println("Area = " + (Math.PI * r * r));
	            break;

	        case 2:
	            System.out.print("Enter length and width: ");
	            double l = sc.nextDouble();
	            double w = sc.nextDouble();
	            System.out.println("Area = " + (l * w));
	            break;

	        case 3:
	        	System.out.print("Enter side: ");
	            double s = sc.nextDouble();
	            System.out.println("Area = " + (s * s));
	            break;

	        default:
	            System.out.println("Invalid choice");
	    }
	}
	}

	            