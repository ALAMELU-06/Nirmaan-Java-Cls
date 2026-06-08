package electricity_bill;
import java.util.Scanner;
public class electricity_bill_house {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill=0;
        System.out.println("=======Electricity bill gendration system ==========");
        System.out.println("enter 1 for house bill:");
        System.out.println("enter 2 for commercial bill:");
        System.out.println("enter 3 for government bill:");
        int option = sc.nextInt();
        switch (option) {
        case 1:
        	System.out.println("enter your house unit:");
          	int unithouse=sc.nextInt();
        	bill =unithouse*5;
        	System.out.println("Your Bill Ready ");
        	System.out.println("bill value: "+bill);
        	break;
        case 2:
        	System.out.println("enter the commercial unit:");
        	int unitcomm=sc.nextInt();
        	bill = unitcomm*7;
        	System.out.println("Your Bill Ready ");
        	System.out.println("bill value: "+bill);
        	break;
        case 3:
        	System.out.println("enter the government unit:");
        	int unitgov = sc.nextInt();
        	bill = unitgov*11;
        	System.out.println("Your Bill Ready ");
        	System.out.println("bill value: "+bill);
        	break;
        	
        	
        	
        }
        
        

    }
}
	

	
	    